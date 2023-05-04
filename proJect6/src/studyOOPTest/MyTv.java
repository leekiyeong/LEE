package studyOOPTest;

public class MyTv {

	public static void main(String[] args) {
		//TV객체 생성
		Tvcontrol tv = new Tvcontrol();
		//TV전원 키기 power이 true로 변경
		tv.power();
		//채널11번세팅
		tv.channel = 11;
		//채널내림
		tv.channelDown();
		//현재채널,전원출력
		System.out.println("전원 : " + tv.power);
		System.out.println("채널 : " + tv.channel);
		//채널두번올림
		tv.channelUp();
		tv.channelUp();
		//변수출력
		System.out.println("전원 : " + tv.power);
		System.out.println("채널 : " + tv.channel);
		//TV전원종료
		tv.power();
		System.out.println("전원 : " + tv.power);
		System.out.println("채널 : " + tv.channel);
	}

}
