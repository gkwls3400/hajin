
public class B10_Operator4 {

	public static void main(String[] args) {
		//대입 연산 
		//= 왼쪽 변수에 오른쪽의 값을 대입한다
		
		int num = 10;
		num = num + 20;
		num = num + 5;
		
		System.out.println(num);

		// 복합 대입 연산자
		//변수에 결과를 누적시키는 연산자
		
		num = 10;
		System.out.println(num += 5);
		System.out.println(num -= 3);
		System.out.println(num *= 2);
		System.out.println(num /= 4);
		System.out.println(num %= 3);
		
		// 단항 연산자
		// 변수에 결과를 1씩 누적시키는 연산자
		num = 10;
		num++;
		System.out.println(num);
		
		num--;
		System.out.println(num);
		
	}

}
