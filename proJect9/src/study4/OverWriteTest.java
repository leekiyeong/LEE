package study4;
class JavaView{
	public void viewName() {
		System.out.println("자바 프로젝트");
	}
	String viewSeoul() {
		return "서울";
	}
}
class OracleView extends JavaView{
	//오버라이딩 (상속관계에서 상위 클래스의 매소드를 덮어씀)
	public void viewName() { 
		System.out.println("오라클 프로젝트");
	}
	//오버로딩 (같은이름의 매소드를 매개변수를 달리해 작성하는 기법)
	public void viewName(String a) { 
		System.out.println("오라클 프로젝트");
	}
	String viewBusan() {
		return "부산";
	}
}
public class OverWriteTest {

	public static void main(String[] args) {
		//JavaView a = new JavaView();
		OracleView oracle = new OracleView();
		//a.viewName();
		oracle.viewName(); //오라클 프로젝트
		//System.out.println(a.viewSeoul());
		System.out.println(oracle.viewSeoul());
		System.out.println(oracle.viewBusan());
		
	}

}
