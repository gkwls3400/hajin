package quiz;

import java.util.Scanner;

public class B17_countRandomFruit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�迭 ���̸� �Է��ϼ��� >>");
		int num = scanner.nextInt();
		String[]randomFruit = new String[num];
		String[] fruit = {"apple","banana","kiwi","orange","peach",
				"strawberry","pineapple"};
		int[] index = new int[fruit.length];
		
		for (int i = 0; i< randomFruit.length;i++) {
			
			int random = (int)(Math.random()*7);
			randomFruit[i] = fruit[random];
			System.out.println(fruit[random]);
			index[random]++;
			
		}
		for (int i = 0; i < fruit.length; i++) {
			System.out.println(fruit[i] + " = " + index[i]);
		}
			
		
		
		
			
		


		
		/*
        1. ����ڷκ��� �迭�� ũ�⸦ �Է¹޴´�
        
        2. �ش� ũ�⸸ŭ�� �迭�� ���� ���� ���ڿ��� �����Ѵ� 
              (�������� �����ϴ� ����: 
                      apple, banana, kiwi, orange, peach, strawberry, pineapple)
        
        3. �� ������ �� �� �����ߴ��� ��� ����ϰ� ����غ��� 
*/
		}
		
	}

