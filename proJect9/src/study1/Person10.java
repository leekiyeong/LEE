package study1;

public class Person10 {
	//접근지정자(캡슐화)
	public String name;   //같은패키지(o) 다른패키지(o) 전체허용(o)
	protected int height; //같은패키지(o) 다른패키지(x) 상속관계(o)
			  int age;	  //같은패키지(o) 다른패키지(x) 상속관계(x)
	@SuppressWarnings("unused")
	private int weight;	  //같은패키지(x) 다른패키지(x) 상속관계(x)
	void abc() {
		name = "홍길동"; //내부접근(o)
		height = 170;  //내부접근(o) 
		age = 30; 	   //내부접근(o)
		weight = 50;   //내부접근(o)
	}
}
