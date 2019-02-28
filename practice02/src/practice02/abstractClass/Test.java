package practice02.abstractClass;

public class Test {
	public static void main(String[] args) {
		Animal a = new Cat();	//Animal a = new Animal();则无法通过编译 前面也说明了 抽象类不能被new实例化
		a.run();
	}
}
