
public class B06_If {

	public static void main(String[] args) {
		//if 문 
		//()안의 값이 트루 일때 {} 안의 내용을 실행한다
		//()안의 값이 false일 때 {} 내용 무시 
		//{} 안에 들어갈 내용이 한줄이라면 {} 생략 가능
		
	//else if문
		//위에 있는 if문이 실행되지 않아다면 if문처럼 작동한다
		//else if는 단독으로 사용할 수 없다
		//else if는 여러개 사용할 수 있다 
		
		// else문
		// 위에 있는 if, else if가 모두 실행되지 않았다면 {}안의 내용을 무조건 실행한다
		// if 바로 다음에 쓸 수도 있다
		// else가 붙어있는 조건절은 최소 한번은 실행된다 
		int a = -8;
		
		
		if (a == 5) {
			System.out.println("Hello");
		} else if (a == 6) {
			System.out.println("Nice to meet you");
		} else if( a> -10) {
			System.out.println("Greeting!");
		} else if(a > -20) {
			System.out.println("Good to see you");
		}
		System.out.println("프로그램이 끝났습니다");
	
		char ch = '가';
		
		if (ch >= '가' && ch <= '힣') {
			System.out.println("ch 한글");
		} else if(ch >= 0x3040 && ch <= 0x30FF) {
		System.out.println();
		} else {
			System.out.println("시스템 종료");
		}
		
	}
}
