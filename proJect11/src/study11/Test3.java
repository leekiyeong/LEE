package study11;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		List<String>list1 = new ArrayList<String>();
		list1.add("50");
		list1.add("60");
		list1.add("70");
		int hap = 0;
		int avg = 0;
		for(int i=0; i<list1.size(); i++) {
			hap += Integer.parseInt(list1.get(i));
		}
		avg = hap/3;
		System.out.println("총점 : " + hap);
		System.out.println("평균 : " + avg);
		
	}

}
