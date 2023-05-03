package studyWhile;

public class Test8 {

	public static void main(String[] args) {
		int[][] classA = { {90,80,70} , {50,100,100} };
		int[] hap = new int[2];
		
		int avg1 = 0;
		int avg2 = 0;
					//2
		for(int i=0; i<classA.length;i++) {
			for(int j=0; j<classA[i].length;j++) {
				hap[i] +=classA[i][j];
			}
		}
		int len1 = classA[0].length;
		int len2 = classA[1].length;
		int len3 = (len1 + len2);
		System.out.println("1반 총점 : " + hap[0] + "점/평균 : " + hap[0]/len1 + "점");
		System.out.println("2반 총점 : " + hap[1] + "점/평균 : " + hap[1]/len2 + "점");
		System.out.println("전체 평균 : " + (hap[0]+hap[1])/len3);
	}
}
