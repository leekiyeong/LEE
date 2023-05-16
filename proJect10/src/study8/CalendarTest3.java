package study8;

import java.util.Calendar;

public class CalendarTest3 {
 
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2023,2,1); //2023-03-01
		
		int week = cal.get(Calendar.DAY_OF_WEEK); //요일구하기(앞자리 공백)
		//System.out.println(week); //4 (3월 1일 수요일)
		int lastDay = cal.getActualMaximum(Calendar.DATE); //이번달의 마지막 날짜 얻기 + 1일찍기전에 공백하나 얻기
		int ln = 0;
		
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH);
		
		System.out.println(yy + "년 " + mm + "월 달력" );
		
		for(int w=1;w<week;w++) {
			System.out.print("\t");
			ln++;
		}
		for(int d=1; d<=lastDay; d++) {
			if(d<=9) {
				System.out.print(" ");
			}
			System.out.print(d + "일\t");
			ln++;
			if(ln == 7) {
				System.out.println();
				ln = 0;
			}
			
		}
	}

}
