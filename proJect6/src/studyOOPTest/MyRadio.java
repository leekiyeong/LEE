package studyOOPTest;

public class MyRadio {

	public static void main(String[] args) {
		Radiocontrol radio = new Radiocontrol();//객체생성
		radio.power(); //전원킴
		radio.channelUp(); //채널 1
		radio.channelUp(); //채널 2
		radio.channelUp(); //채널 3
		radio.channelDown();//채널 2
		radio.channel = 91; //채널 91
		radio.power(); //전원종료
		System.out.println(radio.power);
		System.out.println(radio.channel);
	}

}
