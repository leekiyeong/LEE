package study8;

import java.util.Calendar;
import java.util.Scanner;

public class CalViewTest1 {

	public static void CalView() {
		Calendar cal = Calendar.getInstance();
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		System.out.print("몇년도 달력을 구할까요?(yyyy):");
		int year = scn.nextInt();
		
		System.out.print("몇월 달력을 구할까요?(mm):");
		int month = scn.nextInt();
		
		cal.set(year,month-1,1); 
		
		int week = cal.get(Calendar.DAY_OF_WEEK); //요일구하기(앞자리 공백)
		int lastDay = cal.getActualMaximum(Calendar.DATE); //이번달의 마지막 날짜 얻기 + 1일찍기전에 공백하나 얻기
		int ln = 0;
		
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH)+1;
		
		System.out.println(yy + "년 " + mm + "월 달력" );
		
		System.out.print("  일  ");
		System.out.print("    월  ");
		System.out.print("     화  ");
		System.out.print("     수  ");
		System.out.print("    목  ");
		System.out.print("    금  ");
		System.out.println("     토  ");
		
		for(int w=1;w<week;w++) {
			System.out.print("\t");
			ln++;
		}
		for(int d=1; d<=lastDay; d++) {
			if(d<=9) {
				System.out.print(" ");
			}
			System.out.printf(d + "일\t");
			ln++;
			if(ln == 7) {
				System.out.println();
				ln = 0;
			}
			
		}
	}

}
