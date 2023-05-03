package studyWhile;

public class Test1 {

	public static void main(String[] args) {
		int[] month = {1,3,5,10,12};
		int idx = 0;
		while(idx < month.length) {
			System.out.println(month[idx] + "월");
			idx++;
		}
	}

}
