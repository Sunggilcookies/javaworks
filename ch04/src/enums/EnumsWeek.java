package enums;

import java.util.Calendar;

public class EnumsWeek {
	public static void main(String[] args) {
		Week today= null; //객체 자료형은 null 초기화
		Calendar cal = Calendar.getInstance();
		
//		System.out.println(cal.get(Calendar.YEAR));
		int day = cal.get(Calendar.DAY_OF_WEEK);
		//1-일 ,2 -월, 3-화, 4-수, 5-목, 6-금, 7-토
//		System.out.println(day-1);
		
		switch(day) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY;break;
		case 3: today = Week.TUESDAY;break;
		case 4:today = Week.WEDNESDAY;break;
		case 5:today = Week.THURSDAY;break;
		case 6:today = Week.FRIDAY;break;
		case 7:today = Week.SATURDAY;break;
		}
		System.out.printf("Today is %s",today);
	}
}
