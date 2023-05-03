package studyMath;

import java.util.Arrays;


public class MathTest2 {

	public static void main(String[] args) {
		System.out.println("풀어보기1");
		int n1 = 1000;
		int n2 = 1200;
		int max1 = Math.max(n1,n2);
		int min = Math.min(n1,n2);
		System.out.println("max : " + max1 + " / min : " + min);
		System.out.println("----------------");
		
		System.out.println("풀어보기2");
		int[] a1 = {90,80,-40};
		int hap = 0;
		for(int i=0;i<a1.length;i++) {
			hap += Math.abs(a1[i]);
		}	int avg = hap/a1.length;
		System.out.println("총합 : " + hap + " / 평균 : " + avg);
		System.out.println("----------------");
		
		System.out.println("풀어보기3");
		int[] a2 = {51,45,23,20,34,21};
		int max2 = a2[0];
		int min2 = a2[0];
		for(int i=0;i<a2.length;i++) {
			if(Math.max(a2[i],max2) == a2[i])
				max2 = a2[i];
			if(Math.min(a2[i],min2) == a2[i])
				min2 = a2[i];
		}
		System.out.println("최대값 : " + max2 + " / 최소값 : " + min2 );
		System.out.println("----------------");		
		
		System.out.println("풀어보기4");
		System.out.println("로또 당첨 번호는?");
		
		for(int i=0;i<6;i++) {
			System.out.print((int)(Math.random()*45)+1 + " ");
		}
		System.out.println("");
		System.out.println("중복불가");
		int[] lotto = new int[6];
		int idx=0;
		while(true) {
			boolean b1 = false;
			int number = (int)(Math.random()*45)+1;
			for(int i=0;i<6;i++) {
				if(number==lotto[i]) b1= true;
			}
			if(b1==false) {
				lotto[idx] = number;
			}else {
				continue;
			}
			idx++;
			if(idx==6) break;
		}	for(int i : lotto)
			System.out.print(i + " ");
	}

}
