package study1;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		System.out.println("풀어보기 2-1");
		Scanner scn = new Scanner(System.in);
		System.out.print("연차입력 : ");
		int emp_A_year = scn.nextInt();
	
		String grade = "";
		if(emp_A_year>=15) {
			grade = "특급";
		}else if(emp_A_year>=10) {
			grade = "고급";
		}else if(emp_A_year>=6) {
			grade = "중급";
		}else
			grade = "초급";
		System.out.println("A사원의 년차는 " + emp_A_year + "년으로 " + grade + "입니다.");
		
		System.out.println("----------------------------------------");
		System.out.println("풀어보기 2-2");
		Scanner scn2 = new Scanner(System.in);
		System.out.print("성별코드 : ");
		String code = scn2.next();
		String gender = "";
		
		if(code.equals("M")) gender = "남성"; //문자비교는 .equals() 사용
		else if(code.equals("F")) gender = "여성";
		else gender = "잘못된 코드";
		
		System.out.println("A씨의 성별 코드는 " + code + "로 " + gender +"입니다.");
	}

}
