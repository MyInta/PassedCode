package practice03.exception;

public class Test02 {
	public static void main(String[] args) {
		//b=2加根号下（b+5）;用迭代法求b是多少
		double b=0;
		for(int i=0;i<13;i++){
			b = Math.sqrt(b+5)+2;
		}
		System.out.println(b);
	}
}
