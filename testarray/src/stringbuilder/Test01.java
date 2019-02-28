package stringbuilder;

/**
 * 测试可变字符序列StringBuilder(线程安全，效率高),StringBuffer(线程安全，效率低)
 * @author 银涛
 *
 */

public class Test01 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();	//字符数组初始长度为16
		StringBuilder sb1 = new StringBuilder(32);	//字符数组初始长度为32
		StringBuilder sb2 = new StringBuilder("abcd");	//字符数组初始长度为32,value[]{'a','b','c','d',\u0000,\u0000...}
		sb2.append("efg");	//累加 加到对象后面
		sb2.append(true);	//boolean也可以累加
		sb2.append(321).append("随便").append(6.66);	//源代码里面有个return this. 即方法连
		
		System.out.println(sb2);
	}
}
