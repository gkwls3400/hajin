package quiz;

import java.util.Scanner;

public class B15_Count369 {

	public static void main(String[] args) {
		// ����ڷκ��� ������ �ϳ� �Է¹ް�
		// �ش� ���ڱ��� 369 ������ ����ȴٸ� �ڼ��� �� �� �� �ľ��ϴ��� �������
		
		Scanner sc = new Scanner(System.in);
		// 1���ڿ��� Ǯ��
		
		//������ ���ڿ��� �ٲٴ� �����
		System.out.println("hello" + 123);
		System.out.println(" " + 123);
		System.out.println(Integer.toString(123));
		
		System.out.println(" ���� >>");
		int	input = sc.nextInt();
		
		for(int i = 1; i<= input; ++i) {
			String num_str = "" +i;
			int cnt = 0;
			
			System.out.println(i + ": ");
			
			for (int j = 0; j < num_str.length(); ++j) {
				
				char num_ch = num_str.charAt(j);
				if(num_str.charAt(j) == '3' || num_ch == '9') {
					cnt++;
					System.out.println("¦");
				}
			}
			System.out.println();
		}
		String cnt = null;
		System.out.println("�� Ƚ�� " + cnt);
		
		
	}


		
	}


