package studyMethodTest;

public class ArrayBig {
	
	public static void main(String[] args) {
		int[] arr = {120,30,40,50};
		System.out.println(ArrayBig(arr));
	}
	public static int ArrayBig(int arr[]) {
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		 }
		return max;
	}
}
