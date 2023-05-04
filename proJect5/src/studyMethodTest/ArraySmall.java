package studyMethodTest;

public class ArraySmall {

	public static void main(String[] args) {
		int[] arr = {120,30,20,50};
		System.out.println(ArraySmall(arr));

	}
	public static int ArraySmall(int arr[]) {
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		 }
		return min;
	}
}
