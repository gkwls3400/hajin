package quiz;

public class D07_PhoneBook {
/*
    # HashMap�� �̿��� ��ȭ��ȣ�θ� �����غ�����
    
    1. �׷� / ��ȭ��ȣ / �̸��� �����ؾ� �Ѵ�
    2. �׷� �̸��� Ű������ ������ �ش� �׷��� ��ȭ��ȣ ����� ���´�
    3. ��ȭ��ȣ ��Ͽ� ��ȭ��ȣ�� Ű������ ������ �̸��� ���´�
    
    # �����ؾ� �� �޼���
    
    1. ���ο� �׷��� �߰��ϴ� �޼��� 
    2. �����ϴ� �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼��� (�׷��� ���ٸ� �̺з� �׷쿡 ����) 
    3. ��ϵ� ��� ��ȭ��ȣ�� ������ �̸����� ������������ �����ִ� �޼���
    4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �˻� �޼��� 
    5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �˻� �޼���  
    */
	
	public boolean addGroup(String groupName) {
		if(phonebook.containKey(grupName)) {
			System.out.println("�̹� �����ϴ� �׷��Դϴ�. : " + groupName);
			return false;
		} else {
			System.out.println("���������� �߰��Ǿ����ϴ� : " + groupName);
			return true;
		}
	}
	
	public void printGroupList() {
		for( String groupName : phonebook.keySet()) {
			System.out.printf("#### %s ####\n", groupName);
		}
	}
	
	public static void main(String[] args) {
		D07_PhoneBook book = new D07_PhoneBook();
		
		book.addGroup("����");
		book.addGroup("��ȣȸ");
		book.addGroup("�ʵ��б� ��â");

	}
}
