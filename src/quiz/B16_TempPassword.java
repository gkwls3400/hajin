package quiz;

import java.util.Random;

public class B16_TempPassword {

	/*
	                4�ڸ��� ���� �ӽú�й�ȣ�� �����ϴ� ���α׷��� ��������.
	                (��й�ȣ�� �����ϴ� ���ڴ� ���� �빮�ڿ� �����Դϴ�)         
	 */
	public static void main(String[] args) {

		StringBuilder tempPassword = new StringBuilder();
		int size = 4;

		for (int i = 0; i < size; ++i) {                        
			switch ((int)(Math.random() * 2)) {
			case 0:
				tempPassword.append((char)(Math.random() * 26 + 'A'));
				break;
			case 1:
				tempPassword.append((char)(Math.random() * 10 + '0'));
				break;                                
			}
		}
		System.out.println("�ӽ� ��й�ȣ: " + tempPassword.toString());

		System.out.println("---------------------------");

		// 2.Random Ŭ����
		//�� �� ���ϰ� ���� ���� ������ �� �ִ� ��ɵ��� ���ִ� Ŭ����
		// ������ �� ���� �õ尡 �����ȴ�
		//���ϴ� ���� �õ带 ������ ���� �ִ�
		Random ran = new Random();

		//Random.nextInt(bound)
		// 0~ bound �̸��� ������ ��ȯ�Ѵ�
		System.out.println(ran.nextInt(45)+ 1); //1 ~45�� ���� ����
		System.out.println(ran.nextInt(41)+ 30);//30~ 70�� ���� ����
		System.out.println(ran.nextInt(45)+ 1);
		System.out.println(ran.nextInt(45)+ 1);
		System.out.println(ran.nextInt(45)+ 1);

	}

}




