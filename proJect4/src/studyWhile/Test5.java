package studyWhile;

import java.util.Scanner;

public class Test5 {
	
	public static void main(String[] args) {
		String[] coffee = {"아메리카노(3500)","카푸치노(4500)","카페라떼(4300)","오늘의커피(3500)"};
		int[] price = {3500,4500,4300,3500};
		System.out.println("*커피번호를 선택하세요*");
		System.out.println("1.아메 2.카푸 3.카페 4.오늘 5.취소");
		Scanner scn = new Scanner(System.in);
		System.out.print("번호>>");
		int num = scn.nextInt();
		if(num==5) System.out.println("주문취소");
		else {
		System.out.println(">>" + coffee[num-1] + " 선택함");
		System.out.println(price[num-1] + "원 결제 부탁드림");
		}
	}
}
