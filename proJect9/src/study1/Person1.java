package study1;

public class Person1 {
	//맴버변수,인스턴스(객체)변수
	private int age;	
	public String name;
	private int height;
	private int weight;
	//맴버변수,클래스변수
	static int score;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		if(weight < 0 || weight > 300) {
			weight = 0;
		}
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0 || age > 150) {
			age = 0;
		}
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		if(height < 0 || height > 250) {
			height = 0;
		}
		this.height = height;
	}
}
