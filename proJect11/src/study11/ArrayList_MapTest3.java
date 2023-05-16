package study11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ArrayList_MapTest3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List<Map>list = new ArrayList<Map>();
		Map<String,String>board = new HashMap<String,String>();
		
		board.put("no","1");
		board.put("hit","35");
		board.put("rdate","2021-05-01");
		board.put("name","홍길동");
		board.put("title","공지사항1");
		list.add(board);
		
		board = new HashMap<String,String>();
		
		board.put("no","2");
		board.put("hit","3");
		board.put("rdate","2021-05-05");
		board.put("name","제임스");
		board.put("title","공지사항2");
		list.add(board);
		
		for(Map<String,String>board1 : list) {
			Iterator<String>keys = board1.keySet().iterator();
			while(keys.hasNext()) {
				String key = keys.next();
				String value = board1.get(key);
				System.out.println(key + " : " + value);
			}
			System.out.println();
		}
		
	}

}
