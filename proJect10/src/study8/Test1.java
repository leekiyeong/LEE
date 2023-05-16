package study8;

import java.util.Calendar;
import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		//랜덤 : 1~10사이의 값 생성
		//시스템이 얻은 값을 맞추는 문제
		Calendar cal = Calendar.getInstance();
		long u1 = cal.getTimeInMillis();
		
		int r = (int)(Math.random()*10) + 1;//1~10
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		while(true) {
			System.out.print("숫자입력 : ");
			int a = scn.nextInt();
			if(r == a) {
				System.out.println(a + "정답입니다!!");
				break;
			} else {
				System.out.println(a + "오답입니다ㅠㅠ");
			}
			cnt++;
			if(cnt == 20) {
				break;
			}
		}
		Calendar cal2 = Calendar.getInstance();
		long u2 = cal2.getTimeInMillis();
		int result = (int)(u2-u1)/1000;
		System.out.println(result + "초 걸렸습니다.");
	}
}
