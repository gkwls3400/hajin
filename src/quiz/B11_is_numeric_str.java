package quiz;

public class B11_is_numeric_str {

   public static void main(String[] args) {
      //  �Է� ���� ���ڿ��� ���ڸ� ���ԵǾ� ������ result�� 1 
      //  �ٸ� ���ڰ� ���ԵǾ� �ִٸ� result�� 0

	   String word = "123456";
	   String word2 = "123a123";
	   
	   int numeric_str = 0;
	   
	   for( int i = 0; i < word.length(); ++i) {
		   
		   char ch = word.charAt(i);
		   
		   //"1234a453"
		   if (ch < '0' || ch > '9') {
			   numeric_str = 1;
			   break; // ���ڰ� �ƴ� �ٸ� ���ڸ� �ϳ��� ã���� �׸�
		   }
	   }
	   System.out.println("numeric_str" + (numeric_str > 0 ? "true" : "false"));
   }

}