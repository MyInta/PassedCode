package collection;
/**
 * 自定义实现Map的功能
 * 暂不完美！
 * Map存放键值对，根据对象找对应的对象，键不能重复！
 * @author 银涛
 *
 */
public class Map001 {
	MyEntry[] arr = new MyEntry[990];
	int size;
	
	public void put(Object key,Object value){
		MyEntry e = new MyEntry(key,value);
		//解决键值重复问题
		for(int i=0;i<size;i++){
			if(key.equals(arr[i].key)){
				arr[i].value = value;
				return;
			}
		}
		arr[size++] = e;
				
	}
	
	public Object get(Object key){
		for(int i=0;i<size;i++){
			if(key.equals(arr[i].key)){
				return arr[i].value;
			}
		}
		return null;
	}
	public boolean containsKey(Object key){
		for(int i=0;i<size;i++){
			if(key.equals(arr[i].key)){
				return true;
			}
		}
		return false;
	}
	public boolean containsValue(Object value){
		for(int i=0;i<size;i++){
			if(value.equals(arr[i].value)){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Map001 m = new Map001();
		m.put("张三", new wife("李四"));
		m.put("赵钱", new wife("孙俪"));
		m.put("赵钱", new wife("二房"));
		m.put("赵钱", new wife("三房"));
		
		wife w = (wife)m.get("赵钱");
		System.out.println(w.name);
	}
}
class MyEntry{
	Object key;
	Object value;
	public MyEntry(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}
	
}