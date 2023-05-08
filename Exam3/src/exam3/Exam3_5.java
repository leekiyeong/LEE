package exam3;

import java.util.Calendar;

public class Exam3_5 {
	public static void errchk(String rrn) {
		String[] arr = rrn.split("-");
		if(arr.length!=2||arr[0].length()!=6||arr[1].length()!=7) {
			System.out.println("잘못입력하셨습니다.");
		}else {
			System.out.println("정상");
		}
	}
	public static void age(String[] rrn) {
		int age = Integer.parseInt(rrn[0].substring(0,2));
		int year = Calendar.getInstance().get(Calendar.YEAR);
		if(age>23) {
			age = (year-age)-1900;
		}else if(age<=23) {
			age = (year-age)-2000;
		}
		System.out.println("나이 : " + age + "세");
	}
	public static void gender(String[] rrn) {
		String G = rrn[1].substring(0,1);
		if(G.equals("1")) {
			System.out.println("성별 : 남성");
		}else if(G.equals("2")) {
			System.out.println("성별 : 여성");
		}
	}
	public static void birth(String[] rrn) {
		String birthMonth = rrn[0].substring(2,4);
		String birthday = rrn[0].substring(4,6);
		System.out.println("생일 : " + birthMonth + "월 "
							+ birthday + "일" );
	}
	public static void main(String[] args) {
		String ID = "980316-1120312";
		System.out.println("입력값 : " + ID);
		System.out.print("오류체크 : ");
		errchk(ID);
		age(ID.split("-"));
		gender(ID.split("-"));
		birth(ID.split("-"));
		
	}	

}
