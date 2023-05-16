package study9;

public class MatchesTest1 {

	public static void main(String[] args) {
		//ex1
		String title = "";
		//앞에 어떠한 문자가 있어야 true
		String pattern = ".+";
		System.out.println(title.matches(pattern));
		System.out.println();
		
		//ex2
		String color1 = "red";
		String color2 = "ared";
		String color3 = "redabc";
		String color4 = "read";
		//"red"로 시작하는 문자 true
		pattern = "^red.*";
		System.out.println(color1.matches(pattern));
		System.out.println(color2.matches(pattern));
		System.out.println(color3.matches(pattern));
		System.out.println(color4.matches(pattern));
		System.out.println();
		
		//ex3
		String color5 = "yellow";
		String color6 = "green";
		//"r" or "y" or "b" 시작하는 문자 true
		pattern = "^(r|y|b).*";
		System.out.println(color5.matches(pattern));
		System.out.println(color6.matches(pattern));
		System.out.println();
		
		//ex4
		String gender = "M";
		//M이거나 F 둘중 하나여야만 true
		pattern = "^(M|F)";
		System.out.println(gender.matches(pattern));
		System.out.println();
		
		//ex5(숫자만)
		String date = "20201225";
		//숫자로 시작하고 숫자가 1개이상 숫자로 끝나야 true
		pattern = "^[0-9]+$"; 
		System.out.println(date.matches(pattern));
		System.out.println();
		
		//ex6(영문만)
		String str = "aaaa";
		//영문으로 시작하고 영문 1개이상 영문으로 끝나야 true
		pattern = "^[a-zA-Z]+$"; 
		System.out.println(str.matches(pattern));
		System.out.println();
		
		//ex7(한글만)
		String name = "이기영s";
		//한글로 시작하고 한글 1개이상 한글로 끝나야 true
		pattern = "^[가-힣]+"; 
		System.out.println(name.matches(pattern));
		System.out.println();
		
				
	}

}


































