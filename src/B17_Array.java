
public class B17_Array {

	public static void main(String[] args) {
		
		//배열(array 
		//같은 타입 변수를 한번에 여러개 선언하는 방법
		//같은 이름으로 변수를 여러개 선언한 뒤 인덱스를 활용해 구분한다
		//배열은 한번 정해진 크기가 정해지면 크기를 변경할수없다
		//배열은 생성과 동시에 초기화가 되어있다
		//정수 0 실수 0.0 boolean: false, 참조형 null
		int[] score = new int[133];
		
		//배열도 배열.length를 통해서 길이를 알수 있다
		int sum =0;
		double average = 0d;
		for (int index = 0; index < score.length; ++index) {
			score[index] = (int)(Math.random() * 101);
		}
		System.out.println("10번쨰 학생"+ score[9]);
		
		//연습 문제1 : score의 총합과 평균을 출력해보세요
		for (int index = 0; index < score.length; ++index) {
			score[index] = (int)(Math.random() * 133);
			  sum += score[index];
		}
		average = sum /(double)(score.length);
		System.out.println((double)Math.round(average*1000)/1000.0);
		System.out.println(sum);
		
		//배열을 선언하는 방법
		
		//1 타입[] 배열이름 = new 타입[배열크기];
		//2 타입 [] 배열이름 = {값1 , , , , ,}
		//3 타입 [] qodufdlfma =new 타입[] {값1,,,,,,,};
		
		char[] grades = new char[50];
		int[] age = { 10, 15, 20, };
		boolean[] passExam = { true, false, true, true, false };
		
		String[] animals = new String [] { "lion", "tiger", "penguin", "monkey"};
		
		System.out.println(animals[0]);
		System.out.println(animals[3]);
		
		if (passExam[3]) {
			System.out.println("4번쨰 사람은 시험에 통과했습니다");
		}
		for (int i = 0; i <grades.length; ++i) {
			System.out.println((int)grades[i]);
		}
		//배열은 변수와 다르게 초기화가 자동으로 되어있다
		int[] arr = new int[3];
		
		int a, b, c;
		
		System.out.println(arr[0]);
		
		//String 은 Char형 배열로 변환할 수 있다
		char[] msg1 = new char[] {'h','e','l','l','o'};
		String msg2 = "hello";
		char[] msg3 = msg2.toCharArray();
		
		System.out.println(msg1[0]);
		System.out.println(msg1[1]);
		System.out.println(msg1[2]);
		
		System.out.println(msg2.charAt(0));
		System.out.println(msg2.charAt(1));
		System.out.println(msg2.charAt(2));
		
		System.out.println(msg3[0]);
		System.out.println(msg3[1]);
	}

}







