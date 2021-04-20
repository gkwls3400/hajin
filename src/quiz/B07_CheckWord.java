package quiz;
import java.util.Scanner;
public class B07_CheckWord {

	public static void main(String[] args) {
		
		
			
			Scanner sc = new Scanner(System.in);
			
			
			System.out.print("ют╥б");
			String word = sc.next();
			
			int lastIndex = word.length() -1;
			System.out.println(word);
			
			if (word.charAt(0) == word.charAt(lastIndex)) {
				System.out.println("OK");
			} else {
				System.out.println("NOT OK");
			}
		
		
		

	}

}
