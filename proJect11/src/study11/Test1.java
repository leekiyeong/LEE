package study11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
		Map<String,Integer>map1 = new HashMap<String,Integer>();
		map1.put("영어",100);
		map1.put("국어",80);
		map1.put("수학",90);
		
		int hap = 0;
	
		Iterator<String>keys = map1.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            hap += map1.get(key);
        }
        int avg = hap / map1.size();
        System.out.println("총점 : " + hap);
        System.out.println("평균 : " + avg);
        
        Map<String,Integer>map2 = new HashMap<String,Integer>();
		map2.put("영어",50);
		map2.put("국어",40);
		map2.put("수학",70);
		
		 int hap2 =0;
		 String str = "";
		Iterator<String>keys1 = map2.keySet().iterator();
        while (keys1.hasNext()) {
            String key = keys1.next();
            hap2 += map2.get(key);
            if(map2.get(key)<60) {
            	str += key+ ",";
            }
        }
        int str_len = str.length();
        str = str.substring(0,str_len -1);
        float avg2 = (float) hap2 / map2.size();
        System.out.println(map2);
        System.out.println("총점 : " + hap2);
        System.out.printf("평균 : %.1f\n", avg2);
        System.out.println("낙제과목 : " + str);
        
       
	}
}
