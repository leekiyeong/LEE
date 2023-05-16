package study11;

import java.util.List;
import java.util.Vector;

public class VectorTest1 {

	public static void main(String[] args) {
		List<String>vector = new Vector<String>();
		vector.add("103");
		vector.add("105");
		vector.add("109");
		System.out.println(vector);
		System.out.println(vector.get(0));
		System.out.println(vector.get(1));
		System.out.println(vector.get(2));
	}

}
