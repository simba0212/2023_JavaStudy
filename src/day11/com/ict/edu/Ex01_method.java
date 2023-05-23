package day11.com.ict.edu;

public class Ex01_method {//객체 생성안되면 인스턴스 변수도 생성되지않음
	//클래스 : 멤버필드. 멤버메서드, 생성자
	//멤버필드 : 인스턴스 변수, 인스턴스 상수, static변수, static 상수
	String name = "홍길동"; //인스턴스 변수
	int kor = 80;		  //인스턴스 변수
	int eng = 95;		  //인스턴스 변수
	int math = 85;		  //인스턴스 변수
	int total = 0;		  //인스턴스 변수
	double avg = 0.0;	  //인스턴스 변수
	static double ki = 178.5;
	
	// 멤버 메서드() : 동작, 기능, 실행하는 것
	// ** 메서드는 호출해야만 실행할수있고, 실행후 반드시 호출한 곳으로 되돌아간다.
	// 형식) [접근제한자][메서드종류] 반환형 메서드이름([인자], ...){ 실행할 내용 }
	//		** 반환형: 반드시 호출한곳으로 되돌아 가는데 실행결과를 가지고 갈때 실행결과의 자료형을 반환형이라고 부른다	
	//				  실행결과를 가지고 가지 않으면 void 라는 예약어를 사용한다. 
	
	//instance 메서드
	public void getTotal() {
		total = kor + eng + math;
		
		//return ; (여기선 생략됨)
	}
	//instance 메서드
	public int getTotal2() {
		int sum = kor + eng + math + (int)(ki);
		// 반환형이 보이드가 아니면 맨 마지막에 return 데이터나 데이터를 가지고있는 해당 자료형 변수를 쓰거나
		return sum;
	}
	public int getTotal3() {
		
		return kor + eng + math;
	}
	
	//static
	public static void getAvg(){
		//static 일 경우는 instance 변수 사용불가
		//avg = total / 3.0;

		//ki가 static이므로 사용가능
		ki = ki + 5;
	}
	
	public static double getAvg2() {
		
		return ki = ki + 0.7;
	}
	
	
}