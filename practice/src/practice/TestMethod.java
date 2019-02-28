package practice;

public class TestMethod {
	public static void test01(int i,int j,int k) {
		for(int a=i,b=0;a<=j;a+=k){
			System.out.print(a+"\t");
			b++;
			if(b%5==0){
				System.out.println();
			}
		}
		System.out.println("\n"+"for循环结束！");
	}
	public static void test02() {		
		System.out.println("这是此伟大的尝试！！！");
	}
	public static int add(int a,int b){
		int sum=a+b;
		return sum;
	}
	public static void main(String[] args) {
//		test02();
		test01(0,100,10);
//		test02();
		int s=add(3,5);
		System.out.println(s);
		System.out.println("****************");
	}
}
