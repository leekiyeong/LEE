package study5;
class Customer1VO{
	private String name;
	private int year;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
class Customer2VO extends Customer1VO{
	private String phone;
	private int age;
	private String address;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

public class CustomerMng {

	public static void main(String[] args) {
		Customer2VO c = new Customer2VO();
		c.setName("이기영");
		c.setPhone("010-5246-6988");
		c.setAge(26);
		c.setAddress("경기 구리");
		System.out.println("Name : " + c.getName());
		System.out.println("Phone : " + c.getPhone());		
		System.out.println("Age : " + c.getAge());
		System.out.println("Adr : " + c.getAddress());
	}

}
