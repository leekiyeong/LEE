package studyOOPTest2;
class TvInfo{
	String model;
	String color;
	int size;
	int price;
}
public class TvApp1 {

	public static void main(String[] args) {
		TvInfo info = new TvInfo();
		TvInfo info2 = new TvInfo();
		info.model = "M01TV";
		info.color = "Red";
		info.size = 50;
		info.price = 150;
		info2.model = "M02TV";
		info2.color = "Blue";
		info2.size = 55;
		info2.price = 200;
		System.out.println("모델명 : "+ info.model + " 색상 : " + info.color
							+" 크기 : " + info.size + "인치 가격 : " + info.price + 
							"만원");
		
		System.out.println("모델명 : "+ info2.model + " 색상 : " + info2.color
				+" 크기 : " + info2.size + "인치 가격 : " + info2.price + 
				"만원");
	}

}
