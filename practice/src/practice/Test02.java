package practice;

public class Test02 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "inta";
		s1.age = 18;
		
		Computer c = new Computer();
		c.brand = "ÁªÏë";
		c.cpuSpeed = 100;
		
		s1.computer = c;
		
		System.out.println(s1.computer.brand);
		
		c.brand = "´÷¶û";
		System.out.println(s1.computer.brand);
	}
}
