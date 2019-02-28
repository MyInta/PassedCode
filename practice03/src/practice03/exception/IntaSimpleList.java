package practice03.exception;
/**
 * 理解迭代器的原理
 * 迭代器：遍历使用
 * 
 * @author 银涛
 *
 */
public class IntaSimpleList {

	//数组存储值
	private String[] elem={"a","b","c"};
	//数组长度
	private int size = elem.length;
	
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
				coursor, size-(coursor+1));
		this.size--;	//移除部分后总长度减少
		this.coursor--;		//因为next的时候指标后移了，所以需要进行指针回退
	}
	public int size(){
		return this.size;
	}
	
	public static void main(String[] args) {
		IntaSimpleList list = new IntaSimpleList();
		
		if(list.hasNext()){
			System.out.println(list.next());
			list.remove();
		}
		if(list.hasNext()){
			System.out.println(list.next());
			list.remove();
		}
		if(list.hasNext()){
			System.out.println(list.next());
			list.remove();
		}
		if(list.hasNext()){	//不会获取值，因为先判断后获取
			System.out.println(list.next());
			list.remove();
		}
		
		System.out.println(list.size);
	}

}
