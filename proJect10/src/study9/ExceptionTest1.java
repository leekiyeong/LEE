package study9;

public class ExceptionTest1 {

	public static void main(String[] args) {
		//예제 1
		int a = 0;
		int b = 20;
		System.out.println(a/b);
		
		int c = 10;
		int d = 0;
		try {
			System.out.println(c/d);
		}catch(Exception e) {
			System.out.println("잘못된 연산");
		}
		
		//예제 2
		int[] array1 = {11,22,33,44,55};
		try {
			System.out.println(array1[10]);
		}catch(Exception e){
			System.out.println("배열오류");
		}
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println("-----------------");
		//예제 3
		try {
			System.out.println(array1[0]);
			System.out.println(array1[10]);
			System.out.println(array1[1]);
		}catch(Exception e){
			System.out.println("배열오류");
		}
		System.out.println(array1[2]);
		System.out.println(array1[3]);
	}

}
