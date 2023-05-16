package study11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		Map<String,String>map = new HashMap<String,String>();
		map.put("이름","홍길동");
		map.put("영어","90");
		map.put("국어","10");
		map.put("수학","70");
		Iterator<String>keys = map.keySet().iterator();
		int hap = 0;
		int avg = 0;
        while (keys.hasNext()) {
            String key = keys.next();
            if(key.equals("국어")) {
            	map.put("국어","80" );
            }
            if(!key.equals("이름")) {
            hap += Integer.parseInt(map.get(key));
            }
        }
        avg = hap/(map.size()-1);
		System.out.println("총점 : " + hap);
		System.out.println("평균 : " + avg);
		
	}
	
}
