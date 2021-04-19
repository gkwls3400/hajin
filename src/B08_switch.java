
public class B08_switch {

	public static void main(String[] args) {
		// switch-case문
		//()안의 연산 결과에 따라 실행할 코드를 결정한다
		//()안에 boolean타입은 들어갈 수 없다
		// if 문으로 완벽하게 대체 가능하다
		// break를 안 쓰면 break를 만날때까지 내려가면서 모든 케이스문을 실행한다
		// default는 if문의 else 역할을 한다
		int a = 11;
				
		switch (a % 2) {
		case 0:
			System.out.println("a는 짝수입니다");
			break;
		case 1:
			System.out.println("a는 홀수입니다");
			break;
		}
		
		char grade = 'A';
		
		switch (grade) {
		case 'E': case 'e':
			System.out.println("전체 관람가입니다.");
			break;
		case 'K': case 'k':
			System.out.println("12세");
			break;
		case 'Y': case 'y':
			System.out.println("15세");
		case 'A': case 'a':
			System.out.println("18세");
		}
		
		int score = 100;
		
		//switch (score) {
		//case 100: case 99: ........
		}
	}

	


