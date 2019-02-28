package MyInterface;

public class Test {
	public static void main(String[] args) {
		Flyable f = new Stone();
		f.fly(); // 如果想要用子类常量 需要强制转换
		
		InterfaceA a = new InterfaceTest();
		InterfaceTest b = (InterfaceTest) a;	// 强制转换 否则 a.aaa ... ... 调不出来
		
		/*a.aaa();
		a.bbb();
		a.ccc();
		*/
		//	解决办法 将前面的两行直接用 InterTest a = new InterTest();即可实现前面a.aaa ... ... 的调用
		b.aaa();
		b.bbb();
		b.ccc();
	}
}
