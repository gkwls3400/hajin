import java.util.Scanner;
public class B15_while {
	

	public static void main(String[] args) {
		//while
		// for���� ������ �ణ �ٸ� �ݺ���
		//�ʱⰪ�� �������� ��ġ�� ������ ���� �ʴ�
		//() ���� ������ ���ϵ��ȸ� {}������ ����
		int i = 0;
		
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		//while���� �������� ��ġ�� ���� ����� �޶��� �� �ִ�
		i = 0;
		while (i< 10) {
			System.out.println("�ݺ��� 2 " +i);
			++i;
		}
		
		//while ���� ����ϱ� ���� ����� Ŭ�������� �ִ�
		 //has,next ���� ���ľ ���� �Լ�(�޼���)�� ������ �ִ� 
		//scanner ��
		Scanner sc1 = new Scanner("apple banana orange");
		Scanner sc2 = new Scanner("1234 1588 1543 111 222 333 444 5555");
		
		// Scanner.hasnext() - ���� ����  ������ true, ������ false
		while (sc1.hasNext()) {
			// Scanner.next() ���� �ϳ��� ���� StringŸ������ ������ 
		}
			System.out.println(sc1.next());
		
		while (sc2.hasNextInt()) {
		System.out.println(sc2.nextInt());
		}
	}
}
