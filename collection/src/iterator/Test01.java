package iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * ��������ʹ��
 * @author ����
 *
 */
public class Test01 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		//ͨ����������List
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
			
		}
		//ͨ������������List
		for(Iterator itr2 = list.iterator();itr2.hasNext();){
			String str =(String)itr2.next();
				System.out.println(str);
				itr2.remove();
			}
		System.out.println(list.size()+"******************");
		
		Set set = new HashSet();	//��ΪSet�������Բ���ʹ����������
		set.add("��1");
		set.add("��2");
		set.add("��3");
			//ͨ������������Set
		//Iterator itr = set.iterator();
		//while(itr.hasNext()){
		for(Iterator itr = set.iterator();itr.hasNext();){
		String str =(String)itr.next();
			System.out.println(str);
		}
		
	}
	
	
	
}
