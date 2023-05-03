package study1;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("= 드시려는 커피번호를 입력해주세요. =");
		System.out.println("1.아메리카노");
		System.out.println("2.맥심모카골드");
		System.out.print("* 커피번호>> ");
		int num = scn.nextInt();
		
		
		System.out.println("");
		String cof = ""; 
		
		if(num == 1) {
			cof = "아메리카노";
			System.out.println("= " + cof + "를 선택했습니다. =");
			System.out.println("1.설탕넣기");
			System.out.println("2.설탕없음");
			System.out.print("* 설탕번호>> ");
			num = scn.nextInt();
			System.out.println("");
			if(num == 1) System.out.println("결과>> 설탕 들어간 " + cof + "가 나왔습니다.");
			else if(num == 2) System.out.println("결과>> 설탕 없는 " + cof + "가 나왔습니다."); 
			//System.out.println("= 아메리카노를 선택했습니다. =");
		} else if(num == 2) {
			cof = "모카골드";
			System.out.println("= " + cof + "를 선택했습니다. =");
			System.out.println("1.프림1 + 설탕1 (연한맛)");
			System.out.println("2.프림2 + 설탕2 (단맛)");
			System.out.println("3.프림3 + 설탕3 (아주단맛)");
			System.out.print("* 선택번호>> ");
			num = scn.nextInt();
			System.out.println("");
			if(num == 1) System.out.println("결과>> 연한맛의 " + cof + "가 나왔습니다.");
			if(num == 2) System.out.println("결과>> 단맛의 " + cof + "가 나왔습니다.");
			if(num == 3) System.out.println("결과>> 아주단맛의 " + cof + "가 나왔습니다.");
		} else {
			System.out.println("없는 번호입니다.");
		}
		
	}

}
