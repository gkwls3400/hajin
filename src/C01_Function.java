
public class C01_Function {

	public static void main(String[] args) {
		// �Լ� function
		
		
		//����� �̸� �����صΰ� ���߿� ������ ���°� 
		//�ڹٿ��� �Լ��� Ŭ���� ���ο� �����ؾ��Ѵ�
		//�����ص� �Լ� �̸� �ڿ� () �Լ��� ȣ���ϸ�
		//ȣ���� �ڸ��� �Լ��� ���� �ܷΰ��� ��ȯ�ȴ�
		//�Լ��� ������ �� �ش� �Լ��� ��ȯ�� ���� Ÿ���� �տ� ����д�
		print_rabbit();
		
		int basket = apple_basket(123, 10);
		System.out.println("�ʿ��� �ٱ����� ������ " + basket);
	}

	// ����� ������ �����ϸ� �ʿ��� �ٱ����� ������ �˷��ִ� �Լ�
	//public statc ���߿� ����
	//int : �� �Լ��� ���� ����� Ÿ��(���� Ÿ��)
	//apple_basket : Ÿ�Եڿ� �Լ����� ������ �� �ִ� 
	//apple_basket(int apple, int size)
	//�� �Լ��� ������ �� iontŸ�� ���� �ΰ� ���� �޾� �����Ѵ�
	//�Լ�(�޼���)���߿� ������ ���ɼ��� �ִ� ��ɵ��� �̸� ���������ν�
	//�ڵ��� �ߺ��� �����Ҽ� �ִ�
	public static int apple_basket(int apple, int size) {
		
		int result;
		
		if (apple % size == 0) {
			result = apple / size;
		
		} else {
			result = apple / size + 1;
		}
		return result;
	}
	public static void print_rabbit() {
		System.out.println("�䳢�׸�");
		System.out.println("�䳢�׸�");
		System.out.println("�䳢�׸�");
		System.out.println("�䳢�׸�");
	}
	
	apple_basket9155, 10);
}
