package quiz;
import java.util.Scanner;
public class B03_celtoFahr {

	//����ڷκ��� ���� �µ��� �Է¹����� 
	//ȭ�� �µ��� ��ȯ�Ͽ� ������ִ� ���α׷��� ��������
	// (��ȯ ������ ���� �˻� ����� �Ҽ� ù° �ڸ�����
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double cel;
		double fahr;
		
		System.out.print("���� �µ��� �Է��ϼ���");
		cel = sc.nextDouble();
		
		fahr = (cel * 9/5) + 32;
		
		
		
		System.out.printf("%.1f c�� %.1f f�Դϴ�.\n", cel, fahr);
		
		

		
	}
}
