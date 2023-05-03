package studyString;

public class StringTest1 {

	public static void main(String[] args) {
		
		String str = " javascript ";
		//length() 메소드
		System.out.println(str.length()); //공백포함
		//replace(old,new) 메소드-치환
		System.out.println(str.replace("java", "oracle"));
		System.out.println(str.replace(" ",""));
		//trim() 앞뒤공백제거 매우중요
		str = str.trim();
		System.out.println(str);
		System.out.println(str.substring(0,4));
		System.out.println(str.substring(4,10));
		System.out.println(str.substring(4));//끝번호 생략가능
		
		System.out.println(str.charAt(4)); //자리번호 한개 s
		
		//indexOf -> search  찾는 문자의 자리번호
		System.out.println(str.indexOf("s")); //4 
		System.out.println(str.indexOf("o")); //-1 없으면
		
		//contains -> search   	true or false
		System.out.println(str.contains("s")); //true 
		System.out.println(str.contains("o")); //false
		
		//startsWith() endsWith() //시작문자 끝문자
		System.out.println(str.startsWith("java")); //true
		System.out.println(str.startsWith("oracle")); //false
		System.out.println(str.endsWith("script")); //true
		System.out.println(str.endsWith("java")); //false
		
		//split("구분문자")
		str = "java,html"; 
		String[] array = str.split(","); // , 구분문자
		System.out.println(array[0]); //java
		System.out.println(array[1]); //html
		
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java"); //java
		System.out.println(s1==s2); //true
		System.out.println(s1==s3); //false
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals(s3)); //true
	}

}
