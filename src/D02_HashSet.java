import java.awt.List;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class D02_HashSet {

	

	/*
	  	Set 
	  	
	  	- ������ ������ ���� Ŭ����
	  	- ��ҷ� ���� ���� ������ ���� ������� �ʴ´�
	  	
	  	Hash
	  
	  	- � ���� �־��� �� ���� ������ �� ���� ���� �����Ǿ�� �ϴ� �˰��� 
	  	- ���� ���� �־��� ���� �׻� ������ ���� ���;� �Ѵ�
	  	- ������ ���� �־��� �� �����ϱ� ���� ���� �˼����� �ٸ� ���� ���´�
	  	- �༺�� �ؽ������� ���� ���� ã�� ���� �Ұ����ؾ� �Ѵ�
	  	- �ٽ� ���� ������ ���ư� ���� ���� �ܹ��⼺ �˰���
	  	- �ߺ� üũ�ÿ� �پ ������ ���δ�
	  	-
	  	
	  	* �ؽ��� ����ϴ� �˰����� ����(�ε���)�� ����
	  	MD5 ����
	  	hello -> 5D41402ABC4B2A76B9719D911017C592
	  	hello1 -> 203AD5FFA1D7C650AD681FDFF3965CD2
	 
	 
	 SHA2565 (����)
	  hello -> 2fefdf776876786875768ds9f7sd98f79dsffel.....
	  
	  
	 */
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();

		numbers.add(100);
		numbers.add(100);
		numbers.add(100);
		numbers.add(100);
		numbers.add(100);

		
		System.out.println(numbers);
		
		//���� �÷��� �������̽��̱� ������  ������ ArrayList�� �ִ� �޼������ ���⿡�� �ִ�
		if ( numbers.remove(100)) {
			System.out.println("����� ����");
		} else {
			System.out.println("����� ����");
		}
		System.out.println(numbers);
		
		//�̸��� �ؽ��� �� �˰������ ������ ���� 
		HashSet<String> englisHashSet = new HashSet<>();
		
		englisHashSet.add("apple");
		englisHashSet.add("airplane");
		englisHashSet.add("bio");
		
		System.out.println(englisHashSet);
		 
		
		//set�� �ε����� ���� ������ for-each�� ����Ҽ� �ִ� 
		for (String word : englisHashSet) {
			System.out.println(word);
			
		}
		//�÷��ǳ����� ��ȯ�� �����Ӵ�
		//set�� ������ �����ؾ� �Ѵٸ� list�� ��ȯ�Ͽ� ����� �� �ִ�
		//list�� ����� �ߺ��� ������ ����� �ʿ��ϴٸ� set���� ��ȯ�Ͽ� ����� �� �ִ�
		
		//�÷��� ������ ��ȯ�� �����Ӵ� 
		ArrayList<String> englis_list = new  ArrayList<>(englisHashSet);
		Collections.sort(englis_list);
		System.out.println(englis_list);
		
		
		//�÷��ǵ��� �迭�� ��ȯ�ϱ�
		Object[] arr1 = englisHashSet.toArray();//1�� ���, object[]�� ����
		
		Integer[] arr2 = new Integer[englisHashSet.size()];//2�� ��� �̸� ������ �迭�� ����
		englisHashSet.toArray(arr2);
		
		System.out.println("Object[]�� ��ȯ�� english: " +  Arrays.toString(arr1));
		System.out.println("�迭�� ��ȯ�� english: " + Arrays.toString(arr2));
		
		
		
		
		
		
		
		
		// �÷��ǿ� ���׸��� ������� �ʴ� ��� ��� Ÿ���� ���� �� �ִ�
		//��� Ÿ���� object Ÿ������ ��ĳ���õǾ� ����ȴ�
		//�ش� ���� �ٽ� ����ϱ� ���ؼ��� �ٿ�ĳ������ �ʿ��ؼ� ���ŷӴ� 
		ArrayList<Integer> numbers2 = new ArrayList<>();
		
		numbers2.add(1);
		numbers2.add(1);
		numbers2.add(1);
		numbers2.add(1);
		numbers2.add(1);
		
		System.out.println(numbers2);
		System.out.println(new HashSet<>(numbers2));
		
		
	//	numbers3.add("ȫ�浿");
		
	//	String string = (String) numbers3.get(3); ����
		
		
	
		//  contains() : �÷��ǿ� �ش� ��Ұ� ���ԵǾ� �ִ��� ���θ� ��ȯ
		System.out.println(englisHashSet.contains("apple"));
		System.out.println(englisHashSet.contains("banana"));
		
		System.out.println(englis_list.contains("apple"));
		
		// containsAll(Collection) : ������ �÷����� ��� ���ԵǾ� �ִ����� �˻�
		
		Set<String> subset = new HashSet<>();
		List<String> sublist = new ArrayList<>(); 
		
		
		
		subset.add("zebra");
		subset.add("drama");
		
		sublist.add("apple");
		sublist.add("apple");
		sublist.add("apple");
		
		System.out.println("english���� subset�� ������ ��� ����ֳ���? "+
				englisHashSet.containsAll(subset));
		System.out.println("english���� sublist�� ��� ������ ����ֳ���? "+
				englisHashSet.containsAll(sublist));
		

		//addAll(Collection) : ������ �÷����� ������ ��� �߰�( �߰� ���� ���θ� ��ȯ)
		// �߰� ���� ���θ� ��ȯ	 true
		// �̹� ��� ���Ե� ��쿡�� false �� ��ȯ�Ѵ�
		System.out.println(englisHashSet.addAll(subset));
		System.out.println(englisHashSet.addAll(subset));
		
		
		//removeAll(Collection) : ������ �÷��ǰ� ���� ������ ��� ����
		System.out.println(englisHashSet.remove(subset));
		
		// retainAll (Collection) :  ������ �÷��ǰ� ��ġ�� ���븸 �����
		// ���Ѱ��� �ִٸ� true ������ false 
		englisHashSet.retainAll(subset);
		System.out.println(englisHashSet);
		
		// isEmpty() : �ش� �÷����� ��������� true
		System.out.println(!englisHashSet.isEmpty());
		
		Set<String> subset2 = subset;
		
		
	}

}











