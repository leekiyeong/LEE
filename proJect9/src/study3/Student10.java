package study3;

import study1.Person10; //패키지 다른경우 경로지정

public class Student10 extends Person10{
	public String name;
	protected int height;
			  int age;
	@SuppressWarnings("unused")
	private int weight;
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Student10 ss = new Student10();
	//	ss.name = "홍길동"; (o)
	//	ss.height = 170; (o)	
	//	ss.age = 30; (x)
	//	ss.weight = 50; (x)
		
	}

}
