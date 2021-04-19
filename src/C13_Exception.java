import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class C13_Exception {
	
	//예외
	//우리가 에러라고 알고 있던 빨간 글씨들을 사실 예외라고 부른다
	//프로그래머가 발생 가능한 예외를 미리 예상하고 대비대누느 것을
	//예외처리라고 한다
	//자바의 문법 틀리는 것을 컴파일 에러라고 부른다 (오타)
	//프로그래머가 예외에 대하여 적절한 조치를 취해준다면
	//프로그램을 강제종료 하지 않고 계속해서 진행할 수 있다
	//예외가 발생할 가능성이 있는 메서드에 마우스를 올려보면 예외가 어떤 상황에 발생하는지에 대한
	//메뉴얼이 적혀있다 Throws에 적혀있다
	
	//예외처리
	
	//예외가 발생할 가능성이 있는 코드를 try문 내부에 포함시킨다 
	//try문 내부에 있는 코드는 예외가 발생하지 않으면 모두 정상 실행된다
	//try문 내부에서 예외가 발생하는 경우 실행이 즉시 중단되고 
	//해당 예외를 담당하는 catch문으로 이동하게된다
	// catch에는 발생한 예외에 대한 정보를 담고 있는 인스턴스가 도착하게된다 
	// catch문은 중첩사용 가능
	//예외가 발생하든 안하든 실행하고 싶은 코드는 fainlly에 작성한다 
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.print("숫자만 입력");
		
		try {
			a = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("이상한걸 입력함");
			return;
		} catch(IllegalStateException e) {
			System.out.println("스캐너가 닫혀있는데");
			a = -1;
			
		} catch (NoSuchElementException  e) {
			System.out.println("스캐너에 읽을 내용이 없음");
			a = -1;
		} finally{
			System.out.println("토끼");
		}
		System.out.println("숫자: " + a);
		System.out.println("프로그램이 정상 종료");
		
	}
}
