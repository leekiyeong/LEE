package studyMethodTest;

public class MethodTest5 {

	public static void main(String[] args) {
		int a = 60;
		int b = 58;
		myExam(a,b);
	}
	public static void myExam(int a,int b) {
		if(a>=60 && b>=60)
			System.out.println("a과목 " + a + ",b과목 " + b + "로 합격입니다.");
		else if(a<60 || b<60)
			System.out.println("a과목 " + a + ",b과목 " + b + "로 재시험입니다.");
		else if(a<60 && b<60)
			System.out.println("a과목 " + a + ",b과목 " + b + "로 불합격입니다.");
	}
}
