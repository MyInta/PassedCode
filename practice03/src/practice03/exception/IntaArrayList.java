package practice03.exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 使用泛型，可以操作多个类型
 * 
 * 
 * 
 * 
 * 
 * @author 银涛
 *
 */
public class IntaArrayList<E> implements java.lang.Iterable<E> {

	//数组存储值
	private Object[] elem=new Object[5];
	//实际大小
	private int size=0;
	
	public int size(){
		return this.size;
	}
	/**
	 * 在末尾加入元素
	 * @param ele
	 */
	public void add(E ele){
		if(this.size==elem.length){		//容量不够-->扩容
			elem=Arrays.copyOf(elem, elem.length+5);	
		}
		
		elem[size] = ele;	//往数组 最后 加入元素。
		size++;		//实际大小+1
	}
	
	
	
	
	public Iterator<E> iterator(){
		return new Iterator<E>(){		//创建迭代器接口 实现类（没有名称）的对象
				//计数器--》指针 游标
				private int coursor=-1;
				
				//用于判断是否有下一个
				public boolean hasNext(){
						return coursor+1<size;
				}
				//获取下一个
				public E next(){
					coursor++;
					return (E)elem[coursor];
				}
				//删除下一个
				public void remove(){
					//移动数组元素
					System.arraycopy(elem, coursor+1, elem,
							coursor, /*IntaDeepList.this.*/size-(coursor+1));
					/*IntaDeepList.this.*/size--;	//移除部分后总长度减少
					this.coursor--;		//因为next的时候指标后移了，所以需要进行指针回退
				}
		};		//分号表示语句的结束。
	}
	
	
	public static void main(String[] args) {
		IntaArrayList<Integer> list = new IntaArrayList<Integer>();
		list.add(1);		//int-->Integer
		list.add(2);
		for(Integer e:list){
			System.out.println(e);
		}
		System.out.println("------------------");
		IntaArrayList<String> list2 = new IntaArrayList<String>();
		list2.add("喜");		//int-->Integer
		list2.add("欢");
		list2.add("你");
		
		Iterator<String> it = list2.iterator();
		while(it.hasNext()){
			String e = it.next();
			System.out.print(e);
		}
	}

}
