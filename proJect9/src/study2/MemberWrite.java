package study2;

public class MemberWrite {

	public static void main(String[] args) {
		MemberVO s1 = new MemberVO();
		s1.setUserId("ss");
		s1.setPass("321");
		s1.setName("이기영");
		s1.setGender("s");
		s1.setBirthDay("1998-03-16");
		System.out.println(s1.getUserId());
		System.out.println(s1.getPass());
		System.out.println(s1.getName());
		System.out.println(s1.getGender());
		System.out.println(s1.getBirthDay());
		
	}

}
