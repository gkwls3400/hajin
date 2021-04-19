package quiz;

public class B11_is_numeric_str {

   public static void main(String[] args) {
      //  입력 받은 문자열에 숫자만 포함되어 있으면 result가 1 
      //  다른 문자가 포함되어 있다면 result가 0

	   String word = "123456";
	   String word2 = "123a123";
	   
	   int numeric_str = 0;
	   
	   for( int i = 0; i < word.length(); ++i) {
		   
		   char ch = word.charAt(i);
		   
		   //"1234a453"
		   if (ch < '0' || ch > '9') {
			   numeric_str = 1;
			   break; // 숫자가 아닌 다른 문자를 하나라도 찾으면 그만
		   }
	   }
	   System.out.println("numeric_str" + (numeric_str > 0 ? "true" : "false"));
   }

}