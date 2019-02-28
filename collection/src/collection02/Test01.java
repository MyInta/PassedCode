package collection02;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	
	public static void main(String[] args) {
		//一个对象对应一个记录！
		Employee e = new Employee(030105,"Inta",30000,"项目部","2019-09");
		Employee e2 = new Employee(030106,"Lily",40000,"教学部","2018-09");
		Employee e3 = new Employee(030107,"Katte",50000,"管理部","2017-09");
		
		List <Employee> list = new ArrayList<Employee> ();
		list.add(e);
		list.add(e2);
		list.add(e3);
		
		printEmployeeName(list);
		
	}
	public static void printEmployeeName(List<Employee> list){
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getName());
		}
	}
	
}
