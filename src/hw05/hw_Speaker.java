package hw05;

public class hw_Speaker implements hw_Remote{
	private int vol = 0;

	public hw_Speaker() {
		vol = 3;
	}
	
	
	public int getVol() {
		return vol;
	}




	public void setVol(int vol) {
		this.vol = vol;
	}
	
	@Override
	public void volUp() {
		if (vol >= 10) {
			System.out.println("최대볼륨입니다.");
		} else {
			vol++;
		}
	}
	@Override
	public void volDown() {
		if (vol <= 0) {
			System.out.println("최소볼륨입니다.");
		} else
			vol--;
	}
	
	
}
