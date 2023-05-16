package study5;

public class VolMake implements VolService{
	private int volLevel; //기본값은 0
	
	public VolMake() {  //생성자를 통해서 값을 부여
		volLevel = 1;
	}
	
	public int getVolLevel() {
		return volLevel;
	}
	
	public void volUp(int level) {
		volLevel += level;
	}
	
	public void volDown(int level) {
		volLevel -= level;
	}
	
}