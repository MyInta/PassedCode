package intaMap;
/**
 * javabean �洢����po bo vo	����setter��getter����������
 * @author ����
 *
 */
public class Letter {
	private String name;
	private int count;
	public Letter(){
	}
	//��ݼ�alt shift s ��O �س� ���ɴ��ι���
	public Letter(String name) {
		this.name = name;
	}
	public Letter(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	//setter��getter������ ��ݼ�alt shift s ��r �� tab �س�shift tab �ٻس� 
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
