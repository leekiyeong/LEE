package study1;

public class Test5 {

	public static void main(String[] args) {
		
		int a = 1;
		++a; //2
		++a; //3
		a++; //4
		int b = a++; //b=4 주고 a 1증가 a=5
		int c = ++b; //b에 1더하고(b=5) c에 5를줌 c=5
		
		System.out.println(a); //5
		System.out.println(b); //5
		System.out.println(c); //5
	}
}
