
public class A00_Hello {
	/* ������ �ּ�
	  ctrl + c �����ϱ�
	  ctrl + x �߶󳻱�
	  ctrl + v �ٿ��ֱ�
	  ctrl + z �ǵ�����
	  ctrl + y ��� �ǵ������� ��� 
	 */
		// ���� �ּ�

	// public class�� �̸��� �ݵ�� ���ϸ�� ���ƾ� �Ѵ�.
	
		//���� ���� ������ ���� �װ��� Ŀ���� �ΰ�  f2�� ������
		//������ ���� ������ �ذ�å�� �� �� �ִ�
		
		/*main() �Լ� (�Լ��� - �ܾ� �ڿ� ()�� �ִ� ��)
		 * 
		 * -���α׷��� ���� ���� 
		 *  ����ڰ� ���α׷��� ����ϸ� ���� ���� main() �Լ��� ã�Ƽ� �����Ų��
		  main() �Լ��� ������ �߰�ȣ{} �� �����ȴ�
		 */
		public static void main(String[] args) {
			 //���α׷� ����
			
			// System.out.println() �Լ�
			// -()�ȿ� ������ �����͸� �ֿܼ� ����ϴ� �Լ� 
			// �ܼ� - ���ڸ� ������ ���� ȭ�� (���� ��ǻ�� ȭ��)
			// ��Ŭ���� ������ �׽�Ʈ������ �Ͼ� ������ �ܼ��� �����Ѵ�
			//����Ű�� ��Ʈ�� f11 ������ �츮�� ����� ���α׷��� �׽�Ʈ�� �ֿܼ��� ���డ�� 
			//�츮�� ����� �ҽ� �ڵ��� ������� bin������ ����Ǿ� �ִ�
			//�ҽ��ڵ� Ȯ���� .java // ����� .class
			
			System.out.println("����������������������������������������������");
			System.out.println("     Hello, world"    );
			System.out.println("     Hello, world"    );
			System.out.println("     Hello, world"    );
			System.out.println("����������������������������������������������");
			
			// ���α׷� ��
			/* �ڹ��� �����͵� (���ͷ�)
			  
			 
			 1. "" ���̿� ���� ���� ���ڿ�(String), 
			 ���ڸ� ������ �� �� �ִ� ������ Ÿ��
			 2. '' ���̿� ���� �� ����, ���� �� �ϳ�
			 3. �׳� ���ڸ� ���� ��  ����(integer),
			 4. �Ҽ��� ���� ���� " �Ǽ�(float, double) 
			 5. true, false
			 */
			System.out.println("abcdefg");
			System.out.println('a');
			System.out.println('1');
			System.out.println(1234567);
			System.out.println(123.4567 + 3.14);
			System.out.println(123456+12345);
			System.out.println(true);
			System.out.println(false);
			
			//���ڵ��� �����δ� ���� (�����ڵ�)���� ������ �ִ�
			//�츮 ���� ���϶��� ���ڷ� ���̴� ���̴�
			// '' Ÿ���� ����Ÿ������ ��ȯ�� �� �ְ� ���� Ÿ�Ե� ''Ÿ������ ��ȯ�� �� �ִ�
			// ���ڿ� ������ ������ ���� Ÿ���̸� ���� ��굵 �����ϴ�
			System.out.println((int)'A'); //(int)�� ���� ���ڸ� ���ڷ� ���̰� ��
			System.out.println((char)54621); //(char)�� ���� ���ڸ� ���ڷ� ���̰� ��
			System.out.println((int)'��');
			System.out.println((char)('A'+1));
			System.out.println((int)('A')+1);
			System.out.println((int)'A');
			System.out.println((int)'a');
			
			//���ڿ� Ÿ�԰� �ٸ� Ÿ���� ���ϸ� ����� �ϴ°��� �ƴ϶� �̾���δ�
			System.out.println("������"+"������");
			System.out.println("'A'�� �������� ��� :" + 'A');
			System.out.println('1' + 5);//1�� �����ڵ忡 5�� ���ϴ�
			System.out.println("1" + 5);//���ڿ� + ����
			System.out.println('A' + 5);
			System.out.println(1+5);
			System.out.println("'A'�� ���� �ڵ尪:" + (int)'A');
			System.out.println("'1'�� ���� �ڵ尪:" + (int)'1');
			//; (���� �ݷ�) �� ��ɾ �������� �˸���
			
			//���� + �Ǽ��� �Ǽ��� �ȴ�
			//���� + ������ ������ �ȴ�
			//���� + ���ڴ� ������ �ȴ� 
			System.out.println('a' + 10);
			System.out.println((char)('a' + 10));
			System.out.println(10 + 10);
			System.out.println(3.1 + 3);
		}

	}


