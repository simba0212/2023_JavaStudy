package day13.com.ict.edu;

public class Ex01_Constructor {
	// this와 this()
	// this : 객체 내부에서 객체 자신을 지칭하는 예약어
	// 지역변수와 전역변수 이름이 같을 때 전역변수 앞에 this
	
//	this()	:	객체 내부에서 객체 자신의 생성자를 지칭하는 예약어
	

	private String name = "홍길동";
	private int age = 34;

	public Ex01_Constructor() {
		System.out.println("기본생성자 : " + this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
