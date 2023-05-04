package studyMethodTest;

public class MethodTest6 {

	public static void main(String[] args) {
		int[] score = {60,70,80,68,78};
		int avg = arraySum(score)/score.length;
		System.out.println("합계 : " + arraySum(score));
		System.out.println("평균 : " + avg);
	}
	public static int arraySum(int[] jumsu) {
		int score = 0;
		for(int i=0;i<jumsu.length;i++) {
			score += jumsu[i];	
		}
		return score;
	}

}
