package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.awt.List;

public class Test01 {
	public static void main(String[] args) {
		Collection list = new ArrayList(); 
		//ArrayList�ײ�ʵ�������飬�̲߳���ȫ��Ч�ʸߡ����Բ�ѯ�죬�޸ġ�ɾ������������
		//LinkList�ײ�ʵ���������̲߳���ȫ��Ч�ʸߡ����Բ�ѯ�����޸ġ����롢ɾ���졣
		//Vector:�̰߳�ȫ��Ч�ʵ͡�
		
		list.add("aaaa");
		list.add("aaaa");
		list.add(new Date());
		list.add(new Dog());
		list.add(1234);	//��װ��ģ��Զ�װ�䡣
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
