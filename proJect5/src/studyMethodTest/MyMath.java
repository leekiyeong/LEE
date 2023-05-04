package studyMethodTest;

public class MyMath {

	public static void main(String[] args) {
		double a1 = 122.12345712;
		//2자리 -> a1 * 100 = 1212.345712
		//	   -> 1212/100 = 12.12
		//3자리 -> a1 * 1000 = 12123.45712
		//	   -> 12123/1000 = 12.123
		//int a2 = (int)(a1*100);
		//double a3 = a2/(double)100;
		System.out.println(MyPoint(a1,2));
	}
	public static double MyPoint(double a1,int num) {
		int a2 = (int)(a1*Math.pow(10, num));
		double a3 = a2/(double)Math.pow(10, num);
		return a3;
	}
}
