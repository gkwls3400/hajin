
public class A05_print {

	public static void main(String[] args) {
		/*
		  콘솔에 출력하기 위한 여러가지 함수들
		  
		  1.print
		  줄바꿈 안함
		  2.println
		  줄을 자동으로 바꿔주며 출력하는 함수 \n 자동으로 추가 
		  ()에 아무것도 전달하지 않으면 \n만 출력한다
		  3 printf()
		   서식 문자를 이용할 수 있는 출력 함수 
		   서식을 +로 이어붙이는 것 보다 서식을 사용하는 경우가 편리할때도 있다.
		  줄 자동으로 바꿔주지 않는다 \n따로 입력해주어야한다
		  
		*/
		int year = 2021, month = 3, day = 17, hour = 11, minute = 14, second = 14,
				millisec = 1234;
		
		System.out.println (year + " 년 " + month + "월" + day + "일");
		
		System.out.println (year + " 년 " + month + "월" + day + "일"
				+ hour + ":" + minute + ":" + second + "." + millisec);
		
		System.out.printf("%d년 %d월 %d일 / %d:%d:%d:%d\n" +
		year, month, day, hour, minute, second, millisec);
		
		
		/*
		 	서식 문자의 종류 
		 	
		 	%d 10진수 정수
		 	%x 16진수 정수
		 	%o 8진수 정수
		 	%s 문자열
		 	%c 문자
		 	%f 실수
		 	
		 	10진수 
		 	0 1 2 3 4 5 6 7 8 9 10
		 	8진수
		 	0 1 2 3 4 5 6 7 10
		 	
		 	16진수 
		 	0 1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 ... 19 1a 1b 1c 1d 1e 1f 20
		 */
		
		// 서식문자 옵션들
		//서식문자 자리에는 d만 넣어야 하는 것은 아님 
		//%숫자d : 숫자만큼 칸을 확보한 뒤 오른쪽 정렬하여 출력한다
		System.out.printf("사과 : %d개", 10);
		System.out.printf("사과 : %10d개\n", 10);
		System.out.printf("사과 : %20d개\n", 10);

		System.out.printf("[[ %s ]]\n", "Hello,world!");
		
		// %-숫자d : 숫자만큼 칸을 확보한 뒤 왼쪽 정렬하여 출력한다
		System.out.printf("사과 : %d개", 10);
		System.out.printf("사과 : %-10d개\n", 10);
		System.out.printf("사과 : %-20d개\n", 10);
		
		//%0 숫자d : 숫자만큼 칸을 확보한 뒤 빈 칸에 0을 채워서 출력한다
		System.out.printf("%d개\n",5);
		System.out.printf("%02d개\n",5);
		
		// %+숫자d 양수 앞에도 부호를 붙여준다
		System.out.printf("양수: %d , 음수: %d\n", 5, -5);
		System.out.printf("양수: %+d , 음수: %+d\n", 5, -5, args);
		// %.숫자f: 소수 자릿수를 설정한다
		double avg = 123.12555d;
		
		System.out.printf("평균점수 : %.2f\n", avg);
		
		
		
}
}
