
public class A03_VarTupes {
	
		
		public static void main(String[] args) {
			
			/*
			 * 정수 타입
			 *byte (1byte)
			 *
			 *	1byte = 8bit
			 *
			 *	0000 0000 (0)~ 1111 1111(255)까지 표현가능 
			 * 첫 번째 비트는 부호 비트로 사용된다 
			 *byte 타입의 양수 범위 0000 0000(0) ~0111 1111까지(127)
			 *byte 타입의 음수 범위 1000 0000(-128) ~1111 1111까지(-1)
			 *	2 ^ 1 - 2가지
			 *	2 ^ 2 - 4가지
			 *	2 ^ 3 - 8가지
			 *  2 ^ 4 - 16가지
			 *  
			 * short(2byte)
			 * 
			 *  2byte - 16bit
			 *  2 ^ 16 65536가지
			 *  short  의 양수 범위 0~32767
			 *  short  의 음수 범위 -32768~ -1
			 *char(2byte, unsigned)
			 *
			 *	2byte - 16bit
			 *	부호가 없기 때문에 0~65535의 양수만 저장할 수 있는 타입
			 *주로 문자 코드를 저장하는데에 사용한다 (문자 타입)
			 *	2^ 16 - 65536가지
			 *	0~65535
			 *int(4byte)
			 *
			 * 4byte - 32bit
			 * 	2^ 32 - 4,294,967,296가지
			 * int의 양수 범위는 0~2,147,483,647
			 * int의 음수 범위는 -2,147,483,648~ -1
			 * 
			 *long(8byte)
			 * 
			 * 8byte - 64bit
			 * 
			 * 2 ^ 64
			 * */
			byte minByte = -128;
			byte MaxByte = 127;
			System.out.println("byte타입에 저장할 수 있는 가장 큰 값은 " + minByte +"이고,"
					+ "가장 작은 값은 " + MaxByte + "입니다");
			
			short minShort = -32768;
			short MaxShort = 32767;
			
			System.out.println("short타입에 저장할수 있는 가장 큰 값은"+ minShort + "이고,"
					+"가장 작은 값은 값은" + MaxShort +"입니다");
			char maxChar = 65535;
			char minchar = 0;
			
			char ch = '한';
			System.out.println("char 타입에 저장된 값은 기본적으로 문자로 출력된다." + ch);
			System.out.println("char 타입에 저장된 코드값을 확인하고 싶으면 (int)를 붙인다."
					+(int)ch);
			
			int intMax = 2_147_483_647;
			int intmin = -2_147_483_648;
			System.out.println("int타입에 저장할수 있는 가장 큰 값은 "+ intMax +" 이고 가장 작은 값은" + intmin + "이다");
			//숙제 
			//int의 범위를 넘어가는 숫자를 사용할 때는 L을 붙여야 한다 
			long _long = 2_147_483_648L;
			/*
			 * 
			 * 실수 타입
			 * 
			 * float (4byte)
			 * double(8byte)
			 */
			//그냥 소수만 적는것은 기본적으로 double타입이다
			//float 타입의 소수는 뒤에 f를 붙여야 한다 
			float weight = 65.66f;
			double height = 177.77;
			/*
			 * 
			 * 실수는 주로 그래픽 개발에 사용된다.
			 * 부동소수점 방식을 사용한다.
			 * 
			 * boolean 타입
			 * 참/ 거짓 타입
			 */
			boolean hasFood = true;
			boolean over130cm = true;
			 /* 
			 * 참과 거짓을 표현하는데에 사용되는 타입
			 * 값은 true와 false 밖에 없다
			 * 
			 * 참조형 타입 (클래스 타입)
			 *  
			 *  참조형 타입은 기본형 타입들과는 다르게 대문자로 시작한다.
			 *  String : 문자열 
			 *  그 외 모든 클래스들 ..
			 *  String은 문자열을 저장할떄 사용한다 
			 *  
			 */
			String helloMessage = "Hello, My name is Jang ha jin.";
			String byeMessage = "Good bye";
			
			System.out.println(helloMessage);
			
			System.out.println(byeMessage + byeMessage + byeMessage);
		}
	}


