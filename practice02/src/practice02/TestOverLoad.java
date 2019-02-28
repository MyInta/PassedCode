package practice02;
/**
 * 测试overload重载
 * @author 银涛
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
	public int add(int a,int b,int c){	//一个方法名可以对应多个，不会矛盾，改下输入的数字数量对应方法也变了
		return a+b+c;
	}
}
