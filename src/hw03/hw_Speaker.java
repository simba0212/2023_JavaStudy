package hw03;

public class hw_Speaker {
	private int vol = 3;

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public void volUp() {
		if (vol >= 10) {
			System.out.println("최대볼륨입니다.");
		} else {
			vol++;
		}
	}


	public void volDown() {
		if (vol <= 0) {
			System.out.println("최소볼륨입니다.");
		} else
			vol--;
	}

}
