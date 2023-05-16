package study2;

import study1.Person1;

public class Test1 {

	public static void main(String[] args) {
		Person1 s1 = new Person1();
		s1.name = "홍길동"; //public	  다른패키지 접근가능
		//s1.age = 30;	  //(생략)     다른패키지 접근불가
		//s1.height = 170;//protected 다른패키지 접근불가
		//s1.weight = 70; //private
		s1.setWeight(70);
				
				
	}

}
