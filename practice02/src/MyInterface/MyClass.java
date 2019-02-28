package MyInterface;

public class MyClass implements TestInterface {

	@Override
	public void test01() {
		//	TestInterface.MAX_GREAD;
		System.out.println("test01");
		
	}

	@Override
	public int test02(int a, int b) {
		System.out.println("MyClass.test02()");
		return a+b;
	}

}
