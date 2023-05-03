package study1;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("별의 갯수 : ");
		int val = scn.nextInt();
		
		for(int i=1; i<=val; i++)
		System.out.print("* ");
	}

}
