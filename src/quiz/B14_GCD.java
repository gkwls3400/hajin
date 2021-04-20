package quiz;

public class B14_GCD {

	public static void main(String[] args) {
		// 두 숫자를 입력받고 두 숫자의 최대 공약수를 구해보세요
		//공약수: 두 숫자를 다 나눌수 있는 수
		// 최대 공약수 : 두 숫자의 공약수 중 가장 큰 공약수
	int num1 = 60, num2 = 3;
	//둘중 작은 숫자의 모든 약수를 구하면서 남은 숫자도 나눠지는지 확인
	int gcd = 1;
	int min = Math.min(num1,  num2);
	int max = Math.max(num1 , num2);
	for (int i = 1; i <= min; ++i) {
		
		if(num1 % i == 0 && num2 % i == 0) {
			gcd = i;
		}
	}
	System.out.printf("gcd: " + gcd);
	
	}

}
