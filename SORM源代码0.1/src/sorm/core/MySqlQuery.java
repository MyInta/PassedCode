package sorm.core;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

import po.Emp;
import sorm.bean.ColumnInfo;
import sorm.bean.TableInfo;
import sorm.utils.JDBCUtils;
import sorm.utils.ReflectUtils;
import vo.EmpVO;

/**
 * �������MySQL���ݿ�Ĳ�ѯ
 * @author ����
 *
 */
public class MySqlQuery implements Query{

	public static void testDML() {
		Emp e = new Emp();
		e.setId(7);
		e.setEmpname("test07");
		e.setSalary(40000.00);
		e.setBirthday(new java.sql.Date(System.currentTimeMillis()));
		
		new MySqlQuery().update(e,new String[] {"empname","salary"});
//		new MySqlQuery().delete(e);
//		new MySqlQuery().insert(e);
	}
	
	public static void testQueryRows() {
		List<Emp> list = new MySqlQuery().queryRows("select id,empname,age,salary from emp where age>? and salary>?",
				Emp.class, new Object[] {10,15000.00});
		for(Emp e:list) {
			System.out.println(e.getEmpname()+"--"+e.getAge()+"--"+e.getSalary());
		}
		
		String sql2 = "select e.id,e.empname,e.salary+e.bonus 'xinzi',e.age,d.dname 'deptName',d.address 'deptAddr' from emp e " + 
				"join dept d on e.deptId=d.id";
		List<EmpVO> list2 = new MySqlQuery().queryRows(sql2,EmpVO.class, null);
		
		for(EmpVO e:list2) {
			System.out.println(e.getEmpname()+"-"+e.getDeptAddr()+"-"+e.getDeptName());
		}
	}

	public static void main(String[] args) {
//		Object obj = new MySqlQuery().queryValue("select count(*) from emp where salary>?", new Object[] {10000});
		Number num = new MySqlQuery().queryNumber("select count(*) from emp where salary>?", new Object[] {10000});
		System.out.println(num);
	}
	
	@Override
	public void delete(Class clazz, Object id) {
		//Emp.class,2-->delete from emp where id=2;
		//ͨ��class�����ҵ�TableInfo
		TableInfo tableInfo = TableContext.poClassTableMap.get(clazz);
		//�������
		ColumnInfo onlyPriKey = tableInfo.getOnlyPrikey();
		String sql = "delete from "+tableInfo.getTname()+" where "+onlyPriKey.getName()+"=? ";
		
		executeDML(sql, new Object[] {id});
	}

	@Override
	public void delete(Object obj) {
		Class c = obj.getClass();
		TableInfo tableInfo = TableContext.poClassTableMap.get(c);
		ColumnInfo onlyPriKey = tableInfo.getOnlyPrikey();	//����
		//ͨ��������Ƶ������Զ�ӦGet/Set����
		Object priKeyValue = ReflectUtils.invokeGet(obj, onlyPriKey.getName());
		delete(c, priKeyValue);
		
	}
	
	@Override
	public int executeDML(String sql, Object[] params) {
		Connection conn = DBManager.getConn();
		int count = 0;
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			
			//��sql���
			JDBCUtils.handleParams(ps, params);
//			System.out.println(ps);
			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn,ps);
		}
		
		return count;
	}

	@Override
	public void insert(Object obj) {
		//obj-->���С� insert into ����(id,username,pwd) values(?,?,?)
		Class c = obj.getClass();
		List<Object> params = new ArrayList<Object>();	//�洢sql��������
		TableInfo tableInfo = TableContext.poClassTableMap.get(c);
		StringBuilder sql = new StringBuilder("insert into "+tableInfo.getTname()+" (");
		int countNotNullField = 0;	//���㲻Ϊnull������ֵ
		Field[] fs = c.getDeclaredFields();
		for(Field f:fs) {
			String fieldName = f.getName();
			Object fieldValue = ReflectUtils.invokeGet(obj, fieldName);
			
			if(fieldValue!=null) {
				countNotNullField++;
				sql.append(fieldName+",");
				params.add(fieldValue);
			}
		}
		
		sql.setCharAt(sql.length()-1, ')');
		sql.append(" values (");
		for(int i=0;i<countNotNullField;i++) {
			sql.append("?,");
		}
		sql.setCharAt(sql.length()-1, ')');
		//����toString����Ϊsql��Stringbuilder ������ΪListת������
		executeDML(sql.toString(),params.toArray());	
	}

	@Override
	public int update(Object obj, String[] fieldNames) {
		// update(obj,String[]{"uname","pwd"})-->update ���� set uname=?,pwd=? where id=?
		Class c = obj.getClass();
		List<Object> params = new ArrayList<Object>();	//�洢sql��������
		TableInfo tableInfo = TableContext.poClassTableMap.get(c);
		ColumnInfo priKey = tableInfo.getOnlyPrikey();	//��ȡΨһ������
		StringBuilder sql = new StringBuilder("update "+tableInfo.getTname()+" set ");
		
		for(String fname:fieldNames) {
			Object fvalue = ReflectUtils.invokeGet(obj, fname);
			params.add(fvalue);
			sql.append(fname+"=?,");
		}
		sql.setCharAt(sql.length()-1, ' ');
		sql.append("where ");
		sql.append(priKey.getName()+"=?");
		params.add(ReflectUtils.invokeGet(obj, priKey.getName()));
		return executeDML(sql.toString(),params.toArray());
	}

	@Override
	public List queryRows(String sql, Class clazz, Object[] params) {
		Connection conn = DBManager.getConn();
		List list = null;	//�洢��ѯ���������
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			
			//��sql���
			JDBCUtils.handleParams(ps, params);
//			System.out.println(ps);
			rs = ps.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData();
			//����
			while(rs.next()) {
				if(list==null) {
					list = new ArrayList<>();
				}
				Object rowObj = clazz.newInstance();	//����javabean���޲ι�������
				
				//����	select uname,pwd,age from user where id>? and age>18
				for(int i=0;i<metaData.getColumnCount();i++) {
					String columnName = metaData.getColumnLabel(i+1);	//usename
					Object columnValue = rs.getObject(i+1);
					
					//����rowObj�����setUsername(String uname)��������columnValue��ֵ���ý�ȥ
					ReflectUtils.invokeSet(rowObj, columnName, columnValue);
				}
				
				list.add(rowObj);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn,ps);
		}
		
		return list;
	}

	@Override
	public Object queryUniqueRow(String sql, Class clazz, Object[] params) {
		List list = queryRows(sql,clazz,params);
		return (list!=null&&list.size()>0)?list.get(0):null;
	}

	@Override
	public Number queryNumber(String sql, Object[] params) {
		return (Number) queryValue(sql,params);
	}

	@Override
	public Object queryValue(String sql, Object[] params) {
		Connection conn = DBManager.getConn();
		Object value = null;	//�洢��ѯ����Ķ���
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			//��sql���
			JDBCUtils.handleParams(ps, params);
			rs = ps.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData();
			while(rs.next()) {
				//select count(*) from user;
				value = rs.getObject(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn,ps);
		}
		
		return value;
	}
	
	
}
