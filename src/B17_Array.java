
public class B17_Array {

	public static void main(String[] args) {
		
		//�迭(array 
		//���� Ÿ�� ������ �ѹ��� ������ �����ϴ� ���
		//���� �̸����� ������ ������ ������ �� �ε����� Ȱ���� �����Ѵ�
		//�迭�� �ѹ� ������ ũ�Ⱑ �������� ũ�⸦ �����Ҽ�����
		//�迭�� ������ ���ÿ� �ʱ�ȭ�� �Ǿ��ִ�
		//���� 0 �Ǽ� 0.0 boolean: false, ������ null
		int[] score = new int[133];
		
		//�迭�� �迭.length�� ���ؼ� ���̸� �˼� �ִ�
		int sum =0;
		double average = 0d;
		for (int index = 0; index < score.length; ++index) {
			score[index] = (int)(Math.random() * 101);
		}
		System.out.println("10���� �л�"+ score[9]);
		
		//���� ����1 : score�� ���հ� ����� ����غ�����
		for (int index = 0; index < score.length; ++index) {
			score[index] = (int)(Math.random() * 133);
			  sum += score[index];
		}
		average = sum /(double)(score.length);
		System.out.println((double)Math.round(average*1000)/1000.0);
		System.out.println(sum);
		
		//�迭�� �����ϴ� ���
		
		//1 Ÿ��[] �迭�̸� = new Ÿ��[�迭ũ��];
		//2 Ÿ�� [] �迭�̸� = {��1 , , , , ,}
		//3 Ÿ�� [] qodufdlfma =new Ÿ��[] {��1,,,,,,,};
		
		char[] grades = new char[50];
		int[] age = { 10, 15, 20, };
		boolean[] passExam = { true, false, true, true, false };
		
		String[] animals = new String [] { "lion", "tiger", "penguin", "monkey"};
		
		System.out.println(animals[0]);
		System.out.println(animals[3]);
		
		if (passExam[3]) {
			System.out.println("4���� ����� ���迡 ����߽��ϴ�");
		}
		for (int i = 0; i <grades.length; ++i) {
			System.out.println((int)grades[i]);
		}
		//�迭�� ������ �ٸ��� �ʱ�ȭ�� �ڵ����� �Ǿ��ִ�
		int[] arr = new int[3];
		
		int a, b, c;
		
		System.out.println(arr[0]);
		
		//String �� Char�� �迭�� ��ȯ�� �� �ִ�
		char[] msg1 = new char[] {'h','e','l','l','o'};
		String msg2 = "hello";
		char[] msg3 = msg2.toCharArray();
		
		System.out.println(msg1[0]);
		System.out.println(msg1[1]);
		System.out.println(msg1[2]);
		
		System.out.println(msg2.charAt(0));
		System.out.println(msg2.charAt(1));
		System.out.println(msg2.charAt(2));
		
		System.out.println(msg3[0]);
		System.out.println(msg3[1]);
	}

}







