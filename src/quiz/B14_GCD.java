package quiz;

public class B14_GCD {

	public static void main(String[] args) {
		// �� ���ڸ� �Է¹ް� �� ������ �ִ� ������� ���غ�����
		//�����: �� ���ڸ� �� ������ �ִ� ��
		// �ִ� ����� : �� ������ ����� �� ���� ū �����
	int num1 = 60, num2 = 3;
	//���� ���� ������ ��� ����� ���ϸ鼭 ���� ���ڵ� ���������� Ȯ��
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
