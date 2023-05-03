package studyString;

public class StringTest6 {

	public static void main(String[] args) {
		
		System.out.println("풀어보기 6");
		String str = "java";
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}System.out.println(str.substring(i,i+1));
		}
	
	}

}
