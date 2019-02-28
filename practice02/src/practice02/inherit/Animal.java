package practice02.inherit;
/**
 * 测试继承
 * @author 银涛
 *
 */
public class Animal {
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
	public Animal(){
		super ();
		System.out.println("创建一个动物！");
	}
}
class Mammal extends Animal{
/* 
class Mammal{
	String eye ;
	public void run(){
		System.out.println("Running!");
	}
	public void eat(){
		System.out.println("Eating~");
	}		
	*/
	public void Viviparity(){
		this.run(); 	//测试继承的作用 所以 this.eye();也有
		System.out.println("胎生");
	} 		
}

class Reptile extends Animal{
	public void oviparity(){
		System.out.println("卵生");
	}
}
class Bird extends Animal{
	public void run(){
		System.out.println("Flying!");
	}
	public void oviparity(){
		System.out.println("卵生");
	}
}