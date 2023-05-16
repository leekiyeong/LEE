package study10;

public class LstNameChkTest {

	public static void main(String[] args) {
		String str = "김";
		LstNmChk lstNm = new LstNmChk();
		try {
			lstNm.checkLastNm(str);
			System.out.println(str + "은 올바른 성입니다.");
		}catch(InvalidNmException e) {
			System.out.println(str + "은 " + e.toString());
		}
	}

}
