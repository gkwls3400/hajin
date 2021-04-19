
public class B06_If {

	public static void main(String[] args) {
		//if ¹® 
		//()¾ÈÀÇ °ªÀÌ Æ®·ç ÀÏ¶§ {} ¾ÈÀÇ ³»¿ëÀ» ½ÇÇàÇÑ´Ù
		//()¾ÈÀÇ °ªÀÌ falseÀÏ ¶§ {} ³»¿ë ¹«½Ã 
		//{} ¾È¿¡ µé¾î°¥ ³»¿ëÀÌ ÇÑÁÙÀÌ¶ó¸é {} »ý·« °¡´É
		
	//else if¹®
		//À§¿¡ ÀÖ´Â if¹®ÀÌ ½ÇÇàµÇÁö ¾Ê¾Æ´Ù¸é if¹®Ã³·³ ÀÛµ¿ÇÑ´Ù
		//else if´Â ´Üµ¶À¸·Î »ç¿ëÇÒ ¼ö ¾ø´Ù
		//else if´Â ¿©·¯°³ »ç¿ëÇÒ ¼ö ÀÖ´Ù 
		
		// else¹®
		// À§¿¡ ÀÖ´Â if, else if°¡ ¸ðµÎ ½ÇÇàµÇÁö ¾Ê¾Ò´Ù¸é {}¾ÈÀÇ ³»¿ëÀ» ¹«Á¶°Ç ½ÇÇàÇÑ´Ù
		// if ¹Ù·Î ´ÙÀ½¿¡ ¾µ ¼öµµ ÀÖ´Ù
		// else°¡ ºÙ¾îÀÖ´Â Á¶°ÇÀýÀº ÃÖ¼Ò ÇÑ¹øÀº ½ÇÇàµÈ´Ù 
		int a = -8;
		
		
		if (a == 5) {
			System.out.println("Hello");
		} else if (a == 6) {
			System.out.println("Nice to meet you");
		} else if( a> -10) {
			System.out.println("Greeting!");
		} else if(a > -20) {
			System.out.println("Good to see you");
		}
		System.out.println("ÇÁ·Î±×·¥ÀÌ ³¡³µ½À´Ï´Ù");
	
		char ch = '°¡';
		
		if (ch >= '°¡' && ch <= 'ÆR') {
			System.out.println("ch ÇÑ±Û");
		} else if(ch >= 0x3040 && ch <= 0x30FF) {
		System.out.println();
		} else {
			System.out.println("½Ã½ºÅÛ Á¾·á");
		}
		
	}
}
