package datetime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateITime1 {
	public static void main(String[] args) {
		//날짜와 시간
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		//날짜
		LocalDate date =LocalDate.now();
		System.out.println(date);
		
		//시간
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		// 날짜와 시간 형식 -DateTimeFormatter
		DateTimeFormatter datetime =DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a");
		String current_time = now.format(datetime);
		System.out.println(current_time);
		
		
		
		
		
		
		
	}
}
