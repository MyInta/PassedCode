package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 可视化日历程序
 * @author 银涛
 *
 */
public class VisibleCalendar {
	public static void main(String[] args) {
		System.out.println("请输入所要查询的日期时间：（按照格式2000-01-01）");
		Scanner scanner = new Scanner(System.in);	//得用Scanner的Input... ...
		String temp = scanner.nextLine();
		
		
//		String temp = "2017-11-10";
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = format.parse(temp);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			
			int day = calendar.get(Calendar.DATE);	//获得老的天数
			calendar.set(Calendar.DATE, 1);		//修改日期为1号
			
			int maxDate = calendar.getActualMaximum(Calendar.DATE);
			int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
			
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			//可视化日历程序
			

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
					System.out.print("★");
				}
				System.out.print(i+"\t");
				
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
