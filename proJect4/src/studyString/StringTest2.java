package studyString;

public class StringTest2 {

	public static void main(String[] args) {
		
		System.out.println("풀어보기1");
		String subject = " Html,mysql,java     ";
		System.out.println(subject);
		System.out.println(subject.replace("mysql","oracle"));
		System.out.println(subject.length());
		String subject2 = subject.trim();
		System.out.println(subject2);
		int s = subject2.indexOf("j");
		System.out.println(subject2.substring(s));
		System.out.println(subject2.indexOf(","));
		int a = subject2.indexOf(",");
		System.out.println(subject2.charAt(a+1));
		System.out.println(subject2.contains("javascript"));
		String[] array = subject2.split(",");
		System.out.println(array[1]);
	
	}

}
