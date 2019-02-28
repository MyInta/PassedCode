package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.awt.List;

public class Test01 {
	public static void main(String[] args) {
		Collection list = new ArrayList(); 
		//ArrayList底层实现是数组，线程不安全，效率高。所以查询快，修改、删除、插入慢。
		//LinkList底层实现是链表，线程不安全，效率高。所以查询慢，修改、插入、删除快。
		//Vector:线程安全，效率低。
		
		list.add("aaaa");
		list.add("aaaa");
		list.add(new Date());
		list.add(new Dog());
		list.add(1234);	//包装类的，自动装箱。
		list.remove("aaaa");
		((ArrayList) list).set(3,new String("3333"));
		
		System.out.println(list.size());
	
//		System.out.println(list.isEmpty());
//		
//		Collection list2 = new ArrayList();
//		list2.add("bbb");
//		list2.add("ccc");
//		
//		list.addAll(list2);
//		System.out.println(list.size());
	}
	
}
class Dog{
	
}
