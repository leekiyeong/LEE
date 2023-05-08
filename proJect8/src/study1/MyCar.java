package study1;

public class MyCar {
	int maxSpeed;
	String carName;
	String carColor;
	MyCar(String carName, int maxSpeed) { //생성자 만들기
		this.carName = carName;
		this.maxSpeed = maxSpeed;
	}
	MyCar(String carName,int maxSpeed,String carColor) {
		this.carName = carName;
		this.maxSpeed = maxSpeed;
		this.carColor = carColor;
	}
	public void maxSpeedUpdate(int Speed){ //메소드 만들기
		this.maxSpeed += Speed;
	}
	public static void main(String[] args) {
		MyCar car1 = new MyCar("소나타",230);
		MyCar car2 = new MyCar("그랜저",300,"white");
		System.out.println(car1.carName + " : " + car1.maxSpeed);
		System.out.println(car2.carName + " : " + car2.maxSpeed);
		car1.maxSpeedUpdate(-20);
		System.out.println(car1.carName + " : " + car1.maxSpeed);
	}

}
