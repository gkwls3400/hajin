
public class c08_AccessModifier {

	public static void main(String[] args) {
		// 접근 제어자
		//다른 클래스가 해당 클래스의 자원을 사용하려 할때
		//허용 여부를 설정한다 
		// 접근 제어자를 통해 구분할 수 있는 거리의 종류
		// 같은 클래스 내부의 다른 자원
		//같은 패키지 내부의 다른 자원
		//다른 패키지에 있지만 상속받은 자원
		//다른 패키지의 자원
		//접근제어자
		//public
		//default
		//protected
		//private (같은 클래스 내부만 접근 가능)

	}

	
}
class Snack{
	private int size = 10;
	
	void ext() {
		System.out.println(size -1);
	}
}

class HoneyButterChip extends Snack {
	
	private void abc() {
		System.out.prinln(size);
	}
}