package studyMethod;

import java.util.Calendar;

public class MethodTest4 {
	public static String memberName() {
		return "홍길동";
	}
	public static int memberAge() {
		return 25;
	}
	public static String memberBirth() {
		return "1998-12-25";
	}
	public static String today() {
		//Calendar 클래스의 초기화
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		String today = year + "-" + month + "-" + date;
		return today;

	}
	public static void main(String[] args) {
		System.out.println("회원 이름 : " + memberName());
		System.out.println("회원 나이 : " + memberAge());
		System.out.println("회원 생일 : " + memberBirth());
		System.out.println("오늘 날짜 : " + today());
	}
	

}
