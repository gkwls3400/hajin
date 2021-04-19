package quiz;

import java.util.Scanner;

public class B02_year {

	public static void main(String[] args) {
		// 사용자로부터 태어난해와 올해의 년도를 입력받으면
		// 그 사람의 한국 나이를 계산하여 몇 살인지 알려주는 프로그램을
		//만들어보세요
				
		Scanner year = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		System.out.print("태어난 해 :");
		int year1 = year.nextInt();
		System.out.print("올해의 년도 :");
		int int1 = in.nextInt();
		System.out.print("한국 나이 :");
		System.out.println(int1 - year1 + 1);

	}

}
