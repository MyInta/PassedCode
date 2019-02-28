package practice02.polymorphism;

public class Animal {
	//String str;
	public void voice(){
		System.out.println("ÆÕÍ¨¶¯Îï½ĞÉù");
	}
}

class Cat extends Animal {
	public void voice(){
		System.out.println("ß÷ß÷ß÷");
	}
	public void catchMouse(){
		System.out.println("×¥ÀÏÊó");
	}
}
class Dog extends Animal {
	public void voice(){
		System.out.println("ÍôÍôÍô");
	}
}
class Pig extends Animal {
	public void voice(){
		System.out.println("ºßºßºß");
	}
}