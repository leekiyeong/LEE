package study8;

import java.util.Calendar;

public class UnixTimeTest3 {

	public static void main(String[] args) {
		
		long Date = 1498137807001L;
		
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(Date);
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH)+1;
		int dd = cal.get(Calendar.DATE);
		System.out.println(yy + "년 " + mm + "월 " + dd + "일");

	}

}
