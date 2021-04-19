package quiz;

public class B11_reverse {

	public static void main(String[] args) {
		// 사용자가 문장을 입력하면 그 문장을 거꾸로 출력해보세요
String sentence = " I Am Iron Man";

for (int i = sentence.length(); i >= 0; --i) {
	sentence.charAt(i -1 );
}
	}

}
