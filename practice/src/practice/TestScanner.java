package practice;

import java.util.Scanner;

/**
 * ����Scanner���ʹ�ã���ν��ܼ��̵����롣
 * @author ����
 *
 */
public class TestScanner {
	public static void test01(){
		Scanner s= new Scanner(System.in);
		String str=s.next();	//�������е�next���������ȴ����̵����롣
		
		System.out.println("�ղż�������������ǣ�"+str);
	}
	public static void test02(){
		Scanner s= new Scanner(System.in);
		System.out.println("������һ��������");
		int a = s.nextInt();
		System.out.println("������һ����������");
		int b = s.nextInt();
		int sum = a+b;
		System.out.println("������Ϊ��"+sum);
	}
	public static void main(String[] args) {
		test02();
	}
}
