package study5;
class Program1{
	int score = 100;
	public void pgName() {
		System.out.println("JAVA");
	}
}
class Program2 extends Program1{
	public void pgName() {
		System.out.println("JSP");
	}
	public void ProgramAll() {
		super.pgName(); //상속관계에서 부모클래스를 지정
		this.pgName();
	}
}
public class SuperThisExam {

	public static void main(String[] args) {
		//Program1 a = new Program1();
		//참조클래스 참조변수 = new 생성자();
		Program2 b = new Program2();
		System.out.println(b.score);
		//a.pgName();
		b.pgName(); //오버라이딩을 통해 JSP 출력
		b.ProgramAll();//super 키워드를 통해 부모레벨의 pgName인 JAVA와
					   //this 키워드를 통해 자식레벨의 pgName인 JSP가 출력
		
	}

}
