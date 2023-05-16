package study5;

abstract class StudentService {
	abstract public int sum();
}

class StudentImpl extends StudentService{
	private String name;
	private int eng;
	private int kor;
	
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

	public int sum() {
		return getEng() + getKor();
	}

}
public class StudentControl {

	public static void main(String[] args) {
		int avg = 0;
		
		StudentImpl s1 = new StudentImpl();
		s1.setName("이기영");
		s1.setEng(50);
		s1.setKor(100);
		avg = s1.sum()/2;
		
		System.out.println(s1.getName());
		System.out.println(s1.getEng());
		System.out.println(s1.getKor());
		System.out.println(avg);
		
		
	}

}