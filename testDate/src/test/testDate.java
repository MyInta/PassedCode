package test;

import java.util.Date;

/**
 * 测试时间Date的用法
 * @author 银涛
 *
 */
public class testDate {
	public static void main(String[] args) {
		Date d = new Date();
		long t = System.currentTimeMillis();
		System.out.println(t);
		Date d2 = new Date(1000);	//	毫秒为单位
		
		System.out.println(d2.toGMTString());	//杠为不建议使用
		d2.setTime(2333333);
		System.out.println(d2.getTime());
		System.out.println(d2.getTime()<=d.getTime());
	}
}
