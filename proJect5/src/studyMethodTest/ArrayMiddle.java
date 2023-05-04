package studyMethodTest;

import java.util.Arrays;

public class ArrayMiddle {

	public static void main(String[] args) {
		int[] arr = {30,40,20,10,15,20,50,30};
		System.out.println(ArrayMiddle(arr));

	}
	public static double ArrayMiddle(int[] arr) {
		int len = arr.length;
		Arrays.sort(arr);
		if(len%2==0) {
			int mid = len/2;
			return(arr[mid-1]);
		}else {
			int mid = len/2;
			return(arr[mid]);
		}
	}
}
