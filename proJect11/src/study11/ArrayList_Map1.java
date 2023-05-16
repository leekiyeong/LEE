package study11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayList_Map1 {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List<Map>list1 = new ArrayList<Map>();
		Map<String,String>map1 = new HashMap<String,String>();
		
		map1.put("id","test1");
		map1.put("eng","90");
		map1.put("kor","80");
		map1.put("math","84");
		list1.add(map1);
		
		map1 = new HashMap<String,String>();
		map1.put("id","test2");
		map1.put("eng","80");
		map1.put("kor","82");
		map1.put("math","90");
		list1.add(map1);
		
		System.out.println("list 전체 : " + list1);
		System.out.println("list 행 길이 : " + list1.size());
		System.out.println("list 1행 : " + list1.get(0));
		System.out.println("list 2행 : " + list1.get(1));
		System.out.println("list 1행길이 : " + list1.get(0).size());
		System.out.println("list 2행길이 : " + list1.get(1).size());
	}

}
