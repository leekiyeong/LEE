package study1;

public class Test10 {
	int a = 10; //인스턴스 변수(메소드 밖에 존재)
	//생성자 : 이름의 첫글자가 반드시 대문자
	//		  호출불가(메소드처럼 사용불가) 	   

	public Test10() { //생성자 기본
		System.out.println("-Test10 클래스의 객체화-");
	} 
	//생성자 다형성 >> 오버로딩
	public Test10(String a) {
		System.out.println("-Test10 클래스의 인스턴스화-");
	}
	
	public static void main(String[] args) {
		//Test10 t1 = new Test10();//객체 처리
						//생성자
		Test10 t2 = new Test10("abc");
		
		//System.out.println(t1.a);
		
	}

}
