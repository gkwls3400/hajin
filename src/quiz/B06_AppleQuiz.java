package quiz;
import java.io.InputStream;
import java.util.Scanner;
public class B06_AppleQuiz {

	public static void main(String[] args) {
		//사과를 10개씩 담을 수 있는 바구니가 있다
		// 사용자가 구매하고 싶은 사과의 개수를 입력하면
		//사과를 모두 담기 위해 필요한 바구니의 개수를 알려주는 프로그램을 만들어보세요
		
//		System.out.println("사과 갯수를 입력하세요");
//		Scanner a = new Scanner(System.in); 
//		int applecount = a.nextInt();    // 다음 입력문을 int로 반환
//		int basketcount = 0;
//		basketcount = applecount/10;
//		if(applecount%10 !=0)
//		   basketcount = basketcount +1;
//
//		System.out.println("필요한 바구니 갯수");
//		System.out.println(basketcount+"");
//		
		

		Scanner sc = new Scanner(System.in);
		int apple;
		int size = 10;
		
		System.out.print("구매하고 싶은 사과의 개수 >>");
		apple = sc.nextInt();
		if (apple < 0) {
			System.out.println("잘못된 개수를 입력하셨습니다.");
		}else {
				System.out.println("필요한 바구니의 개수 : "+ (int)Math.ceil( apple / (double)size));
		}
	}
}
	

