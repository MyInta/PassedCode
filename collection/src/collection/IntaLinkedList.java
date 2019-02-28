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
			//直接往last后增加新的节点
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);

			last.setNext(n);	//	就是说last后接着first因为（first=n）。
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
	public void remove(int index){		//有BUG，没有做删除第一个节点后最后一个节点的处理
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
			up.next = newNode;		//切断temp前一个与temp的联系，覆盖为newNode
			newNode.previous = up;	//增加newNode与temp前一个的联系
			
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
		list.add(1, "BBB");		//在索引1前插入
//		list.remove(1);
		System.out.println(list.size);
		System.out.println(list.get(1));
	}
}

	
