package MyInterface;

public interface Flyable {
	int MAX_SPEED =11000;
	int MIN_HIGHT = 1; 	
	void fly();
}

interface Attack{
	void attack();
}

class Plane implements Flyable{

	@Override
	public void fly() {
		System.out.println("�ɻ������������ڷ�");
		
	}
	
}
class Man implements Flyable{

	@Override
	public void fly() {
		System.out.println("��������Ծ�ڷ�");
		
	}
	
}
class Stone implements Flyable,Attack{
	int weight;
	@Override
	public void fly() {
		System.out.println("ʯͷ���������ڷ�");
		
	}

	@Override
	public void attack() {
		System.out.println("ʯͷ����");
		
	}
	
}
