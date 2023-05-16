package study3;

class AppleInfo{
	//맴버변수, 인스턴스 변수 (객체화 필요)
	String name = "사과";
	int price = 3000;
	void discount() {
		price = price - (price/10);
	}
}
class CherryInfo{
	//맴버변수, 클래스변수 (객체화 없이 사용가능)
	static String name = "체리";
	static int price = 5000;
	static void discount() {
		price = price - (price/10);
	}
}
public class MyFruit extends AppleInfo{

	public static void main(String[] args) {
		//System.out.println(name + " : " + price);
		//discount();
		//System.out.println(name + " : " + price);
		
		//AppleInfo 객체처리
		MyFruit info = new MyFruit(); //상속하였을 경우 MyFruit 안에 AppleInfo 정보 삽입
		System.out.println(info.name);//자기자신을 객체처리 하여 사용 가능.
		info.discount();
		System.out.println(info.price);
	}

}
