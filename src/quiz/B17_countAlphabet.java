package quiz;

public class B17_countAlphabet {

	public static void main(String[] args) {
		// ����ڷκ��� ������ �ϳ� �Է¹ް� 
		// �ش� ���ڿ� � ���ĺ��� �� �� �����ߴ��� ��� ��� ����غ�����

		String text = "Everythin is alright";
		
		//���ڿ��� ���� �빮�� �Ǵ� �ҹ��ڷ� ��ȯ�ϱ�
		text = text.toUpperCase();
		
		int[] count = new int[26];
		 
		for(int i = 0; i < text.length(); ++i) {
			
			char ch = text.charAt(i);
			
			System.out.println(ch);
			
			if (ch >= 'A' && ch <= 'Z') {
				count[ch - 'A']++;
			}
			
		}
	}

}

