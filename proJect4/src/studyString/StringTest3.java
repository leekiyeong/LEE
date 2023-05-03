package studyString;

public class StringTest3 {

	public static void main(String[] args) {
		
		System.out.println("풀어보기2");
		String title = "프로그래밍 입문";
		String content = "자바를 이용하여 기초부터 중급까지 완성한다.";
		if(title.contains("자바")==true &&
		   content.contains("자바")==true) {
			System.out.println("자바라는 단어가 모두 포함되었습니다.");
		}else if(title.contains("자바")==true ||
		   content.contains("자바")==true) {
			System.out.println("자바라는 단어가 한쪽만 포함되었습니다.");
		}else if(title.contains("자바")==false &&
		   content.contains("자바")==false) {
			System.out.println("자바라는 단어가 모두 포함되지 않았습니다.");
		}
	
	}

}
