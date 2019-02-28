package practice02.abstractClass;

public abstract class Animal {		//	抽象方法的意义在于方法和设计分离了 
	String str;
	public abstract void run();
	public void breath(){
		System.out.println("呼吸");
		run(); // 会调用子类的run
	}
	
	public Animal(){
		System.out.println("创造一个动物");	// 即使这样 如果后面Test用的是new Animal仍无法通过编译 因为抽象类不能被new实例化
	}
	
}

class Cat extends Animal{

	@Override
	public void run() {
		System.out.println("猫步小跑");
		
	}
	
}

class Dog extends Animal{

	@Override
	public void run() {
		System.out.println("狗爬式");
		
	}
	
}