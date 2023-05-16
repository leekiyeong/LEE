package study11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {
		List<String>list1 = new ArrayList<String>();
		System.out.println("String type");
		list1.add("20"); //index : 0
		list1.add("30"); //index : 1
		list1.add("40"); //index : 2
		System.out.println(list1);
		System.out.println(list1.get(0)); 
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println("배열size : " + list1.size());
		System.out.println("--------------------------");
		
		System.out.println("Integer type");
		List<Integer>list2 = new ArrayList<Integer>();
		list2.add(20); //index : 0
		list2.add(30); //index : 1
		list2.add(40); //index : 2
		System.out.println(list2); 
		System.out.println(list2.get(0)); 
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));
		System.out.println("배열size : " + list2.size());
		System.out.println("--------------------------");
		
		System.out.println("Double type");
		List<Double>list3 = new ArrayList<Double>();
		list3.add(20.2); //index : 0
		list3.add(30.3); //index : 1
		list3.add(40.4); //index : 2
		System.out.println(list3); 
		System.out.println(list3.get(0)); 
		System.out.println(list3.get(1));
		System.out.println(list3.get(2));
		System.out.println("배열size : " + list3.size());
		System.out.println("--------------------------");
		
		System.out.println("String Test");
		String[] a1 = {"aa","bb","cc"};
		System.out.println(Arrays.toString(a1));
		System.out.println(a1[0]);
		System.out.println(a1.length);
		System.out.println("--------------------------");

		System.out.println("for Test");
		for(int i=0; i<list1.size(); i++) {
			System.out.println("list["+i+"] : " + list1.get(i));
		}
		System.out.println();
		for(int i=0; i<a1.length; i++) {
			System.out.println("배열["+i+"] : " + a1[i]);
		}
	}

}










