package study5;

public class CarVolMake implements CarVolService{
	private int volLevel = 0;
	private int volLevelTemp;
	
	public int getVolLevel() {
		return volLevel;
	}
	
	public void volUp(int level) {
		volLevel += level;
	}
	
	public void volDown(int level) {
		volLevel -= level;
	}
	
	public void volPause() {
		volLevelTemp = volLevel;
		volLevel = 0;
	}
	
	public void volResume() {
		volLevel = volLevelTemp;
	}

	@Override
	public void volOff() {
		volLevel = 0;
	}
	
}
