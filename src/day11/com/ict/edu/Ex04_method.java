package day11.com.ict.edu;

public class Ex04_method {
	int su1 = 10;
	int su2 = 20;
	int result = 0;

	// 메서드이름([인자],...)
	// 인자 : 메서드가 실행할때 필요한 정보를, 외부에서 받기위한 통로이다.
	// 더하기
	public void add() {
		result = su1 + su2;
	}

	public void add(int k1) {
		result = k1 + su2;
	}

	public void add(int k1, int k2) {
		result = k1 + k2;
	}

	public int sub() {
		result = su1 - su2;
		return result;
	}

	public int sub(int k1) {
		int res = k1 - su2;
		return res;
	}

	public int sub(int k1, int k2) {
		return k1 - k2;
	}

}
