package studyMethodTest;

public class ArrayBig {
	
	public static void main(String[] args) {
		int[] arr = {120,30,40,50};
		System.out.println(ArrayBig(arr));
	}
	public static int ArrayBig(int[] n1) {
		int max = n1[0];
		for(int n : n1) {
			max = Math.max(max,n);
		 }
		return max;
	}
}
