package study10;

public class LstNmChk {
	//맴버변수, 클래스, 상수변수(재정의 불가)
	public static final String[] lastNmArr = {"김","이","박"};
	//return 없는 메소드, 호출된곳에 예외처리의 강제의무 부여
	void checkLastNm(String lastName) throws InvalidNmException{
		if(!lsLstNm(lastName)) {		   //false일때
			throw new InvalidNmException();//Exception 처리
		}
	}
	
	private boolean lsLstNm(String str) {
		boolean tf = false;
		for(int i=0; i<lastNmArr.length; i++) {
			if(lastNmArr[i].equals(str)) {
				tf = true; //같은 성이 있을시 true
			}
		}
		return tf; //tf값을 8line if문에 던짐 -> false일때 if문,
				   //즉 InvalidNmException 실행 -> "올바른 성이 아닙니다" 실행
					 
	}
}
