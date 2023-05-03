package studyMethod;

public class MethodTest1 {
	public static void sample1() {
		System.out.println("one");
		for(int i=0;i<10;i++) {
			System.out.println("*");
		}
	}
	public static void sample2() {
		System.out.println("two");
	}
	public static void sample3() {
		System.out.println("three");
	}
	public static void main(String[] args) {
		System.out.println("111");
		sample1();
		sample2();
		sample3();
	}

}
