package practice03.exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 深入迭代器原理--》一个容器可以创建多个迭代器对象
 * 途径：使用了（匿名）内部类
 * 
 * 深入：
 * 1、使用内部类 实现迭代器
 * 2、使用Iterator 实现foreach迭代
 * 3、加入末尾添加元素的方法
 * 
 * @author 银涛
 *
 */
public class IntaDeepList implements java.lang.Iterable<String> {

	//数组存储值
	private String[] elem=new String[5];
	//实际大小
	private int size=0;
	
	public int size(){
		return this.size;
	}
	/**
	 * 在末尾加入元素
	 * @param ele
	 */
	public void add(String ele){
		if(this.size==elem.length){		//容量不够-->扩容
			elem=Arrays.copyOf(elem, elem.length+5);	
		}
		
		elem[size] = ele;	//往数组 最后 加入元素。
		size++;		//实际大小+1
	}
	
	//内部类
	public class MyIter implements Iterator{
		//计数器--》指针 游标
		private int coursor=-1;
		
		//用于判断是否有下一个
		public boolean hasNext(){
				return coursor+1<size;
		}
		//获取下一个
		public String next(){
			coursor++;
			return elem[coursor];
		}
		//删除下一个
		public void remove(){
			//移动数组元素
			System.arraycopy(elem, coursor+1, elem,
					coursor, /*IntaDeepList.this.*/size-(coursor+1));
			/*IntaDeepList.this.*/size--;	//移除部分后总长度减少
			this.coursor--;		//因为next的时候指标后移了，所以需要进行指针回退
		}
	}
	
	public Iterator iterator1(){
		return new MyIter();
	}
	public Iterator iterator2(){
			class MyIter implements Iterator{
			//计数器--》指针 游标
			private int coursor=-1;
			
			//用于判断是否有下一个
			public boolean hasNext(){
					return coursor+1<size;
			}
			//获取下一个
			public String next(){
				coursor++;
				return elem[coursor];
			}
			//删除下一个
			public void remove(){
				//移动数组元素
				System.arraycopy(elem, coursor+1, elem,
						coursor, /*IntaDeepList.this.*/size-(coursor+1));
				/*IntaDeepList.this.*/size--;	//移除部分后总长度减少
				this.coursor--;		//因为next的时候指标后移了，所以需要进行指针回退
			}
		}
			return new MyIter();
	}
	
	public Iterator iterator(){
		return new Iterator(){		//创建迭代器接口 实现类（没有名称）的对象
				//计数器--》指针 游标
				private int coursor=-1;
				
				//用于判断是否有下一个
				public boolean hasNext(){
						return coursor+1<size;
				}
				//获取下一个
				public String next(){
					coursor++;
					return elem[coursor];
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
		IntaDeepList list = new IntaDeepList();
		list.add("a");
		list.add("b");
		list.add("c1");
		list.add("c2");
		list.add("c3");
		list.add("c4");
		list.add("c5");
		Iterator it = list.iterator();
		while(it.hasNext()){		//先判断后获取
			System.out.println(it.next());
//			it.remove();
		}
		System.out.println(list.size);
		System.out.println("-------------------");
		for(String str:list){
			System.out.println(str);
		}
//		System.out.println("-------------------");
//		it = list.iterator();
//		while(it.hasNext()){		//先判断后获取
//			System.out.println(it.next());
//		}
		System.out.println("-------------------2");
		ArrayList list2 = new ArrayList();
		list2.add("a");
		list2.add("a");
		list2.add("a");
		for(Object obj:list2){		//增强for循环foreach。
			System.out.println(obj);
		}
	}

}
