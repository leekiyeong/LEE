package study5;

abstract class Sound{ //상속만을 위한 클래스
	abstract void cry(); //추상메소드(명세처리)
}
class Cat extends Sound{
	void cry() {
		System.out.println("야옹야옹!");
	}
}
class Dog extends Sound{
	void cry() {
		System.out.println("멍멍!");
	}
}
public class Animal {

	public static void main(String[] args) {
		//Sound ss = new Sound(); (x) 추상클래스는 객체화 할 수 없다.
		Cat cat = new Cat();
		Dog dog = new Dog();
		cat.cry();
		dog.cry();
	}

}
