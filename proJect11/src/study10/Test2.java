package study10;

public class Test2 {
	
	int hap; //int hap = 0; (o)
	public void myRun(int a) {
		System.out.println("연산결과 : " + a);
	}
	public static void main(String[] args) {
		
		Test2 t = new Test2(); // 인스턴스화
		int result;	 //int result = 0; (x)
		for(int i=4; i>=-4; i--) {
			try {
				result = 100/i;
				t.myRun(result);
			}catch(ArithmeticException e) {
				t.myRun(-1);
			}
		}
	}

}
