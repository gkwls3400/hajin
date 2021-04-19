
public class C01_Function {

	public static void main(String[] args) {
		// 함수 function
		
		
		//기능을 미리 정의해두고 나중에 가져다 쓰는것 
		//자바에서 함수는 클래스 내부에 선언해야한다
		//정의해둔 함수 이름 뒤에 () 함수를 호출하면
		//호출한 자리에 함수의 실행 겨로가가 반환된다
		//함수를 정의할 때 해당 함수가 반환할 값의 타입을 앞에 적어둔다
		print_rabbit();
		
		int basket = apple_basket(123, 10);
		System.out.println("필요한 바구니의 개수는 " + basket);
	}

	// 사과의 개수를 전달하면 필요한 바구니의 개수를 알려주는 함수
	//public statc 나중에 생각
	//int : 이 함수의 실행 결과의 타입(리턴 타입)
	//apple_basket : 타입뒤에 함수명을 정의할 수 있다 
	//apple_basket(int apple, int size)
	//이 함수를 실행할 때 iont타입 값을 두개 전단 받아 실행한다
	//함수(메서드)나중에 재사용할 가능성이 있는 기능들을 미리 만들어둠으로써
	//코드의 중복을 제거할수 있다
	public static int apple_basket(int apple, int size) {
		
		int result;
		
		if (apple % size == 0) {
			result = apple / size;
		
		} else {
			result = apple / size + 1;
		}
		return result;
	}
	public static void print_rabbit() {
		System.out.println("토끼그림");
		System.out.println("토끼그림");
		System.out.println("토끼그림");
		System.out.println("토끼그림");
	}
	
	apple_basket9155, 10);
}
