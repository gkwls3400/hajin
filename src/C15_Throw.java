

public class C15_Throw {
	
	// throw
	//���ϴ� ���ܸ� �߻���Ų��
	
	
	
	//throws
	//�ش� �޼��忡�� �̷��� ���ܵ��� �߻���Ų�ٴ� ���� �˸��� 
	//�ش� �޼��带 ȣ���ϴ� ���� ��� ���� �� �ִ�
	//���ܿ� ���� ó���� ȣ���ϴ� ������ �����Ѵ� 
	
	//Exception Ŭ������ ��ӹ��� ���ܴ� "�ݵ�� ó���ؾ� �ϴ� ����" �� �ȴ� 
	//Exception�� ����ó���� ���� ������ Ŀ���� ������ �߻���Ų��
	// ����ó���� �� ��쿡�� �������� ������ش�
	
	//runtimeException Ŭ������ ��ӹ��� ���ܴ� �ݵ�� ó������ �ʾƵ� �Ǵ�  ���ܰ� �ȴ� 
	//InputMismathException,
	
	//InputMismathException, ArrayIndexOutOfBoundException ����
	//���� ó���� ���� �ʾƵ� ������ ������ �߻����� �ʴ� ���ܵ�
	public static void main(String[] args) {
		
		C15_Throw instance = new C15_Throw();
		
	}
	
	

	public  void dangerous_method() {
		
		//������ ������ �о���� ���� �غ� ����
		//������ ������ �о���� ���� �غ� ����( �� ó���ؾ� �ϴ� ���ܰ� �߻�)
		File f = new File();
		FileReader reader = new FileReader(f);
	}
	
	public void dangerous_method2() {
		throw new ArrayIndexOutOfBoundsException("�׳� ����");
	}
	
	public void checkEven(int num) throws NotEvenException {
		if (num % 2 ==0) {
			System.out.println("");
		}else {
			throw new NotEvenException();
		}
		
		System.out.println("checkEven �޼��尡 ���� ���� �Ǿ����ϴ�");
	}
}

// ¦���� �ƴҶ� �߻���ų ����(ó������ ������ ������ �Ұ�)
class  NotEvenException extends Exception{
	public NotEvenException() {
		super("¦���� �ƴϾ �߻��ϴ� ����");
	}
}

//Ȧ���� �ƴ� �� �߻���ų ����(����ó�� ���� �ʾƵ� �������� ���� �ʴ� ����)
class NotOddException extends RuntimeException{
	public NotOddException() {
		super("Ȧ���� �ƴϾ �߻��ϴ� ����");
	}
}














