
	public class A02_Variable {

		public static void main(String[] args) {
			/*
			 * #변수 (variable)
			 * 
			 * -데이터를 담을 수 있는 공간
			 * -자바에서는 변수를 반드시 선언한 뒤에 사용해야 한다 
			 * -변수 선언시에는  변수에 저장될 데이터의 타입을 정해줘야 한다
			 * -""나 ''가 없는 모든 문자열 또는 문자는 변수이다
			 * -같은 이름의 변수는 다시 선언할 수 없다
			 * 변수의 선언
			     타입 변수명
			   변수의 선언 (declare, declaration)
			   타입 변수명
			 */
			//int 타입의 변수 a를 앞으로 쭉 사용하겠다
			//int 타입 정수만 저장할수있다 
			//=는 두값이 서로 같다 이지만 프로그램 언어에서는 =는 오른쪽 값을 왼쪽에 대입하여라 
			int a = 10;
			int apple;
			
			
			apple = a + 50;
			System.out.println(a);
			System.out.println(apple);
			
			//여러가지 변수 선언 방식
			//int a;안됨 앞에서 선언하였으므로 중복 선언되지 않는다 
			a = 50;//원래 있던 a의 값은 없어지고 50을 엎어쓴다
			System.out.println(a);
			int b; //변수 하나만 선언하기
			int c,d;//변수를 한번에 여러개 선언 가능하다 
			int e = 55; //변수 선언과 동시에 값을 대입 가능하다 
			//값이 한 번도 대입된적이 없는 변수는 사용할 수 없다.
			//(초기화 되지 않은 변수)
			b = 1000000;
			
			// 변수 여러개 선언과 동시에 값을 대입
			int f = 99, g = 999;
			
			System.out.println("f에 있는 값:" + f);
			System.out.println("g에 들어있는 값:" +g);
			//선언한 변수에 최초로 값을 대입하는 것을 초기화(initialize, init) 라고 한다 
		}
}


