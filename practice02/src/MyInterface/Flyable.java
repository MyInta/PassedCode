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
		System.out.println("飞机依靠发动机在飞");
		
	}
	
}
class Man implements Flyable{

	@Override
	public void fly() {
		System.out.println("人依靠跳跃在飞");
		
	}
	
}
class Stone implements Flyable,Attack{
	int weight;
	@Override
	public void fly() {
		System.out.println("石头依靠惯性在飞");
		
	}

	@Override
	public void attack() {
		System.out.println("石头攻击");
		
	}
	
}
