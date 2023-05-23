package day11.com.ict.edu;

public class Ex07_method {
	int total = 0;
	double avg = 0.0;
	String grade = "";

	// 총점을 구하는 메서드
	public int getTotal(int kor, int eng, int math) {
		total = kor + eng + math;
		return total;
	}

	public double getAvg() {
		avg = (int) (total / 3.0 * 10) / 10.0;
		return avg;
	}

	public double getAvg(int k1) {
		avg = (int) (k1 / 3.0 * 10) / 10.0;
		return avg;
	}

	public String getGrade() {
		if (avg >= 90) {
			grade = "A학점";
		} else if (avg >= 80) {
			grade = "B학점";
		} else if (avg >= 70) {
			grade = "C학점";
		} else {
			grade = "F학점";
		}
		return grade;

	}
}
