import java.util.Scanner;
public class B03_Scanner {

	public static void main(String[] args) {
		//java.util.Scanner Ŭ����
		//���α׷��� �ܺηκ��� �Է��� ���� �� �ִ� ��ɵ��� ���ִ� Ŭ���� 
		//��𿡼� �Է��� ������ ������ �ڿ� �پ��� ������ �Է¹��� �� �ִ�
		// math Ŭ���� ���а� ���õ� ��ɵ��� ���ִ� Ŭ���� 
		// abs, round, ceil()...
		//�ֿܼ��� �Է¹ް� ���� ����  System.in�� ����Ѵ� 
		
		//System.in���κ��� �Է¹޴� ��ĳ�ʸ� �ϳ� ����
		//new Scanner(System.in);
		// ScannerŸ�� ���� sc�� ������ ��ĳ�ʸ� ��Ƴ��´�
		Scanner sc = new Scanner(System.in);
		
		//��ĳ���� nextInt() : �������� ������ ������ �ϳ� ������ 
		System.out.print("������ �Է����ּ���");
		int a = sc.nextInt();
		
		System.out.println("�Է��Ͻ� ���� " + a + "�Դϴ�");
		System.out.println("�Է��Ͻ� ���� 3�� ���ϸ� " + a * 3 + "�Դϴ�.");
		System.out.println("1000�� �Է��Ͻ� ���� ���̴� " + ( 1000 - a)+ "�Դϴ�.");
		System.out.println("�Ǽ��Է��Ͻÿ� ");
		double b = sc.nextDouble();
		
		System.out.println("�ι�°�� �Է��Ͻ� ���� " + b + "�Դϴ�");
		System.out.println("ù ��° ���� �� ��° ���� ���ϸ� " + a + b + "�Դϴ�.");
		
	}

}
