package studyMethodTest;

import java.util.Calendar;

public class MethodTest1 {

	public static void main(String[] args) {
		myAge(1998);
	}
	public static void myAge(int a) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int age = year-a;
		System.out.println("나이 : " + age);
	}

}
