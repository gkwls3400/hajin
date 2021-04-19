import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_regex {

	/*
	 * Á¤±Ô Ç¥Çö½Ä (Regular Expression)
	 * 
	 * ¹®ÀÚ¿­ÀÇ ÆĞÅÏÀ» Ç¥ÇöÇÏ´Â Ç¥Çö½Ä ¾ğ¾î¿¡ Á¾¼ÓµÇÁö ¾Ê´Â´Ù ÇÁ·Î±×·¡¸Ó°¡ ¿øÇÏ´Â ¹®ÀÚ¿­ ÆĞÅÏ°ú ÀÏÄ¡ÇÏ´ÂÁö °Ë»çÇÒ¶§ »ç¿ëÇÑ´Ù
	 * 
	 * Pattern Å¬·¡½º
	 * 
	 * Á¤±Ô Ç¥Çö½ÄÀ» ´Ù·ç´Â Å¬·¡½º
	 * 
	 * Matcher Å¬·¡½º
	 * 
	 * ÆĞÅÏ ÀÎ½ºÅÏ½º¸¦ ÀÌ¿ëÇÏ¿© ¹®ÀÚ¿­À» °Ë»çÇÒ ¶§ »ç¿ëÇÏ´Â Å¬·¡½º
	 * 
	 */
	public static void main(String[] args) {

		// Pattern.mathes(regex, input) : inputÀÌ regex¿¡ ¸ÅÄ¡µÇ´Â ¹®ÀÚ¿­ÀÎÁö¸¦ °Ë»çÇÏ´Â ¸Ş¼­µå
		System.out.println(Pattern.matches("sleep", "sleep"));

		// [] : ÇØ´ç À§Ä¡ÀÇ ÇÑ ±ÛÀÚ¿¡ ¾î¶² ¹®ÀÚµéÀÌ ¿Ã ¼ö ÀÖ´ÂÁö Á¤ÀÇ ÇÏ´Â Ç¥Çö½Ä
		System.out.println(Pattern.matches("s[lh]leep", "sleep"));

		/*
		 * 
		 * []³»ºÎ¿¡ Á¤ÀÇÇÒ ¼ö ÀÖ´Â °Íµé
		 * 
		 * 1. abc : ÇØ´ç ÀÚ¸®¿¡ a ¶Ç´Â b µµ´Â c¸¦ Çã¿ë 2. ^abc: ÇØ´ç ÀÚ¸®¿¡ abc¸¦ Á¦¿ÜÇÑ ¸ğµç°ÍÀ» Çã¿ëÇÑ´Ù 3. a-z :
		 * aºÎÅÍ z ±îÁö ¸ğµÎ Çã¿ë 4. && : ±³ÁıÇÕ
		 */
		System.out.println(Pattern.matches("s[^lh@]leep", "s\\leep"));
		System.out.println(Pattern.matches("s[1-9]leep", "s0eep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sfeep"));
		Pattern intance = Pattern.compile("[0-9]@[0-9]");

		/*
		 * 
		 * 
		 * []¿ÜºÎ¿¡¼­ ¿©·¯ ¹®ÀÚ¸¦ ³ªÅ¸³»´Â °Íµé
		 * 
		 * 1 . : ¸ğµç ¹®ÀÚ 2 \d : ¸ğµç ¼ıÀÚ 3 \D : ¼ıÀÚ¸¦ Á¦¿ÜÇÑ ¸ğµç °Í 4. \s : ¸ğµç °ø¹éÀ» Çã¿ë (\t, \n, µîÀÇ ¸ğµç
		 * °ø¹é ) 5. \S: °ø¹éÀ» Á¦¿ÜÇÑ ¸ğµç °Í 6. \w : ÀÏ¹İÀûÀÎ ¹®ÀÚµéÀ» Çã¿ë [a-zA-Z0-9] 7 \W : ÀÏ¹İÀûÀÎ ¹®ÀÚµéÀ»
		 * Á¦¿ÜÇÑ ¸ğµç °ÍÀ» Çã¿ë
		 */
		System.out.println(Pattern.matches("s.leep", "s\\leep"));
		System.out.println(Pattern.matches("s\\dleep", "s9eep"));

		System.out.println(Pattern.matches("\\D\\D\\D", "cat"));

		System.out.println(Pattern.matches("s\\seep", "s eep"));

		/*
		 * ÇØ´ç ÆĞÅÏÀÌ Àû¿ëµÉ ¹®ÀÚÀÇ °³¼ö¸¦ Á¤ÀÇÇÏ´Â ¹æ¹ı
		 * 
		 * 1. [ex]{n} : {} ¾ÕÀÇ ÆĞÅÏÀÌ n°³ ÀÏÄ¡ÇØ¾ß ÇÑ´Ù 2 [ex] {n,m} : {} ¾ÕÀÇ ÆĞÅÏÀÌ ÃÖ¼­ n°³ ÀÌ»ó , ÃÖ´ë
		 * m°³(Æ÷ÇÔ) ÀÏÄ¡ÇØ¾ß ÇÑ´Ù {n, m}Ã³·³ °ø¹éÀ» ³ÖÀ¸¸é ¾ÈµÈ´Ù 3 [ex]{n,}: {} ¾ÕÀÇ ÆĞÅÏÀÌ ÃÖ¼Ò n°³ ÀÌ»ó ÀÏÄ¡ÇØ¾ß ÇÑ´Ù
		 * 4[ex]? : 0¹ø ¶Ç´Â ÇÑ¹ø 5[ex]+ : ÃÖ¼Ò ÇÑ¹ø ÀÌ»ó 6[ex]* : 0¹ø ¶Ç´Â ¿©·¯¹ø
		 */
		System.out.println(Pattern.matches("[\\D3-5]{5}", "345!!"));
		System.out.println(Pattern.matches("[°¡-ÆR{2,}\\.txt", "hi.txt"));

		System.out.println(Pattern.matches("[°¡-ÆR]?\\.txt", "ÇÑ±Û.txt"));

		// ¿¬½À ¹®Á¦: ÀÚ¹Ù¿¡¼­ Çã¿ëÇÏ´Â º¯¼ö¸íÀ» °Ë»çÇÒ ¼ö ÀÖ´Â Á¤±ÔÇ¥Çö½ÄÀ» ¸¸µé¾îº¸¼¼¿ä

		/*
		 * Pattern.complie(regex)
		 * 
		 * Àü´ŞÇÑ Á¤±ÔÇ¥Çö½ÄÀ» ÇØ¼®ÇÏ¿© Pattern ÀÎ½ºÅÏ½º¸¦ »ı¼ºÇÏ°í ¹İÈ¯ÇÑ´Ù
		 * 
		 * 
		 * split() : ÄÄÆÄÀÏµÈ ÆĞÅÏ ÀÎ½ºÅÏ½º·Î ¹®ÀÚ¿­ split()À» ÁøÇàÇÑ´Ù
		 * 
		 * matcher() : Matcher ÀÎ½ºÅÏ½º¸¦ »ı¼ºÇÏ¿© ¹İÈ¯ÇÑ´Ù
		 */

		String fruits_text = "apple/banana/orange/grape/pineapple/peach/redapple";

		Pattern regex = Pattern.compile("/");

		String[] fruits = regex.split(fruits_text);

		System.out.println(Arrays.toString(fruits));

		Pattern regex2 = Pattern.compile("apple");

		Matcher matcher = regex2.matcher(fruits_text);

		while (matcher.find()) {
			System.out.println("Ã£Àº °Í: " + matcher.group());
			System.out.println("À§Ä¡ : " + matcher.start() + "ºÎÅÍ" + matcher.end() + "±îÁö");

		}

	}
}
