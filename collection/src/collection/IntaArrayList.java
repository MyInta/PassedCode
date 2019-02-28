package collection;

import java.util.List;

/**
 * �Լ�ʵ��һ��ArrayList,�������Ǹ��õ����ArrayList��ĵײ�ṹ��
 * @author ����
 *
 */
public class IntaArrayList {
	private Object[] elementDate;
	private int size;
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return size ==0;
	}
	public IntaArrayList(){
		this(10);
	}
	public IntaArrayList(int initialCapacity){
		if(initialCapacity<0){
			try{
				throw new Exception();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		elementDate = new Object[initialCapacity];
	}
	
	public void add(Object obj){
		//��������
		ensureCapacity();	//��������
		elementDate[size++] = obj;
	}
	public void ensureCapacity(){
		if(size==elementDate.length){
			Object[] newArray = new Object[size*2+1];
			System.arraycopy(elementDate, 0, newArray, 0, elementDate.length);
//			for(int i =0;i<elementDate.length;i++){
//				newArray[i] = elementDate[i];
//			}
			elementDate = newArray;
		}
		
	}
	public Object get(int index){
		rangeCheck(index);
		return elementDate[index];
	}
	
	public Object set(int index,Object obj){
		rangeCheck(index);
		
		Object oldValue = elementDate[index];
		elementDate[index] = obj;
		return oldValue;
		
	}
	
	public void remove(int index){
		rangeCheck(index);
		//ɾ��ָ��λ�õĶ���
		int numMoved = size - index - 1;
		if(numMoved>0){
			System.arraycopy(elementDate, index+1, elementDate, index,
					numMoved);
		}
		elementDate[--size] = null;
	}
	
	public void remove(Object obj){

	}
	
	private void rangeCheck(int index){
		if(index<0||index>=size){
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		IntaArrayList list = new IntaArrayList(3);
		list.add("333");
		list.add("444");
		list.add("5");
		list.add("33344");
		list.add("333");
		list.add("333");
		System.out.println(list.size);
		System.out.println(list.get(5));	//	������1��ʼ��������������0��ʼ
	}
}
