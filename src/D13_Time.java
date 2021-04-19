import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class D13_Time {

	
	/*
	 
	  java.time.Time
	  
	  Calendar의 인스턴스를 set()을 통해 변화시킨다는 단점을 보완한 클래스 
	  
	  java.time패키지의 클래스들은 시간을 계산한 뒤 새로운 인스턴스를 반환하고 원본 인스턴스는 그대로 유지한다 
	  
	  LocalDate, LocalTime, LocalDateTime
	 */
	
	public static void main(String[] args) {
		
		//LocalDate: 날짜만 저장하기 위한 클래스
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		//LocalTime : 시간만 저장하기 위한 클래스
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		LocalDateTime dateTime= LocalDateTime.now();
		System.out.println(datetime);
	}
}
