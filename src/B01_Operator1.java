
public class B01_Operator1 {

	public static void main(String [] args) {
		/*
		 ������ Operator
		 ����Ҷ� ����ϴ°�
		 
		 ��� ������ 
		 */
		
		// ��� ������
		int a = 10, b = 7;
		double c = 7.0;
		
		System.out.println("+ :"+ (a + b));
		System.out.println("- :"+ (a - b));
		System.out.println("* :"+ (a * b));
		System.out.println("/ :"+ (a / b));
		
		System.out.println(a / (float)b);
		System.out.println(a / (double)b);
		
		System.out.println("%: " + a % b);
		
		System.out.println("���� : "  + Math.pow(a, 3));
		System.out.println("����? : "  + (a ^ b)); //^�� ������ �ƴϴ� //��Ʈ����
		System.out.println("������ :" + Math.sqrt(50));
		System.out.println("���밪 :" + Math.abs(-25));
		System.out.println("�Ҽ��� ù��¥������ �ݿø� : " + Math.round(3.335));
		System.out.println("�Ҽ��� ù��¥������ �ݿø� : " + Math.round(3.335 * 100)/100.0);
		
		System.out.println("�ø�:" +Math.ceil(1.001));
		System.out.println("����:" +Math.floor(1.999));
		
		System.out.println("�� ū ���� :" + Math.max(1000, 10001));
		System.out.println("�� ���� ���� :" + Math.min(1000, 10001));
		
		//��Ʈ����
		// &,  ^ >> << 
		// a = 10 // b = 7
		// 2������ a�� 1010, b = 0111
		
		
		// a 1010
		// b 0111
		//------ & 
		// 0010 ->2
		System.out.println(a & b); //and
		
		// 1010
		// 0111
		// -----
		// 1111 ���� �ϳ��� 1�̸� 1
		System.out.println(a | b);// or
		System.out.println(a ^ b);
		System.out.println(8 << 2);
		System.out.println(8 >> 2);
	}
}
