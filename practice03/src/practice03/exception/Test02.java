package practice03.exception;

public class Test02 {
	public static void main(String[] args) {
		//b=2�Ӹ����£�b+5��;�õ�������b�Ƕ���
		double b=0;
		for(int i=0;i<13;i++){
			b = Math.sqrt(b+5)+2;
		}
		System.out.println(b);
	}
}