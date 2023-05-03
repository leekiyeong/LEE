package study1;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("연산자 입력");
		String val = scn.next();
		int a = 5;
		int b = 5;
		int result = 0;
		switch(val) {
		case "+" : result = a+b; System.out.println(result);
			break;
		case "-" : result = a-b; System.out.println(result);
			break;
		case "*" : result = a*b; System.out.println(result);
			break;
		case "/" : result = a/b; System.out.println(result);
			break;
		default : System.out.println("제대로 입력해라.");
		}
	}

}
