package studyWhile;


import java.util.Scanner;

public class Test2 {
		
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("양수 입력 : ");
			int val = scn.nextInt();
			if(val == -1) {
				System.out.println("반복문을 종료합니다.");
				break;
			}
			else 
				System.out.println(val + "을 입력했습니다.");
		}
	
	}

}
