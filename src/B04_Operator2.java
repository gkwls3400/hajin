
public class B04_Operator2 {

	public static void main(String[] args) {
		
		//�� ������ 
		// �� �������� ����� �� �Ǵ� �����̴� (boolean Ÿ���̴�)
		// ��� ����� �� ������ �Բ� ������ ��� ������ ���� �Ѵ� 
		int a = 8, b = 5;
		
		System.out.printf("a = %d, b = %d �� ��\n", a, b);
		System.out.println("a > b" +(a > b));
		System.out.println("a < b" +(a < b));
		System.out.println("a >= b" +(a >= b));
		System.out.println("a <= b" +(a <= b));
		
		System.out.println(" a == b: " + (a == b)); //�� ���� ������ true
		System.out.println(" a != b: " + (a != b)); //�� ���� �ٸ��� true
		
		//�� ������ 
		// boolean Ÿ�� ������ �ϴ� ����
		// && : �� ���� ���� ��� true�� ���� true (AND)
		// || : �� ���� �� �� �ϳ��� true���� true (OR)
		// !  : true�� false, false�� true (NOT)
		
		System.out.println(true && true);//t
		System.out.println(true && false);//f
		System.out.println(false && true);//f
		System.out.println(false && false);//f
		
		
		System.out.println(true || true);//t
		System.out.println(true || false);//t
		System.out.println(false || true);//t
		System.out.println(false || false);//f
		
		System.out.println(!true);
		System.out.println(!false);
		
		int x = 3, y = 6, z = 9;
		
		System.out.println("x�� 10���� �۰� 3�� ����� ���:" +
		( x > 5 && x % 3 == 0));
		System.out.println("3���� ��� 3�� ����� ���: " +
		( x % 3 == 0 && y % 3 == 0 && z % 3 == 0));
		
		
		// ���� ���� : x, y, z �� ��� 3�� ����� �ƴ� �� ����ϴ� ���� ��������
		
		System.out.println(x % 3 != 0 && y % 3 !=0 && z % 3!=0);
		
	}

}
