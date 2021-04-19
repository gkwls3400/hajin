package quiz;

import java.util.Random;

public class B16_TempPassword {

	/*
	                4자리의 랜덤 임시비밀번호를 생성하는 프로그램을 만들어보세요.
	                (비밀번호를 구성하는 문자는 영어 대문자와 숫자입니다)         
	 */
	public static void main(String[] args) {

		StringBuilder tempPassword = new StringBuilder();
		int size = 4;

		for (int i = 0; i < size; ++i) {                        
			switch ((int)(Math.random() * 2)) {
			case 0:
				tempPassword.append((char)(Math.random() * 26 + 'A'));
				break;
			case 1:
				tempPassword.append((char)(Math.random() * 10 + '0'));
				break;                                
			}
		}
		System.out.println("임시 비밀번호: " + tempPassword.toString());

		System.out.println("---------------------------");

		// 2.Random 클래스
		//좀 더 편리하게 랜덤 값을 선택할 수 있는 기능들이 모여있는 클래스
		// 생성할 때 랜덤 시드가 생성된다
		//원하는 랜덤 시드를 선택할 수도 있다
		Random ran = new Random();

		//Random.nextInt(bound)
		// 0~ bound 미만의 정수를 반환한다
		System.out.println(ran.nextInt(45)+ 1); //1 ~45의 랜덤 정수
		System.out.println(ran.nextInt(41)+ 30);//30~ 70의 랜덤 정수
		System.out.println(ran.nextInt(45)+ 1);
		System.out.println(ran.nextInt(45)+ 1);
		System.out.println(ran.nextInt(45)+ 1);

	}

}




