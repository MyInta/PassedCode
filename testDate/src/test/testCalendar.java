package test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 测试日期类
 * @author 银涛
 *
 */
public class testCalendar {
	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
		c.set(2017, Calendar.DECEMBER,12,22,50);
		
//		c.set(Calendar.YEAR, 2017);
//		c.set(Calendar.MONTH, 11);
//		c.set(Calendar.DATE, 12);
		
//		c.setTime(new Date());
		Date d = c.getTime();
		System.out.println(d);
		System.out.println(c.get(Calendar.YEAR));
		
		//	测试日期计算
		c.add(Calendar.YEAR, 30);
		System.out.println(d);
		
	}
}
