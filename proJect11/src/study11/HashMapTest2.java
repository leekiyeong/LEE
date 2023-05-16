package study11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest2 {

	public static void main(String[] args) {
		Map<String,String>map1 = new HashMap<String,String>();
		map1.put("0","aa");
		map1.put("1","bb");
		map1.put("3","cc");
		System.out.println(map1);
		System.out.println(map1.get("0"));
		System.out.println(map1.get("1"));
		System.out.println(map1.get("3"));
		System.out.println(map1.size());
		System.out.println("------------------------");
		
		Map<String,String>map2 = new HashMap<String,String>();
		map2.put("userId","pyocosss");
		map2.put("pass","1234");
		map2.put("birthDay","1998-03-16");
		System.out.println(map2);
		System.out.println(map2.get("userId"));
		System.out.println(map2.get("pass"));
		System.out.println(map2.get("birthDay"));
		System.out.println(map2.size());
		System.out.println("------------------------");
		
		Iterator<String>keys = map2.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			String value = map2.get(key);
			System.out.println(key + " : " + value);
		}
	}

}

