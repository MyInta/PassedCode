package practice03.exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * ʹ�÷��ͣ����Բ����������
 * 
 * 
 * 
 * 
 * 
 * @author ����
 *
 */
public class IntaArrayList<E> implements java.lang.Iterable<E> {

	//����洢ֵ
	private Object[] elem=new Object[5];
	//ʵ�ʴ�С
	private int size=0;
	
	public int size(){
		return this.size;
	}
	/**
	 * ��ĩβ����Ԫ��
	 * @param ele
	 */
	public void add(E ele){
		if(this.size==elem.length){		//��������-->����
			elem=Arrays.copyOf(elem, elem.length+5);	
		}
		
		elem[size] = ele;	//������ ��� ����Ԫ�ء�
		size++;		//ʵ�ʴ�С+1
	}
	
	
	
	
	public Iterator<E> iterator(){
		return new Iterator<E>(){		//�����������ӿ� ʵ���ࣨû�����ƣ��Ķ���
				//������--��ָ�� �α�
				private int coursor=-1;
				
				//�����ж��Ƿ�����һ��
				public boolean hasNext(){
						return coursor+1<size;
				}
				//��ȡ��һ��
				public E next(){
					coursor++;
					return (E)elem[coursor];
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
		IntaArrayList<Integer> list = new IntaArrayList<Integer>();
		list.add(1);		//int-->Integer
		list.add(2);
		for(Integer e:list){
			System.out.println(e);
		}
		System.out.println("------------------");
		IntaArrayList<String> list2 = new IntaArrayList<String>();
		list2.add("ϲ");		//int-->Integer
		list2.add("��");
		list2.add("��");
		
		Iterator<String> it = list2.iterator();
		while(it.hasNext()){
			String e = it.next();
			System.out.print(e);
		}
	}

}
