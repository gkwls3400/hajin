
public class B05_TypeCasting {

	public static void main(String[] args) {
		// Ÿ�� ĳ����
		
		// Ÿ���� �ڿ������� ���ϴ� ��� (Ÿ���� ���ϴ��� ������ ���� ��)
		// Ÿ���� ������ ��ȯ��Ű�� ��� (Ÿ���� ���ϸ� ���� ������ ���涧 )
		
		// Ÿ���� ũ�� 
		
		// ����Ÿ�� : byte1 char2 short2 int4 long8
		// �Ǽ� Ÿ��: float4 < double8
		// ���� Ÿ���� ������ �Ǽ�Ÿ�� ���� �۴�
		//1 �ڿ������� Ÿ�� ĳ����
		byte _byte = 127;
		short _short;
		int _int;
		long _long;
		float _float;
		
		_int = _byte;
		_int = 200000000;
		_long = _int;
		_float = _long;
		
		System.out.println(_float);
		
	// 2 ���� �ջ�� ������ �ִ� Ÿ�� ĳ���� 
		_int = 50000;
		_short = (short)_int; // ���� �ջ�� ���� �����Ƿ� �����Ϸ��� ��� ���ش� 
		System.out.println(_short);//�����÷ο� �߻� 
		
		int a = (int)Math.round(10.3);

		
		//3 ���� ���̴��� �ٸ��� �ؼ��� �� �ִ� Ÿ���� ��� Ÿ�� ĳ������ �ʿ��ϴ�
		int a1 = 80;
		
		char ch = 'z';
		System.out.println((char) a1);
		System.out.println(a1);
		System.out.println((int)ch);
		System.out.println(ch);
		
		//�ڵ�ǥ �ܿ� �ʿ䰡 ���� (charŸ�Կ� ���ڸ� ����� ������ ����);
		ch = 'M';
		System.out.println(ch > 'A');
		System.out.println(ch < 'Z');
		
		ch = '��';
		
		System.out.println(ch > '��');
		System.out.println(ch < '��');
		
		System.out.println((int)'��');
	}

}
