package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * ���ӻ���������
 * @author ����
 *
 */
public class VisibleCalendar {
	public static void main(String[] args) {
		System.out.println("��������Ҫ��ѯ������ʱ�䣺�����ո�ʽ2000-01-01��");
		Scanner scanner = new Scanner(System.in);	//����Scanner��Input... ...
		String temp = scanner.nextLine();
		
		
//		String temp = "2017-11-10";
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = format.parse(temp);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			
			int day = calendar.get(Calendar.DATE);	//����ϵ�����
			calendar.set(Calendar.DATE, 1);		//�޸�����Ϊ1��
			
			int maxDate = calendar.getActualMaximum(Calendar.DATE);
			int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
			
			System.out.println("��\tһ\t��\t��\t��\t��\t��");
			//���ӻ���������
			

			for(int k = 1,i = 1, j = 0;i<=maxDate;i++,j++){
				while(k<dayOfWeek){
					System.out.print("\t");
					k++;
					j++;
				}
				
				if(j%7==0){
					System.out.print('\n');
					
				}
				if(i==day){
					System.out.print("��");
				}
				System.out.print(i+"\t");
				
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
