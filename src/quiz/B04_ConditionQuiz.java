package quiz;

public class B04_ConditionQuiz {

	public static void main (String[] args) {
		
		
//        [ �˸��� �񱳿����� �������� ]
//            
//        1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
//        2. int�� ���� b�� ¦���� �� true                
//        3. int�� ���� c�� 7�� ����� �� true
//        4. int�� ���� hour�� 0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� true
//        5. int�� ���� d�� e�� ���̰� 30�� �� true                
//        6. int�� ���� year�� 400���� ������ �������� true  
//           �Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true
//        7. �μ��� ö������ 2�� ������ true
//        8. �μ��� ö������ ������ 3�� ������ true  
//        9. boolean�� ���� powerOn�� false�� �� true
//        10. ���ڿ� �������� str�� "yes"�� �� true
//   	
		int a = -5;
		int b = 2;
		int c = 21;
		int d = 31, e = 1;
		
		int hour = -5;
		int year = 2020;
		
		int minsuAge = 9 , chulsuAge = 7;
		int minsuBirth = 8, chulsuBirth = 11;
		
		boolean powerOn = false;
		String str = "yes";
		//�񱳸� �� ���� ������ ���ʿ� �ִ°��� ����
		System.out.println(a > 10 && a <20);
		System.out.println( b % 2 == 0);
		System.out.println(c % 7 == 0);
		System.out.println(!(hour < 0  || hour >= 24)
				&& hour >= 12);
		System.out.println(Math.abs( d - e) == 30);
		System.out.println(year % 400 == 0 ||
				( year % 4 == 0 && year % 100 != 0));
		System.out.println(chulsuAge + 2 == minsuAge);
		System.out.println(minsuBirth + 3 == chulsuBirth);
		System.out.println(!powerOn);
		
		//���ڿ���(������ ��������) ==���� ���ϸ� �ȵȴ�.
		//������ Ÿ���� ���� ���� ���� Ŭ������ ���ǵǾ� �ִ� equals()��� �޼��带 �̿��ؾ��Ѵ�
		System.out.println(str == "yes");
		System.out.println(str.equals("yes"));
		
		// �⺻�� Ÿ�԰� ������ Ÿ���� ����
		// �⺻�� Ÿ���� ���� �������� ũ�⸦ �����ϱ� ���� (�������� ���δ�) ���� 
		// ������ Ÿ���� ���� �������� ũ�⸦ �����ϱ� ��ƴ� (�������� ���δ�)��
		String str1 = "yes";
		String str2 = new String("yes");
		String str3 = "yes";
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("str1 == str2 : " + ( str1 == str2));
		System.out.println("str1.equals(str2) :" + str1.equals(str2));
		System.out.println("str1 == str3 : " + ( str1 == str3));
	}
}
