package day03.com.ict.edu2;

public class Test02 {

	public static void main(String[] args) {
		// 2시간 40분 30초는 몇 초인가?
		int hour = 2;
		int min = 40;
		int sec = 30;
		
		int newsec = (hour*60*60)+(min*60)+(sec);
		
		System.out.println(hour+"시간 "+min+"분 "+sec+"초는 : "+newsec+"초 입니다.");
	}

}
