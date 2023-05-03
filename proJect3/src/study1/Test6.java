package study1;

import java.util.Scanner;

public class Test6 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("변수입력 : ");
		int val = scn.nextInt();
		
		System.out.println(val + "단 출력");
		for(int n=1; n<=9; n++) {
			System.out.println(n + " x " + val + " = " + (val * n));
		}
	}
	
}
