package quiz;
import java.util.Scanner;
public class B11_is_contain_alpha {

   public static void main(String[] args) {

   	
	   String word = "I have a dream";
	   String word2 = "���� ���� �־��";
	   //�ݺ����� �̿��� ���ڿ��� �� ���ھ� �����Ͽ� �˻��Ѵ�''
	   
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




