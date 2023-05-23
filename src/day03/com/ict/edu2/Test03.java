package day03.com.ict.edu2;

public class Test03 {

	public static void main(String[] args) {
		// 3989초는 몇 시간, 몇 분, 몇 초 인가?
		int sec = 3989;
		
		int newhour = sec/3600;
		int newmin = (sec/60)-(60*newhour);
		int newsec = sec%60;
		
		System.out.println(sec+"초는 : "+newhour+"시간 "+newmin+"분 "+newsec+"초 입니다.");
	}

}
