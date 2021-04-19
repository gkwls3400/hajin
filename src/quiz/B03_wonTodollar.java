package quiz;
import java.util.Scanner;
public class B03_wonTodollar {

	public static void main(String[] args) {
		
		
		
		
	
		
		//한국 돈을 입력하면 미국 달러로 환전해주는 프로그램을 만들어보세요
		//현재 환율은 구글 검색, 소수 둘째 자리까지만 출력, 환전 수수료 1.75% 
		
		Scanner sc = new Scanner(System.in);
		//final 상수 (값 변경 불가)
		final double WON_TO_DOLLAR = 0.00089;
		
		System.out.print("한국 돈을 입력해주세요 달러로 바꿔드립니다  ( 수수료 1.75%)");
		int korMoney = sc.nextInt();
		
		double usd = korMoney * WON_TO_DOLLAR;
	//	double exchange_fee = usd * 0.0175;//미리 계산해놓는것도 나쁘지않다 환전
		
		System.out.println(Math.round((usd * 0.9825) * 1000) / 1000.0 + "USD");
		//System.out.printf("%d원은 %.3fUSD입니다.\n", korMoney, (usd * 0.9825));
		
		
		 
		 
		 
	}

}
