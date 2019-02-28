package array;

public class Test01 {
	public static void main(String[] args) {
		int[] a= new int[3];
		a[0]= 23;
		a[1]= 28;
		a[2]= 66;
		/*a[3]= 32;*/
		
		Car[] cars = new Car[10];
		cars[0] = new Car("奔驰");
		cars[1] = new Car("宝马");
		cars[2] = new Car("比亚迪");
		
		//	a.length=18; 不行 不能改变final数据 这个是固定好了的
		
		System.out.println(cars[0].name);
		System.out.println(a.length);
		
		for(int i=0;i<a.length;i++){
			System.out.println( a[i]);
		}
	}
}
