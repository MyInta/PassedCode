package practice02.inherit;
/**
 * �������
 * @author ����
 *
 */
public /* final */  class Animal02 {	//����final����಻�ܱ��̳� ���������ʽ����
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
		System.out.println("����һ�����");
	}
	
public static void main(String[] args){
	Bird02 b = new Bird02();
	b.run();
}
	
}

class Mammal02 {
	Animal02 animal02= new Animal02();
	public void Viviparity(){
		System.out.println("̥��");
	} 		
}

class Reptile02 {
	Animal02 animal02= new Animal02();
	public void run(){
		animal02.run();
		System.out.println("��ѽ��ѽ��");
	}
	public void oviparity(){
		System.out.println("����");
	}
}
class Bird02{
	Animal02 animal02= new Animal02();
	public void run(){
		// animal02.run();	������ ������ʾһ�� ���Ƹ���ԭ�е�run���� Running!
		System.out.println("Flying!");
	}
	public void oviparity(){
		System.out.println("����");
	}
}