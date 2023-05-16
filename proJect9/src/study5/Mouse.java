package study5;

public class Mouse extends Product {
	
	public int discount() {
		
		return 0;
	}
	
	public static void main(String[] args) {
		//참조클래스 참조변수 = new 생성자();
		Mouse mouse = new Mouse();
		System.out.println(mouse.getName());
		System.out.println(mouse.getPrice());
		System.out.println(mouse.getMaker());
		
		Mouse m1 = new Mouse(); //인스턴스(객체) 처리
		Mouse m2 = new Mouse();
		
		m1.setName("파란마우스");
		m2.setName("검정마우스");

		m1.setPrice(5000);
		m2.setPrice(6000);
		
		m1.setMaker("미국");
		m2.setMaker("미국");
		
		System.out.println("-----------------");
		System.out.println(m1.getName() + " , " 
						 + m1.getPrice() + " , " 
						 + m1.getMaker());
		
		System.out.println("할인가격 : " + m1.discount());
	}

}
