package quiz;
import java.util.Scanner;
public class B11_Palindrome {

	public static void main(String[] args) {

		//사용자로부터 단어를 하나 입력받고 
		//해당 단어가 회문이라면 "PALINDROME"을 출력
		//회문이 아니라면 "NOT PALINDROME"을 출력
		//회문? MOM BOB  ABBA  MADAM 처럼 좌우 대칭인 단어
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
				String word = sc.next();
				
				String result = "palindrome";
				
				for (int i = 0; i < word.length() / 2; ++i) {
				char ch = word.charAt(i);
				char ch2 = word.charAt(word.length() -i -1);
				
				if (ch != ch2) {
					result = "not pa;indrome";
					break;
				}
				
				System.out.println("이번에 검사할 문자" + ch);
				System.out.println("비교하게 되는 문자:" + ch2);
					
		}
		
	}
}

