package quiz;
import java.util.Scanner;
public class B11_Palindrome {

	public static void main(String[] args) {

		//����ڷκ��� �ܾ �ϳ� �Է¹ް� 
		//�ش� �ܾ ȸ���̶�� "PALINDROME"�� ���
		//ȸ���� �ƴ϶�� "NOT PALINDROME"�� ���
		//ȸ��? MOM BOB  ABBA  MADAM ó�� �¿� ��Ī�� �ܾ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է�");
				String word = sc.next();
				
				String result = "palindrome";
				
				for (int i = 0; i < word.length() / 2; ++i) {
				char ch = word.charAt(i);
				char ch2 = word.charAt(word.length() -i -1);
				
				if (ch != ch2) {
					result = "not pa;indrome";
					break;
				}
				
				System.out.println("�̹��� �˻��� ����" + ch);
				System.out.println("���ϰ� �Ǵ� ����:" + ch2);
					
		}
		
	}
}

