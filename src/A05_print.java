
public class A05_print {

	public static void main(String[] args) {
		/*
		  �ֿܼ� ����ϱ� ���� �������� �Լ���
		  
		  1.print
		  �ٹٲ� ����
		  2.println
		  ���� �ڵ����� �ٲ��ָ� ����ϴ� �Լ� \n �ڵ����� �߰� 
		  ()�� �ƹ��͵� �������� ������ \n�� ����Ѵ�
		  3 printf()
		   ���� ���ڸ� �̿��� �� �ִ� ��� �Լ� 
		   ������ +�� �̾���̴� �� ���� ������ ����ϴ� ��찡 ���Ҷ��� �ִ�.
		  �� �ڵ����� �ٲ����� �ʴ´� \n���� �Է����־���Ѵ�
		  
		*/
		int year = 2021, month = 3, day = 17, hour = 11, minute = 14, second = 14,
				millisec = 1234;
		
		System.out.println (year + " �� " + month + "��" + day + "��");
		
		System.out.println (year + " �� " + month + "��" + day + "��"
				+ hour + ":" + minute + ":" + second + "." + millisec);
		
		System.out.printf("%d�� %d�� %d�� / %d:%d:%d:%d\n" +
		year, month, day, hour, minute, second, millisec);
		
		
		/*
		 	���� ������ ���� 
		 	
		 	%d 10���� ����
		 	%x 16���� ����
		 	%o 8���� ����
		 	%s ���ڿ�
		 	%c ����
		 	%f �Ǽ�
		 	
		 	10���� 
		 	0 1 2 3 4 5 6 7 8 9 10
		 	8����
		 	0 1 2 3 4 5 6 7 10
		 	
		 	16���� 
		 	0 1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 ... 19 1a 1b 1c 1d 1e 1f 20
		 */
		
		// ���Ĺ��� �ɼǵ�
		//���Ĺ��� �ڸ����� d�� �־�� �ϴ� ���� �ƴ� 
		//%����d : ���ڸ�ŭ ĭ�� Ȯ���� �� ������ �����Ͽ� ����Ѵ�
		System.out.printf("��� : %d��", 10);
		System.out.printf("��� : %10d��\n", 10);
		System.out.printf("��� : %20d��\n", 10);

		System.out.printf("[[ %s ]]\n", "Hello,world!");
		
		// %-����d : ���ڸ�ŭ ĭ�� Ȯ���� �� ���� �����Ͽ� ����Ѵ�
		System.out.printf("��� : %d��", 10);
		System.out.printf("��� : %-10d��\n", 10);
		System.out.printf("��� : %-20d��\n", 10);
		
		//%0 ����d : ���ڸ�ŭ ĭ�� Ȯ���� �� �� ĭ�� 0�� ä���� ����Ѵ�
		System.out.printf("%d��\n",5);
		System.out.printf("%02d��\n",5);
		
		// %+����d ��� �տ��� ��ȣ�� �ٿ��ش�
		System.out.printf("���: %d , ����: %d\n", 5, -5);
		System.out.printf("���: %+d , ����: %+d\n", 5, -5, args);
		// %.����f: �Ҽ� �ڸ����� �����Ѵ�
		double avg = 123.12555d;
		
		System.out.printf("������� : %.2f\n", avg);
		
		
		
}
}
