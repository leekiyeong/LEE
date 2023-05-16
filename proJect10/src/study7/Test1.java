package study7;

interface Test2{ //추상화
	public int hap(); //메소드의 명세화
}
class Test3 implements Test2{ //상속
	//맴버변수, 인스턴스(객체)변수
	private String name;  //캡슐화
	private int eng;      //private -> get/set 
	private int kor;
	//맴버변수, 클래스변수(전역변수) 
	static String title;  
					   //Test3가 Test2를 상속받았기 때문에 hap을 재정의해서 사용해야함
	public int hap() { //다형성 > 오버라이딩
		return eng + kor;
	}
	
	public int hap(int a,int b) { //다형성 > 오버로딩 
		return a+b;				  //매개변수를 바꿔서 재정의
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}
}

public class Test1 extends Test3{

	public static void main(String[] args) {
		//참조클래스 참조변수 = new 생성자
		Test1 test1 = new Test1(); //인스턴스처리
		test1.setName("홍길동");
		test1.setEng(60);
		test1.setKor(100);
		System.out.println(test1.getName());
		System.out.println("영어 점수 : " + test1.getEng());
		System.out.println("국어 점수 : " + test1.getKor());		
		System.out.println("합계 : " + test1.hap());
		System.out.println("평균 : " + (test1.hap()/2));
	}

}

















