package quiz;

import java.util.Scanner;

public class abcquiz {

	public static void main(String[] args) {

		/*
		 * ����ڰ� ���ڸ� �Է����� ��
		 * 
		 * 1. 10���� �Է��� ���ڱ����� �� ���� ���غ�����
		 * 
		 * 2. 1���� �Է��� ���� ������ 5�� ����� ��� ����غ�����
		 */

		int i, sum = 0;

		System.out.println("1~100������ 5�� ��� ���ϱ�");

		for (i = 0; i <= 100; i += 5) {

			System.out.print(i + "  ");

			sum += i;

		}

		System.out.println("\n���� " + sum);

	}

}