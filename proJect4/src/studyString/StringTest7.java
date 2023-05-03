package studyString;

public class StringTest7 {

	public static void main(String[] args) {
		//char 타입을 String 타입으로 변경하는법
		String birthday = "1990/05/27";
		String[] bb = birthday.split("/");
		String yy = bb[0]; 
		String mm = bb[1].charAt(1)+"";
		String dd = bb[2];
		System.out.println(yy+"년 "+mm+"월 "+dd+"일");
	}

}
