package study1;

public class Test3 {

	public static void main(String[] args) {
		//var color = ["","",""];
		//문자열 타입의 배열
		String[] color = {"blue","yellow","green"};
		//숫자타입의 배열
		//String[] str = {"aa","bb",77}; // (X) 타입혼합불가
		byte[] a1 = {50,60,70};
		short[] a2 = {70,80,90};
		int[] a3 = {98,88,92};
		long[] a4 = {1000L,3000L,5000L};
		System.out.println(a1);//정상출력 x
		System.out.println("byte : " + a1[0] + "," + a1[1] + "," + a1[2]);
		System.out.println("long : " + a4[0]);
		
		float[] f1 = {2.4f,3.2f,2.2f,};
		System.out.println("float : " + f1[0]);
		double[] d1 = {22.8,33.5,44.2};
		System.out.println("double : " + d1[0]);
		double d2 = 12;
		System.out.println("double형에 정수넣으면? : " + d2); //12.0
		System.out.println("--------------------------------------");
		System.out.println("풀어보기");
		
		int[] score = {90,80,88,10,30,80,76};
		int result = 0;
		int avg = 0;
		result += score[0];
		result += score[1];
		result += score[2];
		result += score[3];
		result += score[4];
		result += score[5];
		result += score[6];
		avg = result/score.length;
		System.out.println("score의 합은 : " + result + "입니다.");
		System.out.println("score의 평균은 : " + avg + "입니다.");
	}

}
