
public class c08_AccessModifier {

	public static void main(String[] args) {
		// ���� ������
		//�ٸ� Ŭ������ �ش� Ŭ������ �ڿ��� ����Ϸ� �Ҷ�
		//��� ���θ� �����Ѵ� 
		// ���� �����ڸ� ���� ������ �� �ִ� �Ÿ��� ����
		// ���� Ŭ���� ������ �ٸ� �ڿ�
		//���� ��Ű�� ������ �ٸ� �ڿ�
		//�ٸ� ��Ű���� ������ ��ӹ��� �ڿ�
		//�ٸ� ��Ű���� �ڿ�
		//����������
		//public
		//default
		//protected
		//private (���� Ŭ���� ���θ� ���� ����)

	}

	
}
class Snack{
	private int size = 10;
	
	void ext() {
		System.out.println(size -1);
	}
}

class HoneyButterChip extends Snack {
	
	private void abc() {
		System.out.prinln(size);
	}
}