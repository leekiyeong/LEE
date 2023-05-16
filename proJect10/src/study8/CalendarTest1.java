package study8;

import java.util.Calendar;

public class CalendarTest1 {

	public static void main(String[] args) {
		//Calendar cal2 = new Calendar(); 
		Calendar cal = Calendar.getInstance(); //인스턴스화
		int year = cal.get(Calendar.YEAR); //Calendar.YEAR = 1
		int month = cal.get(Calendar.MONTH)+1; //Calendar.MONTH = 2
		int date = cal.get(Calendar.DATE); //Calendar.DATE = 5
		System.out.println(year + "/" + month + "/" + date);
		
		cal.add(Calendar.YEAR,3);
		
		year = cal.get(Calendar.YEAR); //Calendar.YEAR = 1
		month = cal.get(Calendar.MONTH)+1; //Calendar.MONTH = 2
		date = cal.get(Calendar.DATE); //Calendar.DATE = 5
		
		System.out.println(year + "/" + month + "/" + date);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(hour + ":" + minute + ":" + second);
		
		System.out.println("AM/PM : " + cal.get(Calendar.AM_PM));
		System.out.println("현재요일 : " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("몇번째 날 : " + cal.get(Calendar.DAY_OF_YEAR));
		System.out.println("몇번째 주 : " + cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이번달 몇번째주 : " + cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이번달 마지막날 : " + cal.getActualMaximum(Calendar.DATE));
	}

}
