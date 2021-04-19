
public class C12_Interface {

	
	//�������̽� 
	// class�� ����� ������ ���� �� ���ٴ� ������ ������ �� 
	//�������̽� ������ �޼���� �ڵ����� abstract public �� �ȴ�
	//�������̽� ������ ������ �ڵ����� final static �� �ȴ� 
	//�������̽��� ������ �޼��带 ������ �� default�� ���̸� �⺻ ������ ������ �� �ִ�

	 public static void main(String[] args) {
		 new OrangeTree().click();
	 }
 }

interface CanClick {
	default void click() {
		System.out.println("Ŭ�� �������̽��� �޷��ִ� Ŭ������ �⺻����.");
	}
}
interface CanPunch {
	void punch();
}

class OrangeTree implements CanClick, CanPunch{
	public void punch() {
		
	}
	public void click() {
	}
}
