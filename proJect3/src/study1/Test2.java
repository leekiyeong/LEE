package study1;

public class Test2 {

	public static void main(String[] args) {
		int kor = 45;
		int eng = 70;
		if(kor >= 60 && eng >=60) 
			System.out.println("합격");
		else if(kor < 60 || eng < 60) {
			if(kor < 60 && eng < 60)
				System.out.println("불합격");
			else 
				System.out.println("재시험");
		}
	
	}

}
