package collection;

import java.util.LinkedList;

/**
 * 自定义Map的升级版
 * 1、提高查询的效率
 * @author 银涛
 *
 */
public class Map002 {
	LinkedList[] arr = new LinkedList[990];
	int size;
	public void put(Object key,Object value){
		MyEntry e = new MyEntry(key,value);
		
		int hash = key.hashCode();	//对hashCode的正负作控制，免得出现负值。
		hash = hash<0?-hash:hash;
		
		int a = hash%arr.length;
		if(arr[a]==null){
			LinkedList list = new LinkedList();
			arr[a]=list;
			list.add(e);
		}else{
			LinkedList list = arr[a];				//覆盖键值对key一样而value不一样的地方
			for(int i=0;i<list.size();i++){
				MyEntry e2 = (MyEntry)list.get(i);
				if(key.equals(e2.key)){
					e2.value= value;
					return;
				}
			}
			arr[a].add(e);
		}
	}
	public Object get(Object key){
		
		int hash = key.hashCode();
		hash = hash<0?-hash:hash;
		
		int a = hash%arr.length;
		if(arr[a]!=null){
			LinkedList list = arr[a];
			for(int i=0;i<list.size();i++){
				MyEntry e = (MyEntry) list.get(i);
				if(key.equals(e.key)){
					return e.value;
				}
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		Map002 m = new Map002();
		m.put("张三", new wife("李四"));
		m.put("赵钱", new wife("孙俪"));
		m.put("赵钱", new wife("二房"));
		m.put("赵钱", new wife("三房"));
		
		wife w = (wife)m.get("赵钱");
		System.out.println(w.name);
	}
}
