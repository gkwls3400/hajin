import java.io.File;

public class E02_FileIO {

	/*
	 
	 java.util.File
	 
	 ���� �ý����� ���� ������ ���� �� �ִ� Ŭ����
	 */
	public static void main(String[] args) {
		
		//�����ڷ� ��� ����
		File a = new File("a.txt");
		File b = new File("b.txt");
		File dir = new File("C:/files/");
		File dir2 = new File("C:/files/");
		
		System.out.println("�������ִ°�" +a.canRead());
		System.out.println("���డ���Ѱ�" +a.canExecute());
		System.out.println("���� ������ �ִ°�?"+ a.canWrite());
		
		
		//���� ��� �˾ƿ���
		System.out.println(a.getAbsolutePath());
		
		
		//  a�� ��� ��ΰ� �������ΰ�?
		System.out.println(a.isAbsolute());
		
		//a�� ��� ���� �ν��Ͻ��� ���丮�ΰ�?
		System.out.println("Is a directory?" + a.isDirectory());
		System.out.println("Is dir directory?" + dir.isDirectory());
		System.out.println("dir" + dir.exists());
		System.out.println("dir" + dir2.exists());
		
		System.out.println(a.exists());
		
		if (!dir2.exists()) {
			dir2.mkdir(); //mkdir(): ���丮 ���� �޼��� 
		} else {
			System.out.println("�̹� �����ϴ� ���丮�Դϴ�");
		}
	}
}
