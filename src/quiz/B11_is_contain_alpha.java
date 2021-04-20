package quiz;
import java.util.Scanner;
public class B11_is_contain_alpha {

   public static void main(String[] args) {

   	
	   String word = "I have a dream";
	   String word2 = "나는 꿈이 있어요";
	   //반복문을 이용해 문자열을 한 글자씩 분해하여 검사한다''
	   
	   boolean result = false;
	   
	   for (int index = 0; index < word.length(); ++index) {
		  char ch = word2.charAt(index);
		  
		 
		  if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			  
			  result = true;
			  break; 
		  }
		   
	   }
   }
 }




