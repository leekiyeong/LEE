package study2;

public class BoardWrite {

	public static void main(String[] args) {
		BoardVO s1 = new BoardVO();
		s1.setTitle(" 오늘의 기분 ");
		s1.setPass("1234 asdf");
		s1.setName("이기영");
		s1.setContent("점심먹을 생각에 기분이 좋아요  ");
		s1.setEmail("pyocosss@naver.com");
		System.out.println(s1.getTitle());
		System.out.println(s1.getPass());
		System.out.println(s1.getName());
		System.out.println(s1.getContent());
		System.out.println(s1.getEmail());
	}

}
