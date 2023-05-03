package study1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//byte short int long
		byte a = -128;
		byte a$ = 127;//-128~127
		short b = 32767; //-32768~32767
		int c = 2147483647;   //-2147483648~2147483647
		long d = 30000000000L; //long type은 뒤에 L을 붙여 선언
		
		float f1 = 3.14f;//float type은 뒤에 f를 붙여 선언
		float f2 = 3.111231121212121f;//세팅은 할 수 있으나 출력은 소수 6자리
		double db1 = 3.14213212131313;
		System.out.println(f2);
		System.out.println(db1);
		
		char c1 = 'a'; //ok
		c1+=2;
		c1++;
		System.out.println("char c1 : " + c1);
		//char c2 = 'ab'; x 변수는 하나씩
		//char c3 = "a"; x 홑따옴표 안에 
		char c4 = '가'; //ok
		c4++;
		c4++;
		System.out.println("char c4 : " + c4);
		String s1 = "a";
		System.out.println("String s1 : " + s1);
		
		char c2 = 'a'; // 97
		char c3 = 98;  // b
		System.out.println(c3);
	}	
}
