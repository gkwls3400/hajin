
public class C11_anonymousInnerClass {
	
	//�͸� ���� Ŭ����
	//Ŭ������ �̸��� ���� �ʰ� ������ ���� �ٷ� ����ϴ� ���
	//��ȸ���̴�
	//
	
	public static void kick(kickable something) {
		something.kick();
		
	}
	
	public static void main(String[] args) {
		kick(new Human());;
		kick(new vendingMachine());
		kick (new Ball("�޽�"));


		class Door extends kickable {
			
			boolean open;

			
			void kick() {
				if (open) {
				System.out.println("�� ��");
				open = false;
				} else {
					System.out.println ("����");
					open = true;
				}
				
			}
			
		}
		Door door1 = new Door(), door2 = new Door(), door3 = new Door();
		kick(door1);
		
		//�͸� Ŭ���� (�Ｚ���� Door�� ��� �ν��Ͻ��� ����)
		//����� �������� �ʱ� ������ �ٽô� ����� �� ���� (��ȸ���̴�)
		kick(new Door() {
			
			void kick() {
				System.out.println("���� ���ſ�");
			}
		});
		
		kick(new Ball("ö��") {
			void kick() {
				System.out.println("�󱸰��� �߷� á���� �ָ� �������� �ʰ� ����");
			}
		});
		
		//punch �޼����� ���ڰ����� ������ �� �ִ�
		//�͸� Ŭ���� 2���� ���� ���� Ŭ���� 2���� ���� �����غ�����
		
	}
	
	public static void punch(Punchable something) {
		
	}
}

abstract class Punchable{
	abstract void punch();
}


abstract class kickable {
	abstract void kick();
}





class Ball extends kickable{
	String kicker;
	
	public Ball(String kicker) {
		this.kicker = kicker;
	}
	
	void kick() {
		if (kicker.equals("�޽�")) {
			System.out.println("���� á��");
		} else if (kicker.equals("�⼺��")) {
			System.out.println("�н��Ϸ�");
		}
	}
}

class Human extends kickable{
	
	void kick() {
		System.out.println("��");
		
	}
}

class vendingMachine extends kickable{
	
	void kick() {
		System.out.println(" á��");
	}
}








