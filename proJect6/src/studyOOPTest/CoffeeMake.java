package studyOOPTest;
class CoffeeInfo{
	String name = ""; //인스턴스변수
	int price = 0;//클래스변수
	static String maker = "";
}
public class CoffeeMake {

	public static void main(String[] args) {
		CoffeeInfo coffee1 = new CoffeeInfo();
		coffee1.name = "아메리카노";
		coffee1.price = 3000;
		coffee1.maker = "가나";
		
		CoffeeInfo coffee2 = new CoffeeInfo();
		coffee2.name = "라떼";
		coffee2.price = 4500;
		coffee2.maker = "홍콩";
		
		System.out.println("커피1 이름 : " + coffee1.name);
		System.out.println("커피1 가격 : " + coffee1.price);
		System.out.println("커피1 원산지 : " + coffee1.maker);
		System.out.println("커피2 이름 : " + coffee2.name);
		System.out.println("커피2 가격 : " + coffee2.price);
		System.out.println("커피2 원산지 : " + coffee2.maker);
	}

}
