package array;

public class Test01 {
	public static void main(String[] args) {
		int[] a= new int[3];
		a[0]= 23;
		a[1]= 28;
		a[2]= 66;
		/*a[3]= 32;*/
		
		Car[] cars = new Car[10];
		cars[0] = new Car("����");
		cars[1] = new Car("����");
		cars[2] = new Car("���ǵ�");
		
		//	a.length=18; ���� ���ܸı�final���� ����ǹ̶����˵�
		
		System.out.println(cars[0].name);
		System.out.println(a.length);
		
		for(int i=0;i<a.length;i++){
			System.out.println( a[i]);
		}
	}
}
