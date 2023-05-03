package studyString;

public class StringTest5 {

	public static void main(String[] args) {
		
		System.out.println("풀어보기5");
		String birthday = "1990/05/27";
		String[] array = birthday.split("/");
		String year = array[0].substring(2,4);
		String month = array[1].substring(1);
		String day = array[2].substring(0);
		System.out.print(year + "년 " + month + "월 " + day +"일 생");;
		
	}

}
