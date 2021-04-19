package quiz;
import java.util.Scanner;
public class B06_SoreToGrade {

	public static void main(String[] args) {
		// 점수를 입력받으면 점수에 해당하는 등급을 출력해주는 프로그램을 작성해보세요.
		//90 이상 A 80점 B 
		
		System.out.println("점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (100 < a) {
			System.out.println("잘못된 점수입니다");
		}
		else if (90 <= a) {
			System.out.println ("A");
		}else if ( 80 <= a) {
			System.out.println("B");
		}else if ( 70 <= a) { 
			System.out.println("C");
		}else if (60 <= a) {
			System.out.println("D");
		}else if ( 59 <= a) {
			System.out.println("F");
		}else if ( 0<= a) {
			System.out.println("F");
		}else {
			System.out.println("잘못된 점수입니다");
		}
		

	}

}
