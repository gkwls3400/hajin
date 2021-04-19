
public class B01_Operator1 {

	public static void main(String [] args) {
		/*
		 연산자 Operator
		 계산할때 사용하는것
		 
		 산술 연산자 
		 */
		
		// 산술 연산자
		int a = 10, b = 7;
		double c = 7.0;
		
		System.out.println("+ :"+ (a + b));
		System.out.println("- :"+ (a - b));
		System.out.println("* :"+ (a * b));
		System.out.println("/ :"+ (a / b));
		
		System.out.println(a / (float)b);
		System.out.println(a / (double)b);
		
		System.out.println("%: " + a % b);
		
		System.out.println("제곱 : "  + Math.pow(a, 3));
		System.out.println("제곱? : "  + (a ^ b)); //^는 제곱이 아니다 //비트연산
		System.out.println("제곱근 :" + Math.sqrt(50));
		System.out.println("절대값 :" + Math.abs(-25));
		System.out.println("소수점 첫재짜리에서 반올림 : " + Math.round(3.335));
		System.out.println("소수점 첫재짜리에서 반올림 : " + Math.round(3.335 * 100)/100.0);
		
		System.out.println("올림:" +Math.ceil(1.001));
		System.out.println("내림:" +Math.floor(1.999));
		
		System.out.println("더 큰 숫자 :" + Math.max(1000, 10001));
		System.out.println("더 작은 숫자 :" + Math.min(1000, 10001));
		
		//비트연산
		// &,  ^ >> << 
		// a = 10 // b = 7
		// 2진수로 a는 1010, b = 0111
		
		
		// a 1010
		// b 0111
		//------ & 
		// 0010 ->2
		System.out.println(a & b); //and
		
		// 1010
		// 0111
		// -----
		// 1111 둘중 하나만 1이면 1
		System.out.println(a | b);// or
		System.out.println(a ^ b);
		System.out.println(8 << 2);
		System.out.println(8 >> 2);
	}
}
