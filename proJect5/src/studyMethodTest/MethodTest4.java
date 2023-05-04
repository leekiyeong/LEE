package studyMethodTest;

public class MethodTest4 {

	public static void main(String[] args) {
		int a = 100;
		int b = 20;
		myCalc(a,b,"*");
	}
	public static void myCalc(int a,int b, String c) {
		int result;
		if(c.equals("+"))
			result = a + b;
		else if(c.equals("-"))
			result = a - b;
		else if(c.equals("*"))
			result = a * b;
		else if(c.equals("/"))
			result = a / b;
		else {
			System.out.println("등록되지 않은 연산자.");
			return;
		}
		System.out.println("계산결과 : " + result);
	}
	
}
