package quiz;

import java.util.Calendar;
import java.util.TimeZone;

public class D11_DiscountDay {
	/*
	 * � ī�信�� ¦����° ����ϸ��� ������縦 �����Ѵٰ� ���� �� ��
	 * 
	 * �⵵�� �Է��ϸ� �ش� �⵵�� ��� ���� ��¥�� ����غ�����
	 */
	public static void main(String[] args) {
		int year = 2021;
		
	printAllEventDays(year);
		
		}
	
	
	public static void printAllEventDays(int year) {
Calendar event = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
		
		event.set(year,  0,1,0,0,0);
		
		for(int i = 0; i < 12; ++i) {
			event.set(Calendar.MONTH, i);
			event.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
			event.set(Calendar.DAY_OF_WEEK_IN_MONTH, 2);
			
		System.out.printf("%d/%d/%d\n", 
				event.get(Calendar.YEAR),
				event.get(Calendar.MONTH) + 1,
				event.get(Calendar.DATE));
		
		event.set(Calendar.DAY_OF_WEEK_IN_MONTH, 4);
		
		System.out.printf("%d/%d/%d\n", 
				event.get(Calendar.YEAR),
				event.get(Calendar.MONTH) + 1,
				event.get(Calendar.DATE));
		}
	}
}
