import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_regex {

	/*
	 * ���� ǥ���� (Regular Expression)
	 * 
	 * ���ڿ��� ������ ǥ���ϴ� ǥ���� �� ���ӵ��� �ʴ´� ���α׷��Ӱ� ���ϴ� ���ڿ� ���ϰ� ��ġ�ϴ��� �˻��Ҷ� ����Ѵ�
	 * 
	 * Pattern Ŭ����
	 * 
	 * ���� ǥ������ �ٷ�� Ŭ����
	 * 
	 * Matcher Ŭ����
	 * 
	 * ���� �ν��Ͻ��� �̿��Ͽ� ���ڿ��� �˻��� �� ����ϴ� Ŭ����
	 * 
	 */
	public static void main(String[] args) {

		// Pattern.mathes(regex, input) : input�� regex�� ��ġ�Ǵ� ���ڿ������� �˻��ϴ� �޼���
		System.out.println(Pattern.matches("sleep", "sleep"));

		// [] : �ش� ��ġ�� �� ���ڿ� � ���ڵ��� �� �� �ִ��� ���� �ϴ� ǥ����
		System.out.println(Pattern.matches("s[lh]leep", "sleep"));

		/*
		 * 
		 * []���ο� ������ �� �ִ� �͵�
		 * 
		 * 1. abc : �ش� �ڸ��� a �Ǵ� b ���� c�� ��� 2. ^abc: �ش� �ڸ��� abc�� ������ ������ ����Ѵ� 3. a-z :
		 * a���� z ���� ��� ��� 4. && : ������
		 */
		System.out.println(Pattern.matches("s[^lh@]leep", "s\\leep"));
		System.out.println(Pattern.matches("s[1-9]leep", "s0eep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sfeep"));
		Pattern intance = Pattern.compile("[0-9]@[0-9]");

		/*
		 * 
		 * 
		 * []�ܺο��� ���� ���ڸ� ��Ÿ���� �͵�
		 * 
		 * 1 . : ��� ���� 2 \d : ��� ���� 3 \D : ���ڸ� ������ ��� �� 4. \s : ��� ������ ��� (\t, \n, ���� ���
		 * ���� ) 5. \S: ������ ������ ��� �� 6. \w : �Ϲ����� ���ڵ��� ��� [a-zA-Z0-9] 7 \W : �Ϲ����� ���ڵ���
		 * ������ ��� ���� ���
		 */
		System.out.println(Pattern.matches("s.leep", "s\\leep"));
		System.out.println(Pattern.matches("s\\dleep", "s9eep"));

		System.out.println(Pattern.matches("\\D\\D\\D", "cat"));

		System.out.println(Pattern.matches("s\\seep", "s eep"));

		/*
		 * �ش� ������ ����� ������ ������ �����ϴ� ���
		 * 
		 * 1. [ex]{n} : {} ���� ������ n�� ��ġ�ؾ� �Ѵ� 2 [ex] {n,m} : {} ���� ������ �ּ� n�� �̻� , �ִ�
		 * m��(����) ��ġ�ؾ� �Ѵ� {n, m}ó�� ������ ������ �ȵȴ� 3 [ex]{n,}: {} ���� ������ �ּ� n�� �̻� ��ġ�ؾ� �Ѵ�
		 * 4[ex]? : 0�� �Ǵ� �ѹ� 5[ex]+ : �ּ� �ѹ� �̻� 6[ex]* : 0�� �Ǵ� ������
		 */
		System.out.println(Pattern.matches("[\\D3-5]{5}", "345!!"));
		System.out.println(Pattern.matches("[��-�R{2,}\\.txt", "hi.txt"));

		System.out.println(Pattern.matches("[��-�R]?\\.txt", "�ѱ�.txt"));

		// ���� ����: �ڹٿ��� ����ϴ� �������� �˻��� �� �ִ� ����ǥ������ ��������

		/*
		 * Pattern.complie(regex)
		 * 
		 * ������ ����ǥ������ �ؼ��Ͽ� Pattern �ν��Ͻ��� �����ϰ� ��ȯ�Ѵ�
		 * 
		 * 
		 * split() : �����ϵ� ���� �ν��Ͻ��� ���ڿ� split()�� �����Ѵ�
		 * 
		 * matcher() : Matcher �ν��Ͻ��� �����Ͽ� ��ȯ�Ѵ�
		 */

		String fruits_text = "apple/banana/orange/grape/pineapple/peach/redapple";

		Pattern regex = Pattern.compile("/");

		String[] fruits = regex.split(fruits_text);

		System.out.println(Arrays.toString(fruits));

		Pattern regex2 = Pattern.compile("apple");

		Matcher matcher = regex2.matcher(fruits_text);

		while (matcher.find()) {
			System.out.println("ã�� ��: " + matcher.group());
			System.out.println("��ġ : " + matcher.start() + "����" + matcher.end() + "����");

		}

	}
}
