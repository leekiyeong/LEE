package classTest;

class Test5 {
	int a = 0;
	int b = 0;
	int c = 0;
	int result = 0;
	public char[] title;
	public int hap() {
		result = a + b + c;
		return result;
	}
	public double avg() {
		return result/3;
	}
}

public class Test4{
	public static void main(String[] args) {
		Test5 kim = new Test5();
		Test5 hong = new Test5();
		kim.a = 80; hong.a = 80;
		kim.b = 70; hong.b = 70;
		kim.c = 90; hong.c = 85;
		System.out.println("김의 합계 " + kim.hap() );
		System.out.println("김의 평균 " + kim.avg() );
		System.out.println("홍의 합계 " + hong.hap() );
		System.out.println("홍의 평균 " + hong.avg() );
	}
}