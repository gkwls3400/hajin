
public class B07_charAt {
	
	public static void main(String[] args) {
		//"���ڿ�".charAt(intdex);
		// �ش� ���ڿ����� ���ϴ� ��°�� ���ڸ� charŸ������ ������ �Լ�
		// ù��° ���ڴ� 0�� �ε����� �ִ� 
		
		//"���ڿ�".length();
		//�Լ��� �����ϸ� ���ڿ��� ���̸� intŸ������ �˷��ش�
		//
		System.out.println("Hello, everyone!!!");
		System.out.println("Hello, everyone!!!".charAt(0));
		System.out.println("Hello, everyone!!!".charAt(1));
		System.out.println("Hello, everyone!!!".charAt(10));

		String str = "Hello,everone!!!";
		
		System.out.println(str.charAt(7));
		System.out.println("str�� ���¥�ΰ�" + str.length());
		System.out.println(str.charAt(18));
		
	}
}
