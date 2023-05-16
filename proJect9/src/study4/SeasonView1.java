package study4;

public class SeasonView1 extends Season1{
	public void summer() { //여름의 설정을 오버라이딩을 통해 덮어쓴다.
		name = "Summer";
		firstMonth = 6;
		lastMonth = 8;
		avgTemp = 40;
		
	}
	public static void main(String[] args) {
		SeasonView1 ss = new SeasonView1();
		ss.summer();
		ss.seasionPrint();
		
	}

}
