package inta.inta03.test;
/**
 * @version 1.0
 * 
 * @author 银涛
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
	 * 这是test01
	 */
	public static void test02(){
		System.out.println("TestRecursion.Test02()");
	}
	/**
	 * 计算阶乘。阶乘的意思是7*6*5*4*3*2*1
	 * @param n 阶乘的最大数
	 * @return 阶乘大的结果值
	 */
	public static long factorial(int n){
		if(n==1){
			return 1;
		}else{
			return n*factorial(n-1);	//返回继续factorial的算法
		}
	}
	
	public static void main(String[] args) {
		test01();
		System.out.println(factorial(7));  //代入n=7，得到7的阶乘
	}

}

