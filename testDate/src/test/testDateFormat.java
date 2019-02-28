package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testDateFormat {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy��MM��dd��hhʱmm��ss��");	//	�����ʽ�����޸� ���硰yyyy-MM-dd��
		
		Date d = new Date(123123132L);
		String str = df.format(d);
		System.out.println(str);
		System.out.println("####################");
	
		String str2 = "2017-11-12 22:07:43";
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");	//ע���ʽ�����ǰ���ַ�������������յȸ�ʽ���䣬��Ȼ�ͻᱨ��
		Date d2;
		try {
			d2 = df2.parse(str2);
			System.out.println(d2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
