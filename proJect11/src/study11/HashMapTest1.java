package study11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest1 {

	public static void main(String[] args) {
		Map<String,String>map1 = new HashMap<String,String>();
		map1.put("a","11");
		map1.put("b","22");
		map1.put("c","33");
		
		System.out.println(map1);
		System.out.println(map1.get("a"));
		System.out.println(map1.get("b"));
		System.out.println(map1.get("c"));
		System.out.println("------------------------");
		
		Map<String,Integer>map2 = new HashMap<String,Integer>();
		map2.put("a",11);
		map2.put("b",22);
		map2.put("c",33);
		
		System.out.println(map2);
		System.out.println(map2.get("a"));
		System.out.println(map2.get("b"));
		System.out.println(map2.get("c"));
		System.out.println("------------------------");
		
		Map<Integer,String>map3 = new HashMap<Integer,String>();
		map3.put(5,"11");
		map3.put(11,"22");
		map3.put(17,"33");
		
		System.out.println(map3);
		System.out.println(map3.get(5));
		System.out.println(map3.get(11));
		System.out.println(map3.get(17));
		System.out.println("------------------------");
		
		
		
		Iterator<Integer>keys = map3.keySet().iterator();
		System.out.println("키값 : 벨류값");
		while(keys.hasNext()) {
			int key = keys.next();
			String value = map3.get(key);
			System.out.println(key + " : " + value);
		}
	}

}




















