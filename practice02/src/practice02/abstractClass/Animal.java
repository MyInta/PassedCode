package practice02.abstractClass;

public abstract class Animal {		//	���󷽷����������ڷ�������Ʒ����� 
	String str;
	public abstract void run();
	public void breath(){
		System.out.println("����");
		run(); // ����������run
	}
	
	public Animal(){
		System.out.println("����һ������");	// ��ʹ���� �������Test�õ���new Animal���޷�ͨ������ ��Ϊ�����಻�ܱ�newʵ����
	}
	
}

class Cat extends Animal{

	@Override
	public void run() {
		System.out.println("è��С��");
		
	}
	
}

class Dog extends Animal{

	@Override
	public void run() {
		System.out.println("����ʽ");
		
	}
	
}