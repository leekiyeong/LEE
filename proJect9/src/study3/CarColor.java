package study3;
class CarInfo{
	String carColor;
	String carName;
	int velocity;
}
public class CarColor extends CarInfo {
	public CarColor(String color,String name,int speed) {
		carName = name;
		velocity = speed;
		carColor = color;
	}
	public static void main(String[] args) {
		CarColor cc = new CarColor("White","Sonata",100);
		System.out.println("carName : "+cc.carName +
						"\ncarVelocity : " + cc.velocity + "Km/h" +
						"\ncarColor : " + cc.carColor);
	}

}
