import java.util.Scanner;

import myobj.Peach;

public class C03_Constructor {

		//클래스의 생성자 (constructor)
		//클래스의 이름과 똑같은 이름의 메서드
		//메ㅓ드지만 리턴 타입을 정의하지 않는다
		//인스턴스를 생성하기 위해서는 new를 통해 생성자를 호출해야 한다
		//생성자를 정의하지 않은 클래스에는 기본 생성자가 자동으로 생성된다
	//생성자가 모두 실행된 후에는 생성된 인스턴스의 주소가 변환된다
	public static void main(String[] args) {
		String s1 = new String();
		Peach p1 = new Peach();
		Scanner sc= new Scanner(System.in);
		
		Orange[] orange_box = new Orange[7];
		
		for(int i = 0; i < 5; ++i ) {
			orange_box[i] = new Orange();
		}
		
		System.out.println(orange_box[0].sweet);
		System.out.println(orange_box[1].size);
		System.out.println(orange_box[2].color[0]);
		System.out.println(orange_box[3].color[1]);
		System.out.println(orange_box[4].color[2]);
		
		
		// 생성자를 오버로딩한 클래스는 다양한 생성 방식이 생긴다
		new Orange(8);
		orange_box[5] = new Orange(8);
		new Orange(9,10, new int[] { 255, 165, 0});
		System.out.println(a);
		orange_box[6] = new Orange(9, 10, a);
		
		new Scanner(System.in);
		
		System.out.println(p1);
		System.out.println(sc);
		System.out.println(s1);
		
		Strawberry berry01 = new Strawberry(150);
		
		System.out.println(berry01.color);
		System.out.println(berry01.seed);
	}

}

class Orange {
	int sweet;
	int size;
	int[] color;
	
	//생성자 이 클래스의 인스턴스를 생성할 때 가장 먼저 호출되는 메서드
	//생성자는 주로 초기화 용도로 사용된다.
	Orange(){
		System.out.println("오렌지가 초기화었습니다!");
		sweet = 5;
		size = (int)(Math.random() * 3) +7);
		color = new int[] {255, 265,0};
		
	}
	//생성자도 메서드이기 때문에 오버로딩 할 수 있따
	Orange(int sweet) {
		//인스턴스 변수  sweet 에 넘겨받은 SWEET를 대입
		this.sweet = sweet;
		
		//THIS : 각 인스턴스에서 자기 자신을 가리킨다.
		//
	}
	
	Orange(int sweet, int size, int[] color){
		this.sweet = sweet;
		this.size = size;
		this.color = color;
	}
}


//클래스의 인스ㅓㄴ스 변수도 ㅗ기화를 하지 안흐면 배열과 똑가은 초기값을 지닌다
class Strawberry {
	
	int seed;
	String color;
	
	//다른 오버로딩 타입의 생성자가 존재할때는 기본 생성자를 사용할 수 없는 클래스가 된다
	public Strawberry(int seed) {
		this.seed = seed;
	}
}
//아까myobj에 만들었던 클래스에 알맞은 생성자를 추가해보셍






















