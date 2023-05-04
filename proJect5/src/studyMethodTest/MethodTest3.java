package studyMethodTest;

public class MethodTest3 {

	public static void main(String[] args) {
		roomSize(100);
	}
	public static void roomSize(int a) {
		float b = (float) (a*(0.3025));
		System.out.println("입력하신 " + a + "평방미터는 " + b + "평 입니다.");
		
	}
}
