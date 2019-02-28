package intaMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 思考：定义一个Student类，属性：name no score分别为名字 班级 成绩
 * 方案：面向对象+分拣存储（1对多）
 * @author 银涛
 *
 */
public class MapDemo03 {
	public static void main(String[] args) {
		//1、考试
		List<Student> stuList = exam();
		//2、分析成绩
		Map<String,ClassRoom> map =count(stuList);
		//3、查看成绩（总分、平均分）
		view(map);
	}
	/**
	 *查看每个班的总分和平均分-->遍历map 
	 */
	public static void view(Map<String,ClassRoom> map){
		Set<String> keys = map.keySet();
		//获取迭代器对象
		Iterator<String> keysIt = keys.iterator();
		//先判断
		while(keysIt.hasNext()){
			//再获取
			String no = keysIt.next();
			ClassRoom room = map.get(no);
			//查看总分，计算平均分
			double total = room.getTotal();
			double avg = total/room.getStuList().size();
			System.out.println(no+"-->"+total+"-->"+avg);
		}
	}
	
	/**
	 *统计分析
	 *1、面向对象
	 *2、分拣存储
	 * 
	 */
	public static Map<String,ClassRoom> count(List<Student> list){
		Map<String,ClassRoom> map = new HashMap<String,ClassRoom>();
		//遍历List
		for(Student stu:list){
			//分拣 查看是否存在该编号班级。
			String no = stu.getNo();	//班级编号
			double score =stu.getScore();//分值
			//如果不存在，创建班级
			ClassRoom room = map.get(no);
			if(null==room){
				room = new ClassRoom(no);
				map.put(no, room);
			}
			//存在，放入学生
			room.getStuList().add(stu);//放入学生
			room.setTotal(room.getTotal()+score);//计算总分
		}
		
		return map;
	}
	/**
	 * 模拟考试 测试数据到List中
	 */
	public static List<Student> exam(){
		List<Student> list = new ArrayList<Student>();
		//存放学生成绩
		list.add(new Student("张三","a",80));
		list.add(new Student("李四","a",80));
		list.add(new Student("王五","a",80));
		list.add(new Student("甲醛","a",80));
		list.add(new Student("乙醇","a",80));
		
		list.add(new Student("赵钱","b",64));
		list.add(new Student("孙俪","b",78));
		list.add(new Student("皇子","b",99));
		list.add(new Student("公主","b",56));
		list.add(new Student("太子","b",93));
		return list;
	}
}
