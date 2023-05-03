package study2;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//영어점수 80점이상 우수, 아닐시 양호
		System.out.println("풀어보기 4-1");
		int eng = 80;
		String result = (eng>=80)?"우수":"양호";
		System.out.println(result);
		System.out.println("----------------------------");
		
		
		//형식) (조건)?true:false
		System.out.println("삼항연산자 예제");
		int num = 100;
		System.out.println((num>100)? "참":"거짓"); 
		//(100>100)무조건 거짓으로 나와서 dead code분류?
		int a = 10;
		int b = 2;
		String result1 = (a%b==0)? "참":"거짓";
		System.out.println(result1);
		int apple = 88;
		String level = (apple>=80)? "A등급":(apple>=60)?"B등급":"C등급";
		System.out.println("사과의 당도는 " + apple +"으로 " + level + "입니다.");
		System.out.println("----------------------------");
		
		System.out.println("풀어보기 4-2");
		int gender = 2;
		System.out.println((gender==1)?"남성":(gender==2)?"여성":"다시입력");
		System.out.println("----------------------------");
		
		System.out.println("풀어보기 4-3");
		int number = 1;
		System.out.println( ( (number>0)?"양수":(number<0)?"음수":"0") + "입니다.");
		System.out.println("----------------------------");
		
		System.out.println("풀어보기 4-4");
		Scanner scn = new Scanner(System.in); 		
		System.out.print("점수입력:");
		int score = scn.nextInt(); 		  //키보드에서 변수 받기
		String result2 = (score>=90)?"A":
						 (score>=80)?"B":
						 (score>=70)?"C":
						 (score>=60)?"D":"F";
		System.out.println(score + "점 : " + result2 + "학점입니다.");
		System.out.println("----------------------------");
		
		/*System.out.println("Switch문 사용");
		switch(1+1) {
		case 1 : System.out.println("답은 1");
		break;
		case 2 : System.out.println("답은 2");
		break;
		default : System.out.println("몰?루");
		}*/
	}
}
