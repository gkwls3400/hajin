package quiz;

import java.util.Scanner;

public class B17_countRandomFruit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("배열 길이를 입력하세요 >>");
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
        1. 사용자로부터 배열의 크기를 입력받는다
        
        2. 해당 크기만큼의 배열에 랜덤 과일 문자열을 저장한다 
              (랜덤으로 등장하는 과일: 
                      apple, banana, kiwi, orange, peach, strawberry, pineapple)
        
        3. 각 과일이 몇 번 등장했는지 모두 기록하고 출력해본다 
*/
		}
		
	}

