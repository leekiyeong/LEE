package study11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ArrayList_MapTest4 {

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
		
		
		String hitValueSum = "0";
		int hitValueAvgInt = 0;
		for(Map<String,String>board1 : list) {
			Iterator<String>keys = board1.keySet().iterator();
			while(keys.hasNext()) {
				String key = keys.next(); //키를 하나씩 가져옴
				String value = board1.get(key);
				if(key.equals("rdate")) {
					value = value.replace("-","");
				}
				if(key.equals("hit")) {
					 int hitValue = Integer.parseInt(value);
					 hitValue += 100;
					 value = String.valueOf(hitValue);
					 
					 int hitValueSumInt = Integer.parseInt(hitValueSum);
					 hitValueSumInt += hitValue;
					 hitValueAvgInt = hitValueSumInt/(list.size());
					 hitValueSum = String.valueOf(hitValueSumInt);
				}
				System.out.println(key + " : " + value);
				
			}
			System.out.println();
		}
		
		@SuppressWarnings("rawtypes")
		Map arr1 = list.get(0);
		@SuppressWarnings("rawtypes")
		Map arr2 = list.get(1);
		
		System.out.println("Hit Value Sum : " + hitValueSum );
		System.out.println("Hit Value Avg : " + hitValueAvgInt + "\n");
		
		System.out.println("arr1 : " + arr1);
		System.out.println("arr2 : " + arr2);
	}

}
