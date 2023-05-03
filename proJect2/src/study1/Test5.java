package study1;

public class Test5 {

	public static void main(String[] args) {
		
		int[] jumsu = new int[2];
		jumsu[0] = 88;
		jumsu[1] = 80;
		System.out.println(jumsu.length);
		System.out.println("[0] : " + jumsu[0]);
		System.out.println("[1] : " + jumsu[1]);
		
		int[][] jumsu11 = { {90,80,70},{50,40,30} };
		int[][] jumsu22 = new int[2][3];
		jumsu22[0][0] = 90;
		jumsu22[0][1] = 80;
		jumsu22[0][2] = 70;
		jumsu22[1][0] = 50;
		jumsu22[1][1] = 40;
		jumsu22[1][2] = 30;
		System.out.println(jumsu11.length);//2
		System.out.println(jumsu11[0].length);//3
		System.out.println(jumsu11[0][2]);//70
		System.out.println(jumsu22[0][2]);//70
		
	}

}
