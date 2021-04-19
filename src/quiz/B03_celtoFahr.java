package quiz;
import java.util.Scanner;
public class B03_celtoFahr {

	//사용자로부터 섭씨 온도를 입력받으면 
	//화씨 온도로 변환하여 출력해주는 프로그램을 만들어보세요
	// (변환 공식은 구글 검색 출력은 소수 첫째 자리까지
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double cel;
		double fahr;
		
		System.out.print("섭시 온도를 입력하세요");
		cel = sc.nextDouble();
		
		fahr = (cel * 9/5) + 32;
		
		
		
		System.out.printf("%.1f c는 %.1f f입니다.\n", cel, fahr);
		
		

		
	}
}
