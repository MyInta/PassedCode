package test;

import java.util.Date;

/**
 * ����ʱ��Date���÷�
 * @author ����
 *
 */
public class testDate {
	public static void main(String[] args) {
		Date d = new Date();
		long t = System.currentTimeMillis();
		System.out.println(t);
		Date d2 = new Date(1000);	//	����Ϊ��λ
		
		System.out.println(d2.toGMTString());	//��Ϊ������ʹ��
		d2.setTime(2333333);
		System.out.println(d2.getTime());
		System.out.println(d2.getTime()<=d.getTime());
	}
}
