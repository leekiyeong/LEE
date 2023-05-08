package classTest;

public class MethodTest {
	public static void hap1(int a, int b, int c) {
		int result1 = a+b+c;
		int result2 = 0;
			result2 += a;
			result2 += b;
			result2 += c;
		System.out.println("합계 : " + result1);
		System.out.println("합계 : " + result2);
	}
	public static void main(String[] args) {
		hap1(10,20,30);
	}

}
