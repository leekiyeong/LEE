package study11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test4 {

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
		
		int hap = 0;
		
		for(int i=0; i<list.size();i++) {
			String rdate = (String)list.get(i).get("rdate");
			String hit = (String)list.get(i).get("hit");
			
			rdate = rdate.replace("-","");
			list.get(i).put("rdate",rdate);
			
			int hitInt = Integer.parseInt(hit) + 100;
			list.get(i).put("hit",hitInt);
			hap += hitInt;
		}
		
		System.out.println(list);
		System.out.println("총 조회수 : " + hap + "회");
		System.out.println("조회수 평균 : " + hap/list.size() + "회");
		
	}

}
