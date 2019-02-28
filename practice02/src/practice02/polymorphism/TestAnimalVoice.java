package practice02.polymorphism;

public class TestAnimalVoice {
	
	
	public static void testAnimalVoice(Animal c){	//(Cat c){ 相当于用父类指代子类
		
	/*	if(c instanceof Cat){
			((Cat) c).catchMouse();	// 之所以强制转换的原因是因为父类的c里面并没有包含子类cat的一个特殊功能
		}*/		// 有了这段 下面的最后两行就可以去掉 其作用是判断输入的类型判断后 若是cat则加入其catchMouse的功能 所以结果会是 抓老鼠 再三个叫声 和现在的结果顺序不一样
		
		c.voice();
	}
/*	public static void testAnimalVoice(Dog c){
		c.voice();
	}
	public static void testAnimalVoice(Pig c){
		c.voice();
	}*/
	public static void main(String[] args){
		Animal a = new Cat();	//	Cat c = new Cat(); Animal a= c;
		Animal b = new Dog();
		Animal c = new Pig();
		testAnimalVoice(a);
		testAnimalVoice(b);
		testAnimalVoice(c);
		
		Cat c2 = (Cat) a;	//不能直接用a.catchMouse因为父类Animal没有Cat里的catchMouse功能 所以强制转换掉
		c2.catchMouse();
		
		}
}
