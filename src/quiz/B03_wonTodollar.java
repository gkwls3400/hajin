package quiz;
import java.util.Scanner;
public class B03_wonTodollar {

	public static void main(String[] args) {
		
		
		
		
	
		
		//�ѱ� ���� �Է��ϸ� �̱� �޷��� ȯ�����ִ� ���α׷��� ��������
		//���� ȯ���� ���� �˻�, �Ҽ� ��° �ڸ������� ���, ȯ�� ������ 1.75% 
		
		Scanner sc = new Scanner(System.in);
		//final ��� (�� ���� �Ұ�)
		final double WON_TO_DOLLAR = 0.00089;
		
		System.out.print("�ѱ� ���� �Է����ּ��� �޷��� �ٲ�帳�ϴ�  ( ������ 1.75%)");
		int korMoney = sc.nextInt();
		
		double usd = korMoney * WON_TO_DOLLAR;
	//	double exchange_fee = usd * 0.0175;//�̸� ����س��°͵� �������ʴ� ȯ��
		
		System.out.println(Math.round((usd * 0.9825) * 1000) / 1000.0 + "USD");
		//System.out.printf("%d���� %.3fUSD�Դϴ�.\n", korMoney, (usd * 0.9825));
		
		
		 
		 
		 
	}

}
