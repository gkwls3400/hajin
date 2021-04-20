import java.util.ArrayList;
import java.util.LinkedList;

public class D04_LinkedList {

	/*
	 * 
	 * ���� ����Ʈ
	 * 
	 * ArrayList���� ����/������ ������ ����Ʈ ������ �߰��� ������ �߻����� �� ArrayList�� ��� �����͸� �ڷ� �о�� �Ѵ�
	 * ��ũ�� ����Ʈ�� ����� ��常 �����ϱ� ������ �ξ� ������ ArrayList�� ������ ���� �� �б⿡ �����ϰ� LinkedList�� ������
	 * �߰� ���� �� ������ �����ϴ�
	 * 
	 * 
	 */
	public static void main(String[] args) {
		LinkedList<String> animalsLinkedList = new LinkedList<>();

		// LinkedLis�� add��
		animalsLinkedList.add("tiger");
		animalsLinkedList.add("lion");
		animalsLinkedList.add("house");

		System.out.println(animalsLinkedList);

		animalsLinkedList.addFirst("turtle");
		animalsLinkedList.addLast("monkey");

		System.out.println(animalsLinkedList);

		// LinkedList�� get��
		System.out.println(animalsLinkedList.get(3));
		System.out.println(animalsLinkedList.getFirst());
		System.out.println(animalsLinkedList.getLast());

		// pop(), poll() : ����Ʈ�� �� �� �����͸� �а� ������
		while (animalsLinkedList.size() != 0) {
			System.out.println(animalsLinkedList.poll());
		}

		System.out.println("After pop :" + animalsLinkedList);

		// pollList(): ����Ʈ�� �� �� �����͸� �а� ������
		ArrayList<String> cage = new ArrayList<>();
		cage.add("rabbit");
		cage.add("hamster");
		cage.add("bird");
		cage.add("fish");

		animalsLinkedList.addAll(cage);

		while (animalsLinkedList.size() != 0) {
			System.out.println("�ڿ������� ������" + animalsLinkedList.pollLast());
		}

		
		//���� �׽�Ʈ 
		
		int testSize = 1000000;
		
		ArrayList<Integer> arr = new ArrayList<>(1000000);
		
		
		for(int i = 0; i < testSize; ++i) {
			arr.add(i);
		}
		
		LinkedList<Integer> linked = new LinkedList<>();
		
		for(int i = 0; i < testSize; ++i) {
			linked.add(i);
		}
		
		//�߰��� ������ �߰� ���ɺ�
		
		System.out.println("1, ArrayList Insertion Test");
		long startTime = System.currentTimeMillis();
		
		for ( int i = 0; i < 5000; ++i) {
			arr.add(50, 10);
		}
		long endTime = System.currentTimeMillis();
		System.out.println((endTime = startTime) + "ms");
		
		
		
		
	}
}





















