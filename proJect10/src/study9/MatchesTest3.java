package study9;

public class MatchesTest3 {

	public static void main(String[] args) {
		//회원 아이디 체크(영문,숫자,특수문자(_,-,$)포함 6~12자)
		String userId = "a213132--";
		String pattern = "^[a-zA-Z]{1}[a-zA-Z0-9_-]{5,11}";
		System.out.println("아이디체크 : "+ userId +  "/" +userId.matches(pattern));
		
		//회원명 체크(한글,영문 2~50자)
		String name = "LEE기영";
		pattern = "^[a-zA-Z가-힣]{2,50}$";
		System.out.println("이름체크 : " + name + "/" + name.matches(pattern));
		
		//학점체크(A~D,F,+,-,0)
		String jumsu = "A";
		pattern = "^(A|B|C|D|F){1}(\\+|-)?";
		System.out.println("학점체크 : " + jumsu + "/" + jumsu.matches(pattern));
		
		//공백여부체크
		String content = "aaa";
		pattern = "[[:space:]]+"; //공백이 아니면 true
		System.out.println("content : " + content.matches(pattern));
		
		//공백여부체크 2
		String content2 = "a a".trim();
		pattern = ".+";
		System.out.println("content2 : " + content2.matches(pattern));
	}

}
