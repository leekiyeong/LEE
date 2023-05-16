package study11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ArrayList_MapTest2 {

	@SuppressWarnings("unchecked")
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
		
		for(Map<String,String>map2 : list1 ) {
			Iterator<String>keys = map2.keySet().iterator();
			while(keys.hasNext()) {
				String key = keys.next();
				String value = map2.get(key);
				System.out.println(key + " : " + value);
			}
		}
		
	}
}
