package exam3;

public class Exam3_4 {
	public static void divide(double a) {
	//	String result = Double.toString(a);
	//	int dot = result.indexOf(".");
	//	System.out.println("정수 : " + result.substring(0,dot));
	//	System.out.println("실수 : 0." + result.substring(dot+1));
		String b = a + ""; //숫자 -> 문자;; b="97.123";
		String[] ar1 = b.split("\\.");
		System.out.println("정수 : " + ar1[0] 
						 + " / 실수 : 0." + ar1[1]);
		
	}
	public static void main(String[] args) {
		divide(97.123);
	}

}
