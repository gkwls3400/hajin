import java.util.ArrayList;
import java.util.LinkedList;

public class D04_LinkedList {

	/*
	 * 
	 * 연결 리스트
	 * 
	 * ArrayList보다 삽입/삭제에 유리한 리스트 데이터 중간에 삽입이 발생했을 때 ArrayList는 모든 데이터를 뒤로 밀어야 한다
	 * 링크드 리스트는 연결된 노드만 변경하기 때문에 훨씬 빠르다 ArrayList는 데이터 보관 및 읽기에 유리하고 LinkedList는 데이터
	 * 추가 수정 및 삭제에 유리하다
	 * 
	 * 
	 */
	public static void main(String[] args) {
		LinkedList<String> animalsLinkedList = new LinkedList<>();

		// LinkedLis의 add들
		animalsLinkedList.add("tiger");
		animalsLinkedList.add("lion");
		animalsLinkedList.add("house");

		System.out.println(animalsLinkedList);

		animalsLinkedList.addFirst("turtle");
		animalsLinkedList.addLast("monkey");

		System.out.println(animalsLinkedList);

		// LinkedList의 get들
		System.out.println(animalsLinkedList.get(3));
		System.out.println(animalsLinkedList.getFirst());
		System.out.println(animalsLinkedList.getLast());

		// pop(), poll() : 리스트의 맨 앞 데이터를 읽고 버린다
		while (animalsLinkedList.size() != 0) {
			System.out.println(animalsLinkedList.poll());
		}

		System.out.println("After pop :" + animalsLinkedList);

		// pollList(): 리스트의 맨 뒤 데이터를 읽고 버린다
		ArrayList<String> cage = new ArrayList<>();
		cage.add("rabbit");
		cage.add("hamster");
		cage.add("bird");
		cage.add("fish");

		animalsLinkedList.addAll(cage);

		while (animalsLinkedList.size() != 0) {
			System.out.println("뒤에서부터 꺼내기" + animalsLinkedList.pollLast());
		}

		
		//성능 테스트 
		
		int testSize = 1000000;
		
		ArrayList<Integer> arr = new ArrayList<>(1000000);
		
		
		for(int i = 0; i < testSize; ++i) {
			arr.add(i);
		}
		
		LinkedList<Integer> linked = new LinkedList<>();
		
		for(int i = 0; i < testSize; ++i) {
			linked.add(i);
		}
		
		//중간에 데이터 추가 성능비교
		
		System.out.println("1, ArrayList Insertion Test");
		long startTime = System.currentTimeMillis();
		
		for ( int i = 0; i < 5000; ++i) {
			arr.add(50, 10);
		}
		long endTime = System.currentTimeMillis();
		System.out.println((endTime = startTime) + "ms");
		
		
		
		
	}
}





















