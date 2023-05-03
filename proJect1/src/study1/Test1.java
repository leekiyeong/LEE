package study1;

public class Test1 {

	public static void main(String[] args) {
		String apple = "사과";
		String banana = "바나나"; //String 문자열 변수
		System.out.println(apple);
		System.out.println(banana);
		
		apple = "꿀사과"; //String apple = x 변수 재정의 불가
		System.out.println(apple);
		
		int price = 2000; //int 정수형 변수
		//String price = "2000"; //타입이 달라도 같은변수명 x
		System.out.println(price);
		
		String a4 = "ab c"; //변수값 공백 가능
		System.out.println(a4);
		
		//int 1b = 100; (x)
		//int b5 = 'a';(o)
		int ab_=10;
		int $b = 10;
		System.out.println(ab_);
		System.out.println($b);

	}

}
