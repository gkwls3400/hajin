
public class C11_anonymousInnerClass {
	
	//익명 내부 클래스
	//클래스에 이름을 짓지 않고 구현한 다음 바로 사용하는 방식
	//일회용이다
	//
	
	public static void kick(kickable something) {
		something.kick();
		
	}
	
	public static void main(String[] args) {
		kick(new Human());;
		kick(new vendingMachine());
		kick (new Ball("메시"));


		class Door extends kickable {
			
			boolean open;

			
			void kick() {
				if (open) {
				System.out.println("문 참");
				open = false;
				} else {
					System.out.println ("문참");
					open = true;
				}
				
			}
			
		}
		Door door1 = new Door(), door2 = new Door(), door3 = new Door();
		kick(door1);
		
		//익명 클래스 (즉성에서 Door를 상속 인스턴스를 생성)
		//만들고 저장하지 않기 때문에 다시는 사용할 수 없다 (일회용이다)
		kick(new Door() {
			
			void kick() {
				System.out.println("문이 무거움");
			}
		});
		
		kick(new Ball("철수") {
			void kick() {
				System.out.println("농구공을 발로 찼더니 멀리 나가지는 않고 아픔");
			}
		});
		
		//punch 메서드의 인자값으로 전달할 수 있는
		//익명 클래스 2개와 지역 내부 클래스 2개를 만들어서 전달해보세요
		
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
		if (kicker.equals("메시")) {
			System.out.println("슛을 찼음");
		} else if (kicker.equals("기성용")) {
			System.out.println("패스완료");
		}
	}
}

class Human extends kickable{
	
	void kick() {
		System.out.println("참");
		
	}
}

class vendingMachine extends kickable{
	
	void kick() {
		System.out.println(" 찼음");
	}
}








