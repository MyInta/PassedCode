package collection;

import java.util.LinkedList;

/**
 * �Զ���Map��������
 * 1����߲�ѯ��Ч��
 * @author ����
 *
 */
public class Map002 {
	LinkedList[] arr = new LinkedList[990];
	int size;
	public void put(Object key,Object value){
		MyEntry e = new MyEntry(key,value);
		
		int hash = key.hashCode();	//��hashCode�����������ƣ���ó��ָ�ֵ��
		hash = hash<0?-hash:hash;
		
		int a = hash%arr.length;
		if(arr[a]==null){
			LinkedList list = new LinkedList();
			arr[a]=list;
			list.add(e);
		}else{
			LinkedList list = arr[a];				//���Ǽ�ֵ��keyһ����value��һ���ĵط�
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
		m.put("����", new wife("����"));
		m.put("��Ǯ", new wife("��ٳ"));
		m.put("��Ǯ", new wife("����"));
		m.put("��Ǯ", new wife("����"));
		
		wife w = (wife)m.get("��Ǯ");
		System.out.println(w.name);
	}
}
