package inta.inta03.test;
/**
 * @version 1.0
 * 
 * @author ����
 *
 */

public class TestRecursion {
	static int a=0;
	
	public static void test01(){
		a++;
		System.out.println("TestRecursion.Test01:"+a);
		if(a<=10){
			test01();			
		}else{
			System.out.println("over");
		}

	}
	/**
	 *
	 * ����test01
	 */
	public static void test02(){
		System.out.println("TestRecursion.Test02()");
	}
	/**
	 * ����׳ˡ��׳˵���˼��7*6*5*4*3*2*1
	 * @param n �׳˵������
	 * @return �׳˴�Ľ��ֵ
	 */
	public static long factorial(int n){
		if(n==1){
			return 1;
		}else{
			return n*factorial(n-1);	//���ؼ���factorial���㷨
		}
	}
	
	public static void main(String[] args) {
		test01();
		System.out.println(factorial(7));  //����n=7���õ�7�Ľ׳�
	}

}

