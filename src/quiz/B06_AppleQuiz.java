package quiz;
import java.io.InputStream;
import java.util.Scanner;
public class B06_AppleQuiz {

	public static void main(String[] args) {
		//����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�
		// ����ڰ� �����ϰ� ���� ����� ������ �Է��ϸ�
		//����� ��� ��� ���� �ʿ��� �ٱ����� ������ �˷��ִ� ���α׷��� ��������
		
//		System.out.println("��� ������ �Է��ϼ���");
//		Scanner a = new Scanner(System.in); 
//		int applecount = a.nextInt();    // ���� �Է¹��� int�� ��ȯ
//		int basketcount = 0;
//		basketcount = applecount/10;
//		if(applecount%10 !=0)
//		   basketcount = basketcount +1;
//
//		System.out.println("�ʿ��� �ٱ��� ����");
//		System.out.println(basketcount+"");
//		
		

		Scanner sc = new Scanner(System.in);
		int apple;
		int size = 10;
		
		System.out.print("�����ϰ� ���� ����� ���� >>");
		apple = sc.nextInt();
		if (apple < 0) {
			System.out.println("�߸��� ������ �Է��ϼ̽��ϴ�.");
		}else {
				System.out.println("�ʿ��� �ٱ����� ���� : "+ (int)Math.ceil( apple / (double)size));
		}
	}
}
	

