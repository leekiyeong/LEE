package study9;

public class ExceptionTest2 {

	public static void main(String[] args) {
		/*int n1 = 10;
		int n2 = 0;
		int[] n3 = {11,22,33};
		try {
			//System.out.println(n1/n2);
			System.out.println(n3[3]);
		}catch(ArithmeticException e) {
			System.out.println("zero error");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스번호 오류");
		}*/
		String[] pgName = {"JAVA","PHP","ASP"};
		int i = 0;
		while(i<5) {//0~4
			try {
				if(i==4)System.out.println(i/0);
				else System.out.println(pgName[i]);
			}catch(ArrayIndexOutOfBoundsException a) {
				System.out.println("array exception");//i=3일때 
			}catch(Exception e) {
				System.out.println("zeor error");
			}finally {
				System.out.println("finally");
			}i++;
		}
	} 
	

}
