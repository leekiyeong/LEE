package study10;

public class Test4 {
	
	public static void methodTest1() {
		
		try { //new : 일부로 exception 발생 시킬때 키워드
			throw new Exception("헐~~"); //catch 실행
		} catch(Exception e) { //getMessage : Exception 메세지 실행
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		methodTest1();
	}

}
