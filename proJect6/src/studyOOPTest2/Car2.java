package studyOOPTest2;

public class Car2 {
	int speed;
	String carName;
	public void speedUp() {
		speed++;
	}
	public void speedDown() {
		speed--;
		if(speed<0) {
			stop();
		}
	}
	public void stop() {
		speed = 0;
	}

	public static void main(String[] args) {
		Car2 car1 = new Car2();
		Car2 car2 = new Car2();
		car1.carName = "소나타";
		car2.carName = "그랜저";
		car1.speed = 100;
		car2.speed = 90;
		car1.speedUp();
		car1.speedUp();
		System.out.println("차이름 : " + car1.carName);
		System.out.println("현재속도 : " + car1.speed);
		car1.stop();
		System.out.println("차이름 : " + car1.carName);
		System.out.println("현재속도 : " + car1.speed);
		car2.speedUp();
		car2.speedUp();
		System.out.println("차이름 : " + car2.carName);
		System.out.println("현재속도 : " + car2.speed);
		car2.stop();
		System.out.println("차이름 : " + car2.carName);
		System.out.println("현재속도 : " + car2.speed);
	}

}