package inta02;

public class IDOperatorTest {
	public static void main(String[] args){
	int a=1;
	int b=2;
	int c=a++;
	int d=++b;
	System.out.println("a的值是："+a);
	System.out.println("b的值是："+b);
	System.out.println("c的值是："+c);
	System.out.println("d的值是："+d+"\n");
	int e=3;
	int f=4;
	int g=e--;
	int h=--f;
	System.out.println("e的值是："+e);
	System.out.println("f的值是："+f);
	System.out.println("g的值是："+g);
	System.out.println("h的值是："+h);
	}

}
