package study9;

public class ExceptionTest3 {

	public static void main(String[] args) {
		//1.zero error - 나누기
		//2.inder number errer - 배열
		String a1 = "abc";
		String a2 = "123";
		@SuppressWarnings("unused")
		int a3=0;
		int a4=0;
		try {
			a4 = Integer.parseInt(a1);
			a3 = Integer.parseInt(a2);
		} catch(NumberFormatException e) {
			System.out.println("형변환 오류");
		} catch(Exception e) {
			System.out.println("오류!");
		}
		System.out.println(a4);
		
		String str = "abc";
		//StringIndexOutOfBoundsException
		try {
			System.out.println(str.charAt(3));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("문자열 자리번호 오류");
		}catch(Exception e) {
			System.out.println("오류!");
		}
	}

}
