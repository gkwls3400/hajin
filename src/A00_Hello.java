
public class A00_Hello {
	/* 여러줄 주석
	  ctrl + c 복사하기
	  ctrl + x 잘라내기
	  ctrl + v 붙여넣기
	  ctrl + z 되돌리기
	  ctrl + y 방금 되돌린것을 취소 
	 */
		// 한줄 주석

	// public class의 이름은 반드시 파일명과 같아야 한다.
	
		//빨간 줄이 생겼을 때는 그곳에 커서를 두고  f2를 누르면
		//에러에 대한 정보와 해결책을 볼 수 있다
		
		/*main() 함수 (함수란 - 단어 뒤에 ()가 있는 것)
		 * 
		 * -프로그램의 시작 지점 
		 *  사용자가 프로그램을 사용하면 가장 먼저 main() 함수를 찾아서 실행시킨다
		  main() 함수의 범위는 중괄호{} 로 결정된다
		 */
		public static void main(String[] args) {
			 //프로그램 시작
			
			// System.out.println() 함수
			// -()안에 전달한 데이터를 콘솔에 출력하는 함수 
			// 콘솔 - 글자만 나오는 검은 화면 (옛날 컴퓨터 화면)
			// 이클립스 에서는 테스트용으로 하얀 바탕이 콘솔을 제공한다
			//단축키는 컨트롤 f11 누르면 우리가 만드는 프로그램을 테스트용 콘솔에서 실행가능 
			//우리가 만드는 소스 코드의 결과물은 bin폴더에 저장되어 있다
			//소스코드 확장자 .java // 결과물 .class
			
			System.out.println("┌─────────────────────┐");
			System.out.println("     Hello, world"    );
			System.out.println("     Hello, world"    );
			System.out.println("     Hello, world"    );
			System.out.println("└─────────────────────┘");
			
			// 프로그램 끝
			/* 자바의 데이터들 (리터럴)
			  
			 
			 1. "" 사이에 적는 것을 문자열(String), 
			 문자를 여러개 쓸 수 있는 데이터 타입
			 2. '' 사이에 적는 것 문자, 문자 단 하나
			 3. 그냥 숫자를 적는 것  정수(integer),
			 4. 소수를 적는 것은 " 실수(float, double) 
			 5. true, false
			 */
			System.out.println("abcdefg");
			System.out.println('a');
			System.out.println('1');
			System.out.println(1234567);
			System.out.println(123.4567 + 3.14);
			System.out.println(123456+12345);
			System.out.println(true);
			System.out.println(false);
			
			//문자들은 실제로는 숫자 (유니코드)값을 가지고 있다
			//우리 눈에 보일때만 문자로 보이는 것이다
			// '' 타입은 숫자타입으로 전환될 수 있고 숫자 타입도 ''타입으로 전환될 수 있다
			// 문자와 정수는 실제로 같은 타입이며 서로 계산도 가능하다
			System.out.println((int)'A'); //(int)의 역할 문자를 숫자로 보이게 함
			System.out.println((char)54621); //(char)의 역할 숫자를 문자로 보이게 함
			System.out.println((int)'가');
			System.out.println((char)('A'+1));
			System.out.println((int)('A')+1);
			System.out.println((int)'A');
			System.out.println((int)'a');
			
			//문자열 타입과 다른 타입을 더하면 계산을 하는것이 아니라 이어붙인다
			System.out.println("가나다"+"하하하");
			System.out.println("'A'의 보여지는 모습 :" + 'A');
			System.out.println('1' + 5);//1의 유니코드에 5를 더하다
			System.out.println("1" + 5);//문자열 + 숫자
			System.out.println('A' + 5);
			System.out.println(1+5);
			System.out.println("'A'의 실제 코드값:" + (int)'A');
			System.out.println("'1'의 실제 코드값:" + (int)'1');
			//; (세미 콜론) 한 명령어가 끝났음을 알린다
			
			//정수 + 실수는 실수가 된다
			//정수 + 정수는 정수가 된다
			//정수 + 문자는 정수가 된다 
			System.out.println('a' + 10);
			System.out.println((char)('a' + 10));
			System.out.println(10 + 10);
			System.out.println(3.1 + 3);
		}

	}


