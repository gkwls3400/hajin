package quiz;
import java.util.Scanner;
public class B06_SoreToGrade {

	public static void main(String[] args) {
		// ������ �Է¹����� ������ �ش��ϴ� ����� ������ִ� ���α׷��� �ۼ��غ�����.
		//90 �̻� A 80�� B 
		
		System.out.println("������ �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (100 < a) {
			System.out.println("�߸��� �����Դϴ�");
		}
		else if (90 <= a) {
			System.out.println ("A");
		}else if ( 80 <= a) {
			System.out.println("B");
		}else if ( 70 <= a) { 
			System.out.println("C");
		}else if (60 <= a) {
			System.out.println("D");
		}else if ( 59 <= a) {
			System.out.println("F");
		}else if ( 0<= a) {
			System.out.println("F");
		}else {
			System.out.println("�߸��� �����Դϴ�");
		}
		

	}

}
