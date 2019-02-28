package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testDateFormat {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy年MM月dd日hh时mm分ss秒");	//	里面格式可以修改 例如“yyyy-MM-dd”
		
		Date d = new Date(123123132L);
		String str = df.format(d);
		System.out.println(str);
		System.out.println("####################");
	
		String str2 = "2017-11-12 22:07:43";
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");	//注意格式必需和前面字符串里面的年月日等格式对其，不然就会报错
		Date d2;
		try {
			d2 = df2.parse(str2);
			System.out.println(d2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
