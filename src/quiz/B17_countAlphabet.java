package quiz;

public class B17_countAlphabet {

	public static void main(String[] args) {
		// 사용자로부터 문장을 하나 입력받고 
		// 해당 문자에 어떤 알파벳이 몇 번 등장했는지 세어서 모두 출력해보세요

		String text = "Everythin is alright";
		
		//문자열을 쉽게 대문자 또는 소문자로 변환하기
		text = text.toUpperCase();
		
		int[] count = new int[26];
		 
		for(int i = 0; i < text.length(); ++i) {
			
			char ch = text.charAt(i);
			
			System.out.println(ch);
			
			if (ch >= 'A' && ch <= 'Z') {
				count[ch - 'A']++;
			}
			
		}
	}

}

