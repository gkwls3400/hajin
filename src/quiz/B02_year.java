package quiz;

import java.util.Scanner;

public class B02_year {

	public static void main(String[] args) {
		// ����ڷκ��� �¾�ؿ� ������ �⵵�� �Է¹�����
		// �� ����� �ѱ� ���̸� ����Ͽ� �� ������ �˷��ִ� ���α׷���
		//��������
				
		Scanner year = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		System.out.print("�¾ �� :");
		int year1 = year.nextInt();
		System.out.print("������ �⵵ :");
		int int1 = in.nextInt();
		System.out.print("�ѱ� ���� :");
		System.out.println(int1 - year1 + 1);

	}

}
