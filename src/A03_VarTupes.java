
public class A03_VarTupes {
	
		
		public static void main(String[] args) {
			
			/*
			 * ���� Ÿ��
			 *byte (1byte)
			 *
			 *	1byte = 8bit
			 *
			 *	0000 0000 (0)~ 1111 1111(255)���� ǥ������ 
			 * ù ��° ��Ʈ�� ��ȣ ��Ʈ�� ���ȴ� 
			 *byte Ÿ���� ��� ���� 0000 0000(0) ~0111 1111����(127)
			 *byte Ÿ���� ���� ���� 1000 0000(-128) ~1111 1111����(-1)
			 *	2 ^ 1 - 2����
			 *	2 ^ 2 - 4����
			 *	2 ^ 3 - 8����
			 *  2 ^ 4 - 16����
			 *  
			 * short(2byte)
			 * 
			 *  2byte - 16bit
			 *  2 ^ 16 65536����
			 *  short  �� ��� ���� 0~32767
			 *  short  �� ���� ���� -32768~ -1
			 *char(2byte, unsigned)
			 *
			 *	2byte - 16bit
			 *	��ȣ�� ���� ������ 0~65535�� ����� ������ �� �ִ� Ÿ��
			 *�ַ� ���� �ڵ带 �����ϴµ��� ����Ѵ� (���� Ÿ��)
			 *	2^ 16 - 65536����
			 *	0~65535
			 *int(4byte)
			 *
			 * 4byte - 32bit
			 * 	2^ 32 - 4,294,967,296����
			 * int�� ��� ������ 0~2,147,483,647
			 * int�� ���� ������ -2,147,483,648~ -1
			 * 
			 *long(8byte)
			 * 
			 * 8byte - 64bit
			 * 
			 * 2 ^ 64
			 * */
			byte minByte = -128;
			byte MaxByte = 127;
			System.out.println("byteŸ�Կ� ������ �� �ִ� ���� ū ���� " + minByte +"�̰�,"
					+ "���� ���� ���� " + MaxByte + "�Դϴ�");
			
			short minShort = -32768;
			short MaxShort = 32767;
			
			System.out.println("shortŸ�Կ� �����Ҽ� �ִ� ���� ū ����"+ minShort + "�̰�,"
					+"���� ���� ���� ����" + MaxShort +"�Դϴ�");
			char maxChar = 65535;
			char minchar = 0;
			
			char ch = '��';
			System.out.println("char Ÿ�Կ� ����� ���� �⺻������ ���ڷ� ��µȴ�." + ch);
			System.out.println("char Ÿ�Կ� ����� �ڵ尪�� Ȯ���ϰ� ������ (int)�� ���δ�."
					+(int)ch);
			
			int intMax = 2_147_483_647;
			int intmin = -2_147_483_648;
			System.out.println("intŸ�Կ� �����Ҽ� �ִ� ���� ū ���� "+ intMax +" �̰� ���� ���� ����" + intmin + "�̴�");
			//���� 
			//int�� ������ �Ѿ�� ���ڸ� ����� ���� L�� �ٿ��� �Ѵ� 
			long _long = 2_147_483_648L;
			/*
			 * 
			 * �Ǽ� Ÿ��
			 * 
			 * float (4byte)
			 * double(8byte)
			 */
			//�׳� �Ҽ��� ���°��� �⺻������ doubleŸ���̴�
			//float Ÿ���� �Ҽ��� �ڿ� f�� �ٿ��� �Ѵ� 
			float weight = 65.66f;
			double height = 177.77;
			/*
			 * 
			 * �Ǽ��� �ַ� �׷��� ���߿� ���ȴ�.
			 * �ε��Ҽ��� ����� ����Ѵ�.
			 * 
			 * boolean Ÿ��
			 * ��/ ���� Ÿ��
			 */
			boolean hasFood = true;
			boolean over130cm = true;
			 /* 
			 * ���� ������ ǥ���ϴµ��� ���Ǵ� Ÿ��
			 * ���� true�� false �ۿ� ����
			 * 
			 * ������ Ÿ�� (Ŭ���� Ÿ��)
			 *  
			 *  ������ Ÿ���� �⺻�� Ÿ�Ե���� �ٸ��� �빮�ڷ� �����Ѵ�.
			 *  String : ���ڿ� 
			 *  �� �� ��� Ŭ������ ..
			 *  String�� ���ڿ��� �����ҋ� ����Ѵ� 
			 *  
			 */
			String helloMessage = "Hello, My name is Jang ha jin.";
			String byeMessage = "Good bye";
			
			System.out.println(helloMessage);
			
			System.out.println(byeMessage + byeMessage + byeMessage);
		}
	}


