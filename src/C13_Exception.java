import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class C13_Exception {
	
	//����
	//�츮�� ������� �˰� �ִ� ���� �۾����� ��� ���ܶ�� �θ���
	//���α׷��Ӱ� �߻� ������ ���ܸ� �̸� �����ϰ� ���봩�� ����
	//����ó����� �Ѵ�
	//�ڹ��� ���� Ʋ���� ���� ������ ������� �θ��� (��Ÿ)
	//���α׷��Ӱ� ���ܿ� ���Ͽ� ������ ��ġ�� �����شٸ�
	//���α׷��� �������� ���� �ʰ� ����ؼ� ������ �� �ִ�
	//���ܰ� �߻��� ���ɼ��� �ִ� �޼��忡 ���콺�� �÷����� ���ܰ� � ��Ȳ�� �߻��ϴ����� ����
	//�޴����� �����ִ� Throws�� �����ִ�
	
	//����ó��
	
	//���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 try�� ���ο� ���Խ�Ų�� 
	//try�� ���ο� �ִ� �ڵ�� ���ܰ� �߻����� ������ ��� ���� ����ȴ�
	//try�� ���ο��� ���ܰ� �߻��ϴ� ��� ������ ��� �ߴܵǰ� 
	//�ش� ���ܸ� ����ϴ� catch������ �̵��ϰԵȴ�
	// catch���� �߻��� ���ܿ� ���� ������ ��� �ִ� �ν��Ͻ��� �����ϰԵȴ� 
	// catch���� ��ø��� ����
	//���ܰ� �߻��ϵ� ���ϵ� �����ϰ� ���� �ڵ�� fainlly�� �ۼ��Ѵ� 
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.print("���ڸ� �Է�");
		
		try {
			a = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("�̻��Ѱ� �Է���");
			return;
		} catch(IllegalStateException e) {
			System.out.println("��ĳ�ʰ� �����ִµ�");
			a = -1;
			
		} catch (NoSuchElementException  e) {
			System.out.println("��ĳ�ʿ� ���� ������ ����");
			a = -1;
		} finally{
			System.out.println("�䳢");
		}
		System.out.println("����: " + a);
		System.out.println("���α׷��� ���� ����");
		
	}
}
