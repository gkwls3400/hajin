
public class C05_Inheritance {

		//클래스 상속
		//미리 만들어둔 클래스를 그대로 물려받아서 사용하는 것
		//상속해주는 클래스를 부모 클래스 또는 슈퍼 클래스라고 한다
		//상속 받는 클래스를 자식 클래스 또는 서브 클래스 라고 한다
		
	public static void main(String[] args) {
		person[] persons = new person[3];
		
		persons[0] = new person("홍길동", 10, 10);
		persons[1] = new person("고길동", 45, 15);
		persons[2] = new person("이길동", 30, 12);
		
		persons[0].sayHi();
		persons[1].sayHi();
		persons[2].sayHi();
		
		Police police1 = new Police();
		
		police1.sayHi();
		police1.walk();
		police1.run();
		
		police1.thisSuppertext("둘리");
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
		//나이를 먹을수록 공손하게 인사ㄹ하도록 만들어보세요
		if (age < 0) {
			System.out.println("?");
		}else if ( age < 10) {
			System.out.printf("안녕!");
		}else if (age < 20) {
			System.out.printf("안녕하세요!");
		}else {
			System.out.printf("안녕하십니까!");
		}
		}
	
	
	void walk() {
		System.out.printf("%s씨는 한번 걸으면 %d 만큼 움직입니다.\n", name, speed /2);
	}
	void run() {
		System.out.printf("%s씨는 한번 걸으면 %d 만큼 뛰었습니다.\n", name, speed );
	}
}

//1. 상속 받는 클래스는 생성자에서 가장 먼저 부모의 생성자를 호출해야 한다.
// 	 부모 클래스에 기본 생성자가 존재하면 생략할 수 있다, 존재하지 않을때는 생략이 불가능하다

//2 자식 클래스는 부모의 메서드를 마음대로 고쳐서 사용할수 있다 (오버라이드)

//3 부모 클래스와 자식 클래스에 똑같은 이름을 가진 자원이 있는 경우
//super 와 this 로 정확하게 알수있다 
class Police extends person{
	
	String name;
	
	//자식 클래스의 생성자에서는 첫 줄에 super()를 반드시 호출해야 함
	Police(){
		super("김경찰",23,20);
		
		//super(): 부모 클래스의 생성자를 호출할 때 사용한다.
	}
	
	void sayHi(){
		System.out.printf("안녕하십니까 저는 %s 형사입니다\n", name);
	}
	void thisSuppertext(String name) {
	System.out.println("그냥 name" + name);
	System.out.println("this.name" +this.name);
	System.out.println("super.name" +super.name);
	}
}
//class Programmer extends person{
//	//모든 생성자를 생략할 시 자식 클래스에도 기본 생성자가 생기고 부모 클래스의 기본 생성자를 사용한다
//}


