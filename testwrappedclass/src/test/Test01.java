package test;
/**
 * ���԰�װ��Ļ����÷�
 * @author ����
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
		
		String str = 234+"";	//	����ת�ַ���
		System.out.println(str);
	}
}
