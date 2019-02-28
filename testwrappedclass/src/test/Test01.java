package test;
/**
 * 测试包装类的基本用法
 * @author 银涛
 *
 */
public class Test01 {
	public static void main(String[] args) {
		Integer i = new Integer(1000);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toHexString(i));
		Integer i2 = Integer.parseInt("234");
		System.out.println(/*i2*/i2.intValue());
		Integer i3 = new Integer("23456");
		System.out.println(i2+10);
		System.out.println(i3);
		
		String str = 234+"";	//	数字转字符串
		System.out.println(str);
	}
}
