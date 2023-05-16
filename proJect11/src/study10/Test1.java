package study10;

public class Test1 {

	public static void main(String[] args) {
		
		//정규표현식(핸드폰 번호 체크)
		
		String phone = "010-2222-1234";
		String pattern = "01([016-9])-[0-9]{3,4}-[0-9]{4}";
		
		if(phone.matches(pattern)) {
			System.out.println("올바른 핸드폰 번호");
		} else {
			System.out.println("핸드폰 번호 확인 바람");
		}
		
		//예외처리
		//문법 오류 이외 사항이 발생하여 프로그램 중단을 방지한다.
		//ex) DB연결, I/O 연결 시 필수적으로 예외처리를 해야함
		int a = 100;
		int b = 0;
		int[] c = {1,2,3};
		String d = "abc";
		
		//ArithmeticException
		//ArrayIndexOutOfBoundsException
		//NumberFormatException
		//StringIndexOutOfBoundsException
		
		try {
		//System.out.println(a/b); //zere error
		//System.out.println(c[4]);//자리번호 error(배열)
		System.out.println(c[0]); //출력 o >> 1
		System.out.println(Integer.parseInt(d));
		System.out.println(c[2]); //출력 x
		//System.out.println(Integer.parseInt(d)); //형변환 error
		//System.out.println(d.charAt(3)); //자리번호 error(문자열)
		}
		catch(ArithmeticException e) {
			System.out.println("zero 오류 발생했습니다.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 자리번호 오류 발생했습니다.");
		}
		catch(NumberFormatException e) {
			System.out.println("형변환 오류 발생했습니다.");
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("문자열 자리번호 오류 발생했습니다.");
		}
		catch(Exception e) {
			System.out.println("오류가 발생했습니다.");
		}
		System.out.println(d.charAt(0)); //정상출력 a
	}
}


