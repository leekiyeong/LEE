package study5;

interface Cookie {
	public void makeCookie();
	public void makeSalad();
}

class MyCook implements Cookie{

	public void makeCookie() {
		System.out.println("내가 만든 꾸끼");
	}

	public void makeSalad() {
		System.out.println("내가 만든 샐러드");
	}
}
public class CookieTest {

	public static void main(String[] args) {
		MyCook my = new MyCook();
		my.makeCookie();
		my.makeSalad();
	}

}
