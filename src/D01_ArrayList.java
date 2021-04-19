import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class D01_ArrayList {
	
	private static ArrayList<String> numbers;

	// JAVA Collections
	
	// 자바에서 기본적으로 제공하는 자료구조 인터페이스
	// Collection 인터페이스를 상속받은 인터페이스로는 List, set이 있다
	
	//java.util.ArrayList
	//배열과 다르게 크기가 자동으로 조절되는 자료구조 클래스
	//배열과 유사한 형태이다
	//순차적으로 데이터에 접근할 때 가장 유리하다
	
	
	public static void main(String[] args) {
		
		//타입을 지정하며 ArrayList 생성하기
		// 타입을 지정할 때 사용하는<>를 제네릭이라고 부른다 
		ArrayList<String> fruits = new ArrayList<>();
		
		//제네릭에는 기본형 타입을 사용할 수 없다
		ArrayList<Integer> LineNumberInputStream = new ArrayList<>();
		
		
		//add(item) : 리스트에 원하는 데이터를 순차적으로 맨 뒤에 추가한다 
		fruits.add("Apple");
		fruits.add("Apple");
		fruits.add("Apple");
		fruits.add("kiwi");
		fruits.add("kiwi");
		
		
//		numbers.add(10);
//		numbers.add(20);
//		numbers.add(30);
//		numbers.add(40);
//		numbers.add(50);
		
		// add(index, item): 리스트의 원하는 위치에 데이터를 넣는다 
		fruits.add(2, "orange");
		fruits.add(2, "peach");
		fruits.add(2, "grape");
		System.out.println(fruits);
		
		//get(index) : 리스트에서 원하는 인덱스의 데이터를 하나 꺼낸다 
		System.out.println(fruits.get(0));
		System.out.println(fruits.get(1));
		System.out.println(fruits.get(2));
		System.out.println(fruits.get(3));

		//size() 해당 컬렉션의 크기를 반환한다
		System.out.println(fruits.size());
		System.out.println(numbers.size());
		
		//remove(index): 해당 번ㅇ째의 데이터를 삭제한다. 방금 지운 데이터를 반환한다
		String deleted_fruits =fruits.remove(0);
		
		System.out.println("삭제 후 " + fruits);
		System.out.println("삭제된 것:" +deleted_fruits);
		
		//remove(item: 해당 데이터를 삭제한다// 삭제 성공 여부를 반환한다
		if(fruits.remove("strawberry")) {
			System.out.println("제거완료");
			
		}else {
			System.out.println("없어서 제거 불가");
		}
		//컬렉션 정렬 (오름차순)
		Collections.sort(fruits);
		System.out.println(fruits);
		
		//배열 정렬 (오름차순)
		int[] lottos = { 45, 1, 7, 2,6,23};
		Arrays.sort(lottos);
		System.out.println(Arrays.toString(lottos));
		
	}
}
