
public class B06_If {

	public static void main(String[] args) {
		//if �� 
		//()���� ���� Ʈ�� �϶� {} ���� ������ �����Ѵ�
		//()���� ���� false�� �� {} ���� ���� 
		//{} �ȿ� �� ������ �����̶�� {} ���� ����
		
	//else if��
		//���� �ִ� if���� ������� �ʾƴٸ� if��ó�� �۵��Ѵ�
		//else if�� �ܵ����� ����� �� ����
		//else if�� ������ ����� �� �ִ� 
		
		// else��
		// ���� �ִ� if, else if�� ��� ������� �ʾҴٸ� {}���� ������ ������ �����Ѵ�
		// if �ٷ� ������ �� ���� �ִ�
		// else�� �پ��ִ� �������� �ּ� �ѹ��� ����ȴ� 
		int a = -8;
		
		
		if (a == 5) {
			System.out.println("Hello");
		} else if (a == 6) {
			System.out.println("Nice to meet you");
		} else if( a> -10) {
			System.out.println("Greeting!");
		} else if(a > -20) {
			System.out.println("Good to see you");
		}
		System.out.println("���α׷��� �������ϴ�");
	
		char ch = '��';
		
		if (ch >= '��' && ch <= '�R') {
			System.out.println("ch �ѱ�");
		} else if(ch >= 0x3040 && ch <= 0x30FF) {
		System.out.println();
		} else {
			System.out.println("�ý��� ����");
		}
		
	}
}
