import myobj.Peach;
import myobj.Tv;

public class C02_OOP {

	
		//��ü���� ���α׷��� (OOP: object oriendted programming)
		//-���� �����ϴ� ��� �͵��� ������ �Լ��� ǥ���Ϸ��� ���α׷��� �����
		//������ �Լ��� ���к��ϰ� ����ϱ� ���ٴ� ���ǿ� �����ϴ� ��üó�� ���̵��� �Ͽ� �������� �ø���
		//��ü (object) : ���� �����ϴ� ��� ���� ���Ѵ� ( �繰, ���� ,���)
		//
	
	
		//ex ��� 
		//����� ����: ũ��,����, �絵,...
		//����� �޼���: ������(ũ�� ��ŭ�� �������� ������)
		//			�Դ´�(���� ��ŭ Į�θ��� �پ��� ����� ũ�Ⱑ �پ���)
		//			�ұݹ��� �־� ���´� 
		//			�����Ѵ� ( ����� �����ϸ� ��������� ������ �����Ѵ� )
		
		//�Լ��� �޼��� ���� Ŭ���� ���ο� �ִ� �Լ��� �޼���� �θ��� (�ڹٿ��� �޼���ۿ� ����)

		
		//Ŭ���� class
		//��ü�� ���α׷��� ���� ǥ���� �� 
		//Ŭ������ ��ü�� ���赵�� (������ ���������� ��ü�� ����)
		//Ŭ������ ���� �����ϴ� ���� ��ü�� '�ν��Ͻ�'��� �θ���
		//Ŭ������ ������ ���� Ÿ���̴�
	
	//���α׷� ���� �ÿ� public class�� �ִ� main�� ã�� �� �ִ�
	public static void main(String[] args) {
		Apple a1 = new Apple();
		Apple a2 = new Apple();
		Apple a3 = new Apple();
		
		myobj.Peach p1 = new myobj.Peach();
		Peach p2 = new Peach();
		
		
		myobj.Lamp1 l1 = new myobj.Lamp1();
		String color;
		int burglar;
		boolean power;
		
		
		
		
		
		
		a1.calorie = 100;
		a2.calorie = 120;
		a3.calorie = 115;
		
		
		System.out.println(a1.calorie);
		System.out.println(a2.calorie);
		System.out.println(a3.calorie);
		
		String str1 = "abc";
		String str2 = "ccc";
		String str3 = "bb";
		
		
		//myobj ��Ű���� ������ ��ü�� �����Ͽ� Ŭ������ �ϳ� ������ ��
		//�ν��Ͻ��� �����ϰ� ���� ä����� ����غ�����
		Tv t1 = new Tv();
		int chennel = 0;
		int volume = 0;
		chennel++;
		volume--;
		System.out.println(chennel);
		System.out.println(volume);
	}
}
//default class (public�� �� ���� class)
		class Apple {
			//
			//�ν��Ͻ� ����
			//�� �ν��Ͻ����� �ٸ� ���� ���� �� �ִ� ����
			// aka �ʵ�, �Ӽ�, ��� ����, ���� ...
			int size;
			int calorie;
			long lifetime;
			double sweet;
			String color;
			
			// �ν��Ͻ� �޼���
			// �ν��Ͻ� ������ Ȱ���Ͽ� �ش� �ν��Ͻ��� ���¸� ��ȭ��Ű�� �޼���
			void eat() {
				size--;
				calorie -= 10;
			}
		
	}


