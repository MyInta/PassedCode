package practice03.exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * ���������ԭ��--��һ���������Դ����������������
 * ;����ʹ���ˣ��������ڲ���
 * 
 * ���룺
 * 1��ʹ���ڲ��� ʵ�ֵ�����
 * 2��ʹ��Iterator ʵ��foreach����
 * 3������ĩβ���Ԫ�صķ���
 * 
 * @author ����
 *
 */
public class IntaDeepList implements java.lang.Iterable<String> {

	//����洢ֵ
	private String[] elem=new String[5];
	//ʵ�ʴ�С
	private int size=0;
	
	public int size(){
		return this.size;
	}
	/**
	 * ��ĩβ����Ԫ��
	 * @param ele
	 */
	public void add(String ele){
		if(this.size==elem.length){		//��������-->����
			elem=Arrays.copyOf(elem, elem.length+5);	
		}
		
		elem[size] = ele;	//������ ��� ����Ԫ�ء�
		size++;		//ʵ�ʴ�С+1
	}
	
	//�ڲ���
	public class MyIter implements Iterator{
		//������--��ָ�� �α�
		private int coursor=-1;
		
		//�����ж��Ƿ�����һ��
		public boolean hasNext(){
				return coursor+1<size;
		}
		//��ȡ��һ��
		public String next(){
			coursor++;
			return elem[coursor];
		}
		//ɾ����һ��
		public void remove(){
			//�ƶ�����Ԫ��
			System.arraycopy(elem, coursor+1, elem,
					coursor, /*IntaDeepList.this.*/size-(coursor+1));
			/*IntaDeepList.this.*/size--;	//�Ƴ����ֺ��ܳ��ȼ���
			this.coursor--;		//��Ϊnext��ʱ��ָ������ˣ�������Ҫ����ָ�����
		}
	}
	
	public Iterator iterator1(){
		return new MyIter();
	}
	public Iterator iterator2(){
			class MyIter implements Iterator{
			//������--��ָ�� �α�
			private int coursor=-1;
			
			//�����ж��Ƿ�����һ��
			public boolean hasNext(){
					return coursor+1<size;
			}
			//��ȡ��һ��
			public String next(){
				coursor++;
				return elem[coursor];
			}
			//ɾ����һ��
			public void remove(){
				//�ƶ�����Ԫ��
				System.arraycopy(elem, coursor+1, elem,
						coursor, /*IntaDeepList.this.*/size-(coursor+1));
				/*IntaDeepList.this.*/size--;	//�Ƴ����ֺ��ܳ��ȼ���
				this.coursor--;		//��Ϊnext��ʱ��ָ������ˣ�������Ҫ����ָ�����
			}
		}
			return new MyIter();
	}
	
	public Iterator iterator(){
		return new Iterator(){		//�����������ӿ� ʵ���ࣨû�����ƣ��Ķ���
				//������--��ָ�� �α�
				private int coursor=-1;
				
				//�����ж��Ƿ�����һ��
				public boolean hasNext(){
						return coursor+1<size;
				}
				//��ȡ��һ��
				public String next(){
					coursor++;
					return elem[coursor];
				}
				//ɾ����һ��
				public void remove(){
					//�ƶ�����Ԫ��
					System.arraycopy(elem, coursor+1, elem,
							coursor, /*IntaDeepList.this.*/size-(coursor+1));
					/*IntaDeepList.this.*/size--;	//�Ƴ����ֺ��ܳ��ȼ���
					this.coursor--;		//��Ϊnext��ʱ��ָ������ˣ�������Ҫ����ָ�����
				}
		};		//�ֺű�ʾ���Ľ�����
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
		while(it.hasNext()){		//���жϺ��ȡ
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
//		while(it.hasNext()){		//���жϺ��ȡ
//			System.out.println(it.next());
//		}
		System.out.println("-------------------2");
		ArrayList list2 = new ArrayList();
		list2.add("a");
		list2.add("a");
		list2.add("a");
		for(Object obj:list2){		//��ǿforѭ��foreach��
			System.out.println(obj);
		}
	}

}
