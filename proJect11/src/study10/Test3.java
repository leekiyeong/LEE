package study10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int answer = (int)(Math.random()*100 + 1);
		int input = 0;
		int count = 0;
		Scanner scn;
		while(true) {
			try {
				count++;
				scn = new Scanner(System.in);
				System.out.print("1~100 insert : ");
				
				input = scn.nextInt();
				if(answer > input) {
					System.out.println("more big");
				}else if (answer < input) {
					System.out.println("more small");
				}else {
					System.out.println("bingo~");
					System.out.println(count + "회에 맞춤");
					break; //반복문 종료
				}
			}catch(InputMismatchException e) {
				System.out.println("숫자만 입력하시오");
			}
		}
	}

}
