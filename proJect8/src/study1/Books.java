package study1;

public class Books {
	String bookName = "JSP기초";
	//생성자 : 메소드와 같은 모습이며 객체화 될 때 자동실행 되는 요소
	public Books() {
		System.out.println("한빛미디어");
	}
	public Books(String name) {
		bookName = name;
	}
	public static void main(String[] args) {
		Books myBook = new Books(); //한빛미디어
		Books yourBook = new Books("JAVA");
		System.out.println(myBook.bookName);
		System.out.println(yourBook.bookName);
	}

}
