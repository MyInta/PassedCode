package practice02.inherit;
/**
 * 测试组合
 * @author 银涛
 *
 */
public /* final */  class Animal02 {	//增加final后该类不能被继承 但以组合形式可行
	String eye ;
	public void run(){
		System.out.println("Running!");
	}
	public void eat(){
		System.out.println("Eating~");
	}
	public void sleep(){
		System.out.println("Sleeping~");
	}
	public Animal02(){
		super ();
		System.out.println("创建一个动物！");
	}
	
public static void main(String[] args){
	Bird02 b = new Bird02();
	b.run();
}
	
}

class Mammal02 {
	Animal02 animal02= new Animal02();
	public void Viviparity(){
		System.out.println("胎生");
	} 		
}

class Reptile02 {
	Animal02 animal02= new Animal02();
	public void run(){
		animal02.run();
		System.out.println("爬呀爬呀爬");
	}
	public void oviparity(){
		System.out.println("卵生");
	}
}
class Bird02{
	Animal02 animal02= new Animal02();
	public void run(){
		// animal02.run();	如果添加 则会多显示一行 类似父类原有的run性质 Running!
		System.out.println("Flying!");
	}
	public void oviparity(){
		System.out.println("卵生");
	}
}