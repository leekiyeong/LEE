package study1;

public class Test2 {

	public static void main(String[] args) {
		//논리
		boolean a1 = true; 		//o
		boolean a2 = false;		//o
		//boolean a3 = "true";  //x
		//boolean a4 = 1;		//x
		boolean a5 = (10 > 20); //o
		System.out.println(a5); //true or false
		//String s1 = (10 < 20);//x
		
		final String color = "blue";
		//color = "red"; 재정의 불가
		System.out.println(color);
		
	}
	
}
