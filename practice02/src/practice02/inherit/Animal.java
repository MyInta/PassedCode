package practice02.inherit;
/**
 * ���Լ̳�
 * @author ����
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
		System.out.println("����һ�����");
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
		this.run(); 	//���Լ̳е����� ���� this.eye();Ҳ��
		System.out.println("̥��");
	} 		
}

class Reptile extends Animal{
	public void oviparity(){
		System.out.println("����");
	}
}
class Bird extends Animal{
	public void run(){
		System.out.println("Flying!");
	}
	public void oviparity(){
		System.out.println("����");
	}
}