package studyOOPTest;

public class Tvcontrol {
	boolean power = false;
	int channel = 0;
	public void power() {
		power = !power;
		if(power == false) channel = 0;
	}
	public void channelUp() {
		channel += 1;
		if(channel>999) channel = 0;
	}
	public void channelDown() {
		channel -= 1;
		if(channel < 0) channel = 0;
	}
}
