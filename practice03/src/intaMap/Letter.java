package intaMap;
/**
 * javabean 存储数据po bo vo	包含setter与getter访问器的类
 * @author 银涛
 *
 */
public class Letter {
	private String name;
	private int count;
	public Letter(){
	}
	//快捷键alt shift s 按O 回车 生成带参构造
	public Letter(String name) {
		this.name = name;
	}
	public Letter(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	//setter与getter访问器 快捷键alt shift s 按r 后 tab 回车shift tab 再回车 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}
