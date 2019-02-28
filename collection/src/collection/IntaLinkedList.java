package collection;

import java.awt.print.PrinterException;
import java.util.List;

public class IntaLinkedList {
	private Node first;
	private Node last;
	private int size;
	public void add(Object obj){
		Node n = new Node();
		if(first == null){
			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);
			
			first = n;
			last = n;
		}else{
			//ֱ����last�������µĽڵ�
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);

			last.setNext(n);	//	����˵last�����first��Ϊ��first=n����
			last = n;
		}
		size++;
	}
	public int size(){
		return size;
	}
	private void rangCheck(int index){
		if(index<0||index>=size){
			try{
				throw new Exception();
			} catch(Exception e) {
			  e.printStackTrace();
			}
		}
	}
	public Node node(int index){
		Node temp = null;
		if(first!=null){
			if(index<size>>1){
				temp = first;
				for(int i=0;i<index;i++){
					temp = temp.next;
				}
			}else{
				temp = last;
				for(int i=size-1;i>index;i--){
					temp = temp.previous;
				}
			}
		}
		return temp;
	}
	public Object get(int index){
		rangCheck(index);
		Node temp = node(index);
		return temp.obj;
	}
	public void remove(int index){		//��BUG��û����ɾ����һ���ڵ�����һ���ڵ�Ĵ���
		Node temp = node(index);
		if(temp!=null){
			Node up = temp.previous;
			Node down = temp.next;
			up.next = down;
			down.previous = up;
			size--;
		}
	}
	public void add(int index,Object obj){
		Node newNode = new Node();
		newNode.obj = obj;
		Node temp = node(index);
		if(temp!=null){
			Node up = temp.previous;
			up.next = newNode;		//�ж�tempǰһ����temp����ϵ������ΪnewNode
			newNode.previous = up;	//����newNode��tempǰһ������ϵ
			
			temp.previous = newNode;
			newNode.next = temp;
			size++;
		}
	}
	
	public static void main(String[] args) {
		IntaLinkedList list = new IntaLinkedList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add(1, "BBB");		//������1ǰ����
//		list.remove(1);
		System.out.println(list.size);
		System.out.println(list.get(1));
	}
}

	
