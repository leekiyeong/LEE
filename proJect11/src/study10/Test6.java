package study10;

public class Test6 {
	static void abc() throws MyException{
		System.out.println("haha");
	}
	public static void main(String[] args) {
		try {
			abc();
			throw new MyException();
		} catch(MyException e) {
			System.out.println(e.toTest());
		}
	}

}
