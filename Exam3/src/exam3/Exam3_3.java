package exam3;

public class Exam3_3 {
	public static String spacezero(String str) {
		//String[] result = str.split(" ");
		//String result2 = "";
		//for(int i=0; i<result.length;i++) {
			//result2 += result[i];
		//}return result2;
		String result = str.replace(" ","");
		return result;
	}

	public static void main(String[] args) {
		System.out.println(spacezero(" 우리 모두의 백과 사전"));
	}

}
