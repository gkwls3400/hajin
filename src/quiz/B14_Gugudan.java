package quiz;

public class B14_Gugudan {

	public static void main(String[] args) {
		// 1. �������� ������ ���� ���η� ����غ�����
		//2�� : 2x1=2....
		
		//2 �������� ������ ���� ���η� ����غ�����
		
		//2�� 	3�� 		4��
		//2X1=2 3x1=3	4x1=4
		
		for(int line = 0; line <= 9; ++line) {
			
			for(int dan = 2; dan <= 9; ++dan) {
				
				if(line ==0) {
					System.out.print(dan + "��\t");
				} else {
				
				System.out.printf("%dx%d=%d\t", dan, line, dan * line);
			
		}
		}
			System.out.println();

	}
	}
}
