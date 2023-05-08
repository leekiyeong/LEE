package study1;

public class SampleSum {
	//다형성 > 오버로딩 : 같은 이름의 메소드를 생성하는 기법
    // 				  (매개변수의 개수와 타입을 달리하여)
	public void sum() {
		System.out.println(10+10);
	}
	public void sum(int a) {
		System.out.println(a+10);
	}
	public void sum(int a,int b) {
		System.out.println(a+b);
	}
	public void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		SampleSum s = new SampleSum();
		//new 키워드 뒤에오는 생성자
		//생성자와 같은 이름을 가진 클래스를 인스턴스(메모리로 올림)처리
		s.sum();
		s.sum(10);
		s.sum(10,20);
		s.sum(30,50,100);
	}

}
