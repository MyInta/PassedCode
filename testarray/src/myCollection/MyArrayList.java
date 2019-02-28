package myCollection;
/**
 * 模拟JDK里的ArrayList类
 * @author 银涛
 *
 */
public class MyArrayList {
	StringBuilder	s;
    /**
     * The value is used for object storage.
     */
	private Object[] value;

    /**
     * The size is the number of object used.
     */
	private int size;
    
    public MyArrayList(){
    //	value = new Object[16];
    	this(16);
    }
    public MyArrayList(int size){
    	value = new Object[size];
    }
    
    public int size(){
    	return size;
    }
    
    public void add(Object obj){
    	value[size] = obj;
    	size++;
    	if(size>=value.length){
    		//装不下了，扩容吧！
    		int newCapacity = value.length*2;
    		Object[] newList = new Object [newCapacity];
    		//	System.arraycopy(src, srcPos, dest, destPos, length);
    		for(int i=0;i<value.length;i++){
    			newList[i]= value[i];
    		}
    		
    		value = newList;
    	}
    }
    
    public Object get(int index){
    	if(index<0||index>size-1){		//[0,size-1]
    		try {
				throw new Exception();	//手动抛出一个异常
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	return value[index];
    }
    
    public static void main(String[] args) {
		MyArrayList list = new MyArrayList(2);
		list.add("aaa");
		list.add(new Human("Inta"));
		list.add("bbb");
		list.add("bbb");
		list.add("bbb");
		list.add("bbb");
		Human h = (Human) list.get(1);
		System.out.println(h.getName());
		
		//	System.out.println(list.get(2));
		System.out.println(list.size());
	}
}
