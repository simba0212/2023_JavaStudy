package day11.com.ict.edu;

public class Ex06_method {
	int[] total = new int[5];
	double[] avg = new double[5];
	String[] grade = new String[5];
	String[] name = new String[5];
	int[] kor = new int[5];
	int[] eng = new int[5];
	int[] math = new int[5];
	
	
	// 총점을 구하고 리턴하는 메서드
	public int[] getTotal() {
		for (int i = 0; i < total.length; i++) {
			total[i] = kor[i] + eng[i] + math[i];
		}
		return total;
	}

	// 평균을 구하고 리턴하는 메서드
	public double[] getAvg() {
		for (int i = 0; i < total.length; i++) {
			avg[i] = (int) ((total[i] / 3.0) * 10) / 10.0;
		}
		return avg;
	}

	// 학점을 구하고 리턴하는 메서드
	public String[] getGrade() {
		for (int i = 0; i < total.length; i++) {
			if (avg[i] >= 90) {
				grade[i] = "A";
			} else if (avg[i] >= 80) {
				grade[i] = "B";
			} else if (avg[i] >= 70) {
				grade[i] = "C";
			} else {
				grade[i] = "F";
			}
		}
		return grade;
	}
}
