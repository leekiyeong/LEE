package study8;

import java.util.Calendar;
import java.util.Scanner;

public class UnixTimeTest2 {
	//모든클래스에서 접근할 수 있고 클래스명으로 접근하는 매소드
	public static int doomDay(String date) {
		Calendar cal = Calendar.getInstance();
		long B = cal.getTimeInMillis()/1000;
		
		String[] str = date.split("-");
		int yy = Integer.parseInt(str[0]); //String 값을 int로
		int mm = Integer.parseInt(str[1]); //형변환
		int dd = Integer.parseInt(str[2]);
		
		cal.set(yy, mm-1, dd);
		long A = cal.getTimeInMillis()/1000;
		int result = (int)(A-B)/(60*60*24);
		return result;
	}
	//날짜 두개를 매개변수로 받아 차이를 리턴하는 매소드
	public static int difDate(String date1,String date2) {
		Calendar cal = Calendar.getInstance();
	
		String[] str2 = date1.split("-");
		int yy1 = Integer.parseInt(str2[0]); //String 값을 int로
		int mm1 = Integer.parseInt(str2[1]); //형변환
		int dd1 = Integer.parseInt(str2[2]);
		cal.set(yy1,mm1,dd1);
		long C = cal.getTimeInMillis()/1000;
				
		String[] str3 = date2.split("-");
		int yy2 = Integer.parseInt(str3[0]); //String 값을 int로
		int mm2 = Integer.parseInt(str3[1]); //형변환
		int dd2 = Integer.parseInt(str3[2]);
		cal.set(yy2,mm2,dd2);
		long D = cal.getTimeInMillis()/1000;
		int result2 = (int)(D-C)/(60*60*24);
		
		return result2;
	}
	public static void main(String[] args) {
		//크리스마스 까지 남은 시간
		//1.현재시각 / 1000
		//2.크리스마스 시점 시간 얻기 / 1000
		//3.크리스마스 - 현재 / 하루(초) = 답
		Calendar cal1 = Calendar.getInstance(); //현재시간
		long unixNow = cal1.getTimeInMillis()/1000; //현재/1000
		
		 //현재시간
		cal1.set(2023,11,25); //23년12월25일 세팅
		long unix_Xmas = cal1.getTimeInMillis()/1000; //크리스마스/1000
		
		int result = (int)(unix_Xmas-unixNow)/(60*60*24); //차이를 일로 계산
		System.out.println("올해 크리스마스 까지 " + result + "일 남았습니다.") ;
		
		//set으로 현재날짜부터 크리스마스까지 남은 날짜 계산
		cal1.set(2023,04,11); //2023-05-11 세팅
		long unixA = cal1.getTimeInMillis()/1000;
		
		cal1.set(2023,11,25); //2023-12-25 세팅
		long unixB = cal1.getTimeInMillis()/1000;
		
		int result2 = (int)(unixB-unixA)/(60*60*24); //차이를 일로 계산
		System.out.println("날짜차이는 " + result2 + "일 입니다.");
		
		System.out.println("날짜차이는 " + doomDay("2023-12-25") + "일 입니다.");
		
		System.out.println("날짜차이는 " + difDate("2023-05-11","2023-12-25") + "일 입니다.");
		
		@SuppressWarnings("resource")
		
		Scanner scn = new Scanner(System.in);
		String aa = "1498137807001";
		System.out.println("-------------------------");
		System.out.println("유닉스코드 " + aa +"로부터");
		System.out.print("며칠 후 날짜를 구할까요? : ");
		
		
		int scn1 = scn.nextInt();
		
		long a = Long.parseLong(aa);
		
		cal1.setTimeInMillis(a);
		cal1.add(Calendar.DATE,scn1);
		
		int yy = cal1.get(Calendar.YEAR);
		int mm = cal1.get(Calendar.MONTH)+1;
		int dd = cal1.get(Calendar.DATE);
		System.out.println(scn1 +"일 후 날짜 : " + yy + "/" + mm + "/" + dd);
		
		System.out.println("-------------------------");
		Calendar cal2 = Calendar.getInstance();
		System.out.println("현재날짜 2023/05/11 부터");
		System.out.print("며칠 후 날짜를 구할까요? : ");
		int scn3 = scn.nextInt();
		
		cal2.add(Calendar.DATE,scn3);
		int yy1 = cal2.get(Calendar.YEAR);
		int mm1 = cal2.get(Calendar.MONTH)+1;
		int dd1 = cal2.get(Calendar.DATE);
		System.out.println(scn3 +"일 후 날짜 : " + yy1 + "/" + mm1 + "/" + dd1);
		
		System.out.println("---------------------------");
		String bb = "1498137807001";
		Calendar cal3 = Calendar.getInstance();
		long a1 = (Long.parseLong(bb)/1000) + ((60*60*24)*24);
		cal3.setTimeInMillis(a1*1000);
		int yy3 = cal3.get(Calendar.YEAR);
		int mm3 = cal3.get(Calendar.MONTH)+1;
		int dd3 = cal3.get(Calendar.DATE);
		System.out.println(yy3 + "/" + mm3 + "/" + dd3);
	
		cal3.add(Calendar.DATE,-60);
		yy3 = cal3.get(Calendar.YEAR);
		mm3 = cal3.get(Calendar.MONTH)+1;
		dd3 = cal3.get(Calendar.DATE);
		System.out.println(yy3 + "/" + mm3 + "/" + dd3);
	}
	
	

}
