package day13.com.ict.edu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex07_LocalDate {

	public static void main(String[] args) {
		// java version 8.0 이상만 가능
		// LocalDate : 날짜 정보만 필요할 때
		// LocalTime : 시간 정보만 필요할 때
		// LocalDateTime : 날짜, 시간 모두 필요할때

		LocalDate cDate = LocalDate.now();
		System.out.println(cDate);

		LocalTime cTime = LocalTime.now();
		System.out.println(cTime);

		LocalDateTime cdt = LocalDateTime.now();
		System.out.println(cdt);

		System.out.println("==============LocalDate==============");
		System.out.println("getYear()\t: " + cDate.getYear()); // 년도
		System.out.println("getMonth()\t: " + cDate.getMonth()); // May
		System.out.println("getMonthValue()\t: " + cDate.getMonthValue()); // 월(1,2,3,...)
		System.out.println("getDayOfYear()\t: " + cDate.getDayOfYear()); // 년중 몇번째 날인지
		System.out.println("getDayOfMonth()\t: " + cDate.getDayOfMonth()); // 달의 몇번째 날인지
		System.out.println("getDayOfWeek()\t: " + cDate.getDayOfWeek()); // 요일
		System.out.println("isLeapYear()\t: 윤년여부 " + cDate.isLeapYear()); // 윤년여부

		System.out.println("==============LocalTime==============");
		System.out.println("getHour()\t: " + cTime.getHour());
		System.out.println("getMinute()\t: " + cTime.getMinute());
		System.out.println("getSecond()\t: " + cTime.getSecond());
		// 1970년 1월 1일 UTC의 첫 번째 순간 이후 현재 시간까지의 나노초를 반환
		System.out.println("getNano()\t: " + cTime.getNano());
		System.out.println("==========DateTimeFormatter==========");
		System.out.println(cDate.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(cDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		System.out.println(cdt.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:SS")));
		System.out.println("===============날짜비교===============");
		LocalDate sDate = LocalDate.now();
		LocalDate eDate = LocalDate.of(2023,06,15); // 오늘날짜는 2023-5-15일이다.
		Period period = Period.between(sDate, eDate); // 차이를 년/월/일을 비교해서 차이값으로 반환
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		System.out.println(ChronoUnit.DAYS.between(sDate, eDate)); // 차이를 일수로 계산
		// 각 날짜에 년/월/일 더하기
		System.out.println(sDate.plusYears(2));
		System.out.println(sDate.plusMonths(2));
		System.out.println(sDate.plusDays(17));
		
	}

}
