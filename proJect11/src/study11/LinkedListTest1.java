package study11;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest1 {

	public static void main(String[] args) {
		List<String>list = new LinkedList<String>();
		list.add("103");
		list.add("105");
		list.add("101");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	}

}
