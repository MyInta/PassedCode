package collection;
/**
 * 用来表示一个节点
 * @author 银涛
 *
 */
public class Node {
	Node previous;	//	上一个节点
	Node next;		//下一个节点
	Object obj;
	
	public Node() {
	}
	
	public Node(Node previous, Node next, Object obj) {
		super();
		this.previous = previous;
		this.next = next;
		this.obj = obj;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	
	
}
