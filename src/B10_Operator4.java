
public class B10_Operator4 {

	public static void main(String[] args) {
		//���� ���� 
		//= ���� ������ �������� ���� �����Ѵ�
		
		int num = 10;
		num = num + 20;
		num = num + 5;
		
		System.out.println(num);

		// ���� ���� ������
		//������ ����� ������Ű�� ������
		
		num = 10;
		System.out.println(num += 5);
		System.out.println(num -= 3);
		System.out.println(num *= 2);
		System.out.println(num /= 4);
		System.out.println(num %= 3);
		
		// ���� ������
		// ������ ����� 1�� ������Ű�� ������
		num = 10;
		num++;
		System.out.println(num);
		
		num--;
		System.out.println(num);
		
	}

}
