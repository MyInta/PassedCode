package practice02;
/**
 * ����overload����
 * @author ����
 *
 */
public class TestOverLoad {
	public static void main(String[] args) {
		MyMath m = new MyMath();
		int result= m.add(4, 5);
		System.out.println(result);
	}
}

class MyMath{
	public int add(int a,int b){
		return a+b;
	}
	public int add(int a,int b,int c){	//һ�����������Զ�Ӧ���������ì�ܣ��������������������Ӧ����Ҳ����
		return a+b+c;
	}
}
