package study2;

public class MemberVO {
	//아이디 / 암호 / 이름 / 성별 / 생년월일
	private String userid; //6~12 아닌경우 -> 아이디 입력 오류
	private String pass; //4~20 아닌경우 -> 암호 입력 오류
	private String name; //
	private String gender; // M/F 아닌경우 -> 성별 입력 오류
	private String birthday;// 2020-12-25 -> 10자리 x 날짜 오류
	
	public String getUserId(){
		return userid;
	}
	public void setUserId(String userid) {
		userid = userid.trim();
		if(userid.length()<4 || userid.length()>12)
			this.userid = "아이디 입력 오류";
		else
			this.userid = userid;
	}
	public String getPass(){
		return pass;
	}
	public void setPass(String pass) {
		pass = pass.trim();
		if(pass.length()<4 || pass.length()>20) 
			this.pass = "암호 입력 오류";
		else
			this.pass = pass;
	}
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender(){
		return gender;
	}
	public void setGender(String gender) {
		if(gender != "M" && gender != "F")
			this.gender = "성별 입력 오류";
		else
			this.gender = gender;
	}
	public String getBirthDay(){
		return birthday;
	}
	public void setBirthDay(String birthday) {
		if(birthday.length()!=10
			&& birthday.indexOf("-") != 4
			&& birthday.indexOf("-") != 7) 
			this.birthday = "생년월일 오류";
		else 
			this.birthday = birthday;
	}
	
}
