package studyMethodTest;

public class ArraySmall {
	
	public static void main(String[] args) {
		int[] arr = {120,30,40,50};
		System.out.println(ArraySmall(arr));
	}
	public static int ArraySmall(int[] n1) {
		int min = n1[0];
		for(int n : n1) {
			min = Math.min(min,n);
		 }
		return min;
	}
}

