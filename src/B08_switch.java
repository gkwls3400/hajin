
public class B08_switch {

	public static void main(String[] args) {
		// switch-case��
		//()���� ���� ����� ���� ������ �ڵ带 �����Ѵ�
		//()�ȿ� booleanŸ���� �� �� ����
		// if ������ �Ϻ��ϰ� ��ü �����ϴ�
		// break�� �� ���� break�� ���������� �������鼭 ��� ���̽����� �����Ѵ�
		// default�� if���� else ������ �Ѵ�
		int a = 11;
				
		switch (a % 2) {
		case 0:
			System.out.println("a�� ¦���Դϴ�");
			break;
		case 1:
			System.out.println("a�� Ȧ���Դϴ�");
			break;
		}
		
		char grade = 'A';
		
		switch (grade) {
		case 'E': case 'e':
			System.out.println("��ü �������Դϴ�.");
			break;
		case 'K': case 'k':
			System.out.println("12��");
			break;
		case 'Y': case 'y':
			System.out.println("15��");
		case 'A': case 'a':
			System.out.println("18��");
		}
		
		int score = 100;
		
		//switch (score) {
		//case 100: case 99: ........
		}
	}

	


