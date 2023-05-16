package study9;

public class MatchesTest2 {

	public static void main(String[] args) {
		String birthday = "1980-02-22";
		String pattern = "[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}";
		if(birthday.matches(pattern)) {
			System.out.println(birthday + "// 올바른 날짜");
		}else {
			System.out.println(birthday + "// 날짜 다시 입력");
		}
		
		String str = "공지사항 게시 이미지";
		pattern = ".*게시판.*";
		if(str.matches(pattern)) {
			System.out.println(str + "// '게시판' 문자열 있음");
		}else {
			System.out.println(str + "// '게시판' 문자열 없음!");
		}
		
		String txt1 = "0201312aa";
		pattern = ".*[0-9].*";
		if(txt1.matches(pattern)) {
			System.out.println(txt1 + "// 숫자 있음");
		}else {
			System.out.println(txt1 + "// 숫자 없음");
		}
		
		String phone = "010-22222-1234";
		pattern = "01(0|1|[6-9])-[0-9]{3,4}-[0-9]{4}";
		if(phone.matches(pattern)) {
			System.out.println(phone + "// 올바른 번호");
		}else {
			System.out.println(phone + "// 올바른 번호아님");
		}
		
		String name = "홍길동";
		pattern = "[가-힣]+";
		if(name.matches(pattern)) {
			System.out.println(name + "// 올바른 이름");
		}else {
			System.out.println(name + "// 올바른 이름 아님");
		}
		
		String email = "pyocosss@naver.com";
		pattern = "^[a-zA-Z]+[a-zA-Z0-9_-]*@[a-zA-Z0-9]+\\.[a-zA-Z]+$"
				+ "";
		if(email.matches(pattern)) {
			System.out.println(email + "// 올바른 이메일");
		}else {
			System.out.println(email + "// 올바른 이메일 아님");
		}
	}

}
