import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class D13_Time {

	
	/*
	 
	  java.time.Time
	  
	  Calendar�� �ν��Ͻ��� set()�� ���� ��ȭ��Ų�ٴ� ������ ������ Ŭ���� 
	  
	  java.time��Ű���� Ŭ�������� �ð��� ����� �� ���ο� �ν��Ͻ��� ��ȯ�ϰ� ���� �ν��Ͻ��� �״�� �����Ѵ� 
	  
	  LocalDate, LocalTime, LocalDateTime
	 */
	
	public static void main(String[] args) {
		
		//LocalDate: ��¥�� �����ϱ� ���� Ŭ����
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		//LocalTime : �ð��� �����ϱ� ���� Ŭ����
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		LocalDateTime dateTime= LocalDateTime.now();
		System.out.println(datetime);
	}
}
