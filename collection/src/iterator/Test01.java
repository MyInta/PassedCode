package iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 迭代器的使用
 * @author 银涛
 *
 */
public class Test01 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		//通过索引遍历List
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
			
		}
		//通过迭代器遍历List
		for(Iterator itr2 = list.iterator();itr2.hasNext();){
			String str =(String)itr2.next();
				System.out.println(str);
				itr2.remove();
			}
		System.out.println(list.size()+"******************");
		
		Set set = new HashSet();	//因为Set无序，所以不能使用索引遍历
		set.add("高1");
		set.add("高2");
		set.add("高3");
			//通过迭代器遍历Set
		//Iterator itr = set.iterator();
		//while(itr.hasNext()){
		for(Iterator itr = set.iterator();itr.hasNext();){
		String str =(String)itr.next();
			System.out.println(str);
		}
		
	}
	
	
	
}
