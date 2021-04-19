
public class C05_Inheritance {

		//Ŭ���� ���
		//�̸� ������ Ŭ������ �״�� �����޾Ƽ� ����ϴ� ��
		//������ִ� Ŭ������ �θ� Ŭ���� �Ǵ� ���� Ŭ������� �Ѵ�
		//��� �޴� Ŭ������ �ڽ� Ŭ���� �Ǵ� ���� Ŭ���� ��� �Ѵ�
		
	public static void main(String[] args) {
		person[] persons = new person[3];
		
		persons[0] = new person("ȫ�浿", 10, 10);
		persons[1] = new person("��浿", 45, 15);
		persons[2] = new person("�̱浿", 30, 12);
		
		persons[0].sayHi();
		persons[1].sayHi();
		persons[2].sayHi();
		
		Police police1 = new Police();
		
		police1.sayHi();
		police1.walk();
		police1.run();
		
		police1.thisSuppertext("�Ѹ�");
	}

}

class person{
	String name ="jang ha jin";
	int age = 20;
	int speed = 1;
	
	
	public person(String name, int age, int speed) {
		this.name = name;
		this.age = age;
		this.speed = speed;
	}
	
	void sayHi() {
		//���̸� �������� �����ϰ� �λ礩�ϵ��� ��������
		if (age < 0) {
			System.out.println("?");
		}else if ( age < 10) {
			System.out.printf("�ȳ�!");
		}else if (age < 20) {
			System.out.printf("�ȳ��ϼ���!");
		}else {
			System.out.printf("�ȳ��Ͻʴϱ�!");
		}
		}
	
	
	void walk() {
		System.out.printf("%s���� �ѹ� ������ %d ��ŭ �����Դϴ�.\n", name, speed /2);
	}
	void run() {
		System.out.printf("%s���� �ѹ� ������ %d ��ŭ �پ����ϴ�.\n", name, speed );
	}
}

//1. ��� �޴� Ŭ������ �����ڿ��� ���� ���� �θ��� �����ڸ� ȣ���ؾ� �Ѵ�.
// 	 �θ� Ŭ������ �⺻ �����ڰ� �����ϸ� ������ �� �ִ�, �������� �������� ������ �Ұ����ϴ�

//2 �ڽ� Ŭ������ �θ��� �޼��带 ������� ���ļ� ����Ҽ� �ִ� (�������̵�)

//3 �θ� Ŭ������ �ڽ� Ŭ������ �Ȱ��� �̸��� ���� �ڿ��� �ִ� ���
//super �� this �� ��Ȯ�ϰ� �˼��ִ� 
class Police extends person{
	
	String name;
	
	//�ڽ� Ŭ������ �����ڿ����� ù �ٿ� super()�� �ݵ�� ȣ���ؾ� ��
	Police(){
		super("�����",23,20);
		
		//super(): �θ� Ŭ������ �����ڸ� ȣ���� �� ����Ѵ�.
	}
	
	void sayHi(){
		System.out.printf("�ȳ��Ͻʴϱ� ���� %s �����Դϴ�\n", name);
	}
	void thisSuppertext(String name) {
	System.out.println("�׳� name" + name);
	System.out.println("this.name" +this.name);
	System.out.println("super.name" +super.name);
	}
}
//class Programmer extends person{
//	//��� �����ڸ� ������ �� �ڽ� Ŭ�������� �⺻ �����ڰ� ����� �θ� Ŭ������ �⺻ �����ڸ� ����Ѵ�
//}


