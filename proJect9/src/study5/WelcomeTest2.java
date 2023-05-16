package study5;

public class WelcomeTest2 extends WelcomeTest1{
	public void welcome1() { //오버라이딩(재정의)
		System.out.println("환영합니다.");
	}
	public String welcome2() {
		return "어서와용";
	}
	public static void main(String[] args) {
		WelcomeTest2 s = new WelcomeTest2();
		s.welcome1();
		System.out.println(s.welcome2());
	}

}
