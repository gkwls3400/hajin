package quiz;
import java.util.Scanner;
public class B05_ConditionQuiz2 {

	public static void main(String[] args) {
		/*
        [ �˸��� ���ǽ��� �������� ]

        1. char�� ���� a�� 'q'�Ǵ� 'Q'�� �� true
        2. char�� ���� b�� �����̳� ���� �ƴ� �� true
        3. char�� ���� c�� ����('0' ~ '9')�� �� true
        4. char�� ���� d�� ������(�빮�� �Ǵ� �ҹ���)�� �� true
        5. char�� ���� e�� �ѱ��� �� true
        6. char�� ���� f�� �Ϻ����� �� true     
        7. char�� ���� e�� �ѱ���    
*/        
		Scanner sc = new Scanner(System.in);
		char a = 'Q';
		char b = 'A';
		char c = '5';
		char d = ' ';
		char e = '��';
		char f = '��';
		
		String user_input;
		
		System.out.println("1" + (a == 'q' || a == 'Q'));
		System.out.println("2" + (b != ' ' && b != '\t'));
		System.out.println("3" + (c > '0' && c <= '9'));
		System.out.println("4" + ((d >= 'A' && d <= 'Z') || (d >= 'a' && d <= 'z')));
		System.out.println(e >= 0xAC00 && e <= 0xD7AF);
		
		System.out.println((int)'�R');
		
		System.out.println(f >= 0x3034 && f <= 0x309F || (f >= 0x30A0 && f <= 0x0FF));
		
		System.out.print("�ƹ� �ܾ �Է��غ�����");
		user_input = sc.next();
		
		System.out.println(user_input.equals("exit"));
		
		
		
		
	}

}
