package quiz;

public class B14_Gugudan {

	public static void main(String[] args) {
		// 1. 구구단을 다음과 같이 가로로 출력해보세요
		//2단 : 2x1=2....
		
		//2 구구단을 다음과 같으 세로로 출력해보세요
		
		//2단 	3단 		4단
		//2X1=2 3x1=3	4x1=4
		
		for(int line = 0; line <= 9; ++line) {
			
			for(int dan = 2; dan <= 9; ++dan) {
				
				if(line ==0) {
					System.out.print(dan + "단\t");
				} else {
				
				System.out.printf("%dx%d=%d\t", dan, line, dan * line);
			
		}
		}
			System.out.println();

	}
	}
}
