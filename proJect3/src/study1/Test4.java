package study1;

public class Test4 {

	public static void main(String[] args) {
		int num = 11;
		if(num%2==0 && num%10==0) 
			System.out.println("짝수이고 10의배수입니다.");
		if(num%2==0 && !(num%10==0))
			System.out.println("짝수이고 10의배수가 아닙니다.");
		if(num%2==1)
			System.out.println("홀수 입니다.");
		System.out.println("--------------------");
		
		int num1 = 7;
		if(num >= 1 && num1 <= 10)
			System.out.println("입력된 값은 " + num1 + "로 1페이지");
		else if(num >= 11 && num1 <= 20)
			System.out.println("입력된 값은 " + num1 + "로 2페이지");
		else if(num >= 21 && num1 <= 30)
			System.out.println("입력된 값은 " + num1 + "로 3페이지");
		else if(num >= 31)
			System.out.println("잘못된 숫자입력");
		System.out.println("---------------------");
		int num2 = 12;
		int page = (num2/10)+1;
		System.out.println("입력된 값은 " + num2 + "로 " + page + "페이지 입니다.");
	}

}
