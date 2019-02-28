package collection;
/**
 * �Զ���ʵ��Map�Ĺ���
 * �ݲ�������
 * Map��ż�ֵ�ԣ����ݶ����Ҷ�Ӧ�Ķ��󣬼������ظ���
 * @author ����
 *
 */
public class Map001 {
	MyEntry[] arr = new MyEntry[990];
	int size;
	
	public void put(Object key,Object value){
		MyEntry e = new MyEntry(key,value);
		//�����ֵ�ظ�����
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
		m.put("����", new wife("����"));
		m.put("��Ǯ", new wife("��ٳ"));
		m.put("��Ǯ", new wife("����"));
		m.put("��Ǯ", new wife("����"));
		
		wife w = (wife)m.get("��Ǯ");
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