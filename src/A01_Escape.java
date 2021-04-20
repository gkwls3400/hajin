
public class A01_Escape {
	

		public static void main(String[] args) {
			/*
			 * Escape 문자
			 * 
			 * 	특수한 기능을 가진 문자
			 * 그냥 출력하려고 하면 문제가 발생하는 특수한 문자들
			 * 앞에 \(역슬래시)가 붙은 문자는  Escape 문자로 간주한다
			 * 앞에 붙은 \와 위의 문자가 합쳐져서 하나의 문자로 인식된다
			 */
			System.out.println("안녕하세요, 반갑습니다.");
			
			// \n 줄바꿈 해줌(linefeed, breakline, newline, 등등으로 불린다);
			System.out.println("안녕하세요, 반\n갑습\n니다.");

			// \t : tab 키의 기능을 가진 특수 문자.
			System.out.println("3. 안녕하세요, 반\t갑\t습니다");
			
			// \\ Escape문자의 기능을 이용하지 않고 그냥 출력하고 싶을 때
			System.out.println("4. 안녕하세요, 반\\t습\\t니다");
			// ex> jdk의 경로를 출력하고 시을 때
			System.out.println("C:\\Program Files\\JAVA\\JDK");
			
			// \"큰 따옴표를 출력하고 싶을 때 사용한다
			System.out.println("오늘 점심으로 \"맥도날드\"를 먹어야겠다");
			// \' 큰 따옴표를 출력하고 싶을 때 사용한다
			System.out.println("오늘 점심으로 \'맥도날드\'를 먹어야겠다");
			System.out.println('\'');
			System.out.println('\'');
		}

	}


