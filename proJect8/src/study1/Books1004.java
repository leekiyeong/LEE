package study1;

public class Books1004 {
	int price = 10000;
	String bookName;
	//public Books1004() {} 생략가능
	public Books1004(String bookName) {
		this.bookName = bookName;
	}
	public Books1004(String bookName, int price) {
		this.bookName = bookName;
		this.price = price;
	}
	
	public static void main(String[] args) {
		Books1004 java = new Books1004("자바의 첫걸음");
		Books1004 linux = new Books1004("리눅스 마스터",35000);
		System.out.println("My book : " + java.bookName
							+ ", 가격 : " + java.price);
		System.out.println("your book : " + linux.bookName 
							+ ", 가격 : " + linux.price);
	}

}
