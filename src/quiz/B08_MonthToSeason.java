package quiz;
import java.util.Scanner;
public class B08_MonthToSeason {

	public static void main(String[] args) {
		// ㅇ사용자로부터 달을 입력 받으면 해당하는 계절을 출력해보세요
		System.out.print("현재 달을 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		switch(month) {
		case 12: case 1: case 2:
			System.out.println("겨울입니다" );
			break;
		case 3: case 4: case 5:
			System.out.println("봄 입니다");
			break;
		case 6: case 7: case 8:
			System.out.println("여름 입니다");
			break;
		case 9: case 10: case 11:
			System.out.println("가을 입니다");
			break;
			default:
				System.out.println("잘못된 계절");
				break;
		
		}

	}

}
