package practice02.polymorphism;

public class TestAnimalVoice {
	
	
	public static void testAnimalVoice(Animal c){	//(Cat c){ �൱���ø���ָ������
		
	/*	if(c instanceof Cat){
			((Cat) c).catchMouse();	// ֮����ǿ��ת����ԭ������Ϊ�����c���沢û�а�������cat��һ�����⹦��
		}*/		// ������� �����������оͿ���ȥ�� ���������ж�����������жϺ� ����cat�������catchMouse�Ĺ��� ���Խ������ ץ���� ���������� �����ڵĽ��˳��һ��
		
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
		
		Cat c2 = (Cat) a;	//����ֱ����a.catchMouse��Ϊ����Animalû��Cat���catchMouse���� ����ǿ��ת����
		c2.catchMouse();
		
		}
}
