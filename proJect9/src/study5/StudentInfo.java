package study5;

public class StudentInfo extends StudentVO{
	public int sum() {
		return  getEng() + getKor() ;
	}
	public int avg() {
		return sum()/2;
	}
	public static void main(String[] args) {
		StudentInfo s = new StudentInfo();
		s.setName("김철수");
		s.setYear(1);
		s.setEng(90);
		s.setKor(80);
		System.out.println("이름 : " + s.getName());
		System.out.println("학년 : " + s.getYear());
		System.out.println("점수 합계 : " + s.sum());
		System.out.println("점수 평균 : " + s.avg());
	}

}
