package quiz;

import java.util.Scanner;

public class abcquiz {

	public static void main(String[] args) {

		/*
		 * 사용자가 숫자를 입력했을 때
		 * 
		 * 1. 10부터 입력한 숫자까지의 총 합을 구해보세요
		 * 
		 * 2. 1부터 입력한 숫자 사이의 5의 배수만 모두 출력해보세요
		 */

		int i, sum = 0;

		System.out.println("1~100사이의 5의 배수 구하기");

		for (i = 0; i <= 100; i += 5) {

			System.out.print(i + "  ");

			sum += i;

		}

		System.out.println("\n합은 " + sum);

	}

}