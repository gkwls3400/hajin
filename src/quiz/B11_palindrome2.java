package quiz;

public class B11_palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "aaaa";
		
		boolean palindrome = true;
		for ( int i = 0, j = word.length() - 1 ; i < word.length(); ++i, --j) {
			
			//System.out.rpintf(" '%c VS %%c \n", word,charAt(i), word.charAt(j));
			
			if (word.charAt(i) != word.charAt(j)) {
				palindrome = false;
				break;
			}
		}
		
		System.out.println(palindrome  ? "ȸ���Դϴ�." : "ȸ���� �ƴմϴ�.");
	}

}
