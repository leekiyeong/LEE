package study11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest1 {

	public static void main(String[] args) {
		//String[] str = {"50","60","70"};
		List<String>list1 = new ArrayList<String>();
		list1.add("50");
		list1.add("60");
		list1.add("70");
		
		System.out.println(list1);
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println("list1 저장된 객체 수 : " + list1.size() + "개");
		System.out.println("-----------------------------");
		
		list1.remove(1);
		System.out.println(list1);
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println("list1 저장된 객체 수 : " + list1.size() + "개");
		System.out.println("-----------------------------");
		
		List<String>list2 = new ArrayList<String>();
		list2.add(0,"10");
		list2.add(1,"20");
		list2.add(2,"30");
		System.out.println(list2);
		for(int i=0;i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
	}

	
}
