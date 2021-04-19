import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class D01_ArrayList {
	
	private static ArrayList<String> numbers;

	// JAVA Collections
	
	// �ڹٿ��� �⺻������ �����ϴ� �ڷᱸ�� �������̽�
	// Collection �������̽��� ��ӹ��� �������̽��δ� List, set�� �ִ�
	
	//java.util.ArrayList
	//�迭�� �ٸ��� ũ�Ⱑ �ڵ����� �����Ǵ� �ڷᱸ�� Ŭ����
	//�迭�� ������ �����̴�
	//���������� �����Ϳ� ������ �� ���� �����ϴ�
	
	
	public static void main(String[] args) {
		
		//Ÿ���� �����ϸ� ArrayList �����ϱ�
		// Ÿ���� ������ �� ����ϴ�<>�� ���׸��̶�� �θ��� 
		ArrayList<String> fruits = new ArrayList<>();
		
		//���׸����� �⺻�� Ÿ���� ����� �� ����
		ArrayList<Integer> LineNumberInputStream = new ArrayList<>();
		
		
		//add(item) : ����Ʈ�� ���ϴ� �����͸� ���������� �� �ڿ� �߰��Ѵ� 
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
		
		// add(index, item): ����Ʈ�� ���ϴ� ��ġ�� �����͸� �ִ´� 
		fruits.add(2, "orange");
		fruits.add(2, "peach");
		fruits.add(2, "grape");
		System.out.println(fruits);
		
		//get(index) : ����Ʈ���� ���ϴ� �ε����� �����͸� �ϳ� ������ 
		System.out.println(fruits.get(0));
		System.out.println(fruits.get(1));
		System.out.println(fruits.get(2));
		System.out.println(fruits.get(3));

		//size() �ش� �÷����� ũ�⸦ ��ȯ�Ѵ�
		System.out.println(fruits.size());
		System.out.println(numbers.size());
		
		//remove(index): �ش� ����°�� �����͸� �����Ѵ�. ��� ���� �����͸� ��ȯ�Ѵ�
		String deleted_fruits =fruits.remove(0);
		
		System.out.println("���� �� " + fruits);
		System.out.println("������ ��:" +deleted_fruits);
		
		//remove(item: �ش� �����͸� �����Ѵ�// ���� ���� ���θ� ��ȯ�Ѵ�
		if(fruits.remove("strawberry")) {
			System.out.println("���ſϷ�");
			
		}else {
			System.out.println("��� ���� �Ұ�");
		}
		//�÷��� ���� (��������)
		Collections.sort(fruits);
		System.out.println(fruits);
		
		//�迭 ���� (��������)
		int[] lottos = { 45, 1, 7, 2,6,23};
		Arrays.sort(lottos);
		System.out.println(Arrays.toString(lottos));
		
	}
}
