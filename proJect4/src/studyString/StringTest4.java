package studyString;

public class StringTest4 {

	public static void main(String[] args) {
		
		System.out.println("풀어보기3,4");
		String jumsu = "eng:70,kor:90,math:88";
		String[] array = jumsu.split(",");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		String[] array1 = jumsu.split(":");
		for(int i=1; i<array1.length;i++)
		System.out.print(array1[i].substring(0,2) + " " );
	
	}

}
