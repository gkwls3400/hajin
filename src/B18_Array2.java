import java.util.Scanner;

public class B18_Array2 {

	public static void main(String[] args) {
		// 배열 내부에도 배열을 넣을 수 있다.
		int[] num1 = {1,2,3,4,5,6};
		int[] num2 = new int[10];
		int[] num3 = new int[] { 100,200,300,400 };
		
		int[][] arr2 = {num1, num2, num3};
		
		System.out.println(arr2[0]);//아래껏과 같다 
		System.out.println(num1);
		
		//2차원 배열의 값 사용하지
		System.out.println(arr2[0][5]);
		System.out.println(arr2[1][8]);
	//	System.out.println(arr2[2][4]); 에러 
		
		//n 차원 배열은 n중 반복문으로 모두 탐색할 수 있다 
		for (int i = 0; i < arr2.length; ++i){
			
			System.out.println(i + "번째 배열의 길이: " +arr2[i].length);
			
			for (int j = 0; j < arr2[i].length; ++j) {
				System.out.printf("arr[%d][%d]: %d \n", i, j, arr2[i][j]);
			}
		}
		// 활용 예
		char[][] block1 = {
				{'ㅁ','ㅁ','ㅁ','ㅁ','ㅁ'},
				{'ㅁ','ㅁ','ㅁ','ㅁ','ㅁ'},
				{'ㅁ','ㅁ','ㅁ','ㅁ','ㅁ'},
				{'ㅁ','ㅁ','ㅁ','ㅁ','ㅁ'},
				{'ㅁ','ㅁ','ㅁ','ㅁ','ㅁ'}
		};
		
		for (int i = 0; i < block1.length; ++i) {
			for (int j = 0; j < block1[i].length; ++j) {
				System.out.print(block1[i][j]);
			}
			System.out.println();
		}
		
		int[][] omok = new int[10][10];
//		
//		omok[5][5] =1;
//		omok[0][5] =1;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("좌표를 입력해주세요 >");
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			
			
			omok[x1][y1] = 1;
		for (int y = 0; y < omok.length; ++y) {
			
			for(int x = 0; x < omok[y].length; ++x) {
				
				switch (omok[x][y]) {
				case 0:
					System.out.print('ㅁ');
					break;
				case 1:
					System.out.print('ㅃ');
					break;
				case 2:
					System.out.print('ㅇ');
					break;
				}
			}
			System.out.println();
		}
	}

}
}
