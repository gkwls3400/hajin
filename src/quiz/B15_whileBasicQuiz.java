package quiz;

public class B15_whileBasicQuiz {

	public static void main(String[] args) {
		// While���� �̿��Ͽ�
		//1���� 100������ 3�� ����� ����
		
		//200���� 1���� ���
		
		//continue�� �̿��Ͽ� 300���� 500������ 7�� ����� ���
		
		//1���� 200������ ���� �� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ����
		 int i = 0;
		 int sum = 0;
		 while (i++ <100) {
			 if (3 % 3 == 0) {
			 sum += 1;
		 }
	                
		System.out.println(sum);
	    }
		 
		 i = 200;
		 
		 while (i > 0) {
			 System.out.println(i--);
			 
		 }
		 i = 299;
		 
		 while (i++ <= 500) {
			 
			 if( i% 7 !=0) {
				 continue;
			 }
			 System.out.println(i++);
		 }
		 
		 i = 0;
		 sum = 0;
		 
		 while (i++ < 200) {
			 if( i% 2 != 0 && i % 3 !=0) {
				 sum += i;
			 }
		 }
		 
		 System.out.println("4 �� ��: " + sum);
	}
}


