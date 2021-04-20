package quiz;

import java.util.Scanner;

public class B15_Count369 {

	public static void main(String[] args) {
		// 사용자로부터 정수를 하나 입력받고
		// 해당 숫자까지 369 게임이 진행된다면 박수를 총 몇 번 쳐야하는지 세어보세요
		
		Scanner sc = new Scanner(System.in);
		// 1문자열로 풀기
		
		//정수를 문자열로 바꾸는 방법들
		System.out.println("hello" + 123);
		System.out.println(" " + 123);
		System.out.println(Integer.toString(123));
		
		System.out.println(" 정수 >>");
		int	input = sc.nextInt();
		
		for(int i = 1; i<= input; ++i) {
			String num_str = "" +i;
			int cnt = 0;
			
			System.out.println(i + ": ");
			
			for (int j = 0; j < num_str.length(); ++j) {
				
				char num_ch = num_str.charAt(j);
				if(num_str.charAt(j) == '3' || num_ch == '9') {
					cnt++;
					System.out.println("짝");
				}
			}
			System.out.println();
		}
		String cnt = null;
		System.out.println("총 횟수 " + cnt);
		
		
	}


		
	}


