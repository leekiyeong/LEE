package studyOOPTest;
class MySubject1{
	//클래스변수(전역변수) 클래스이름으로 접근가능
	static String title; //static선언시 공유메모리영역 
				  		 //즉 title = "oracle"
	//인스턴스변수(객체변수)
	int price; //고유메모리
			   //st1.price = 100
			   //st2.price = 200
}
public class MySchool1 {

	public static void main(String[] args) {
		MySubject1 st1 = new MySubject1();
		MySubject1 st2 = new MySubject1();
		st1.title = "java";
		st2.title = "oracle";
		System.out.println(st1.title);
		System.out.println(st2.title);
		st1.price = 100;
		st2.price = 200;
		System.out.println(st1.price);
		System.out.println(st2.price);
	}

}
