import java.security.PublicKey;
import java.security.KeyStore.Entry;

public class HashMap {


	/*

	 keyd �� value �� �� ���� �̷�� �ڷᱸ��
	 key ���� ���� value�� ������ �� �ִ�
	 key �� �ߺ��� ������� �ʴ´�
	 key �� 

	 */
	public static void main(String[] args) {
		HashMap<Striong, Integer> recode new HashMap<>();

		record.put("ȫ�浿" , 50000);
		recode.put("��浿" , 35000);
		recode.put("�ڱ浿" , 90000);

		System.out.println(recode);


		//get(Key ) : key�� �̿��� value�� �ʳ�
		System.out.println(recode.get("�ڱ浿"));

		HashMap<String, Objext> person = new HashMap<>();

		person.put("�̸�","ȫ�浿" );
		person.put("����", 35);
		person.put("�����ϴ� ��" , new String[] {"���", "���ڱ�", "�Ա�"});

		System.out.println(person.get("����"));
		System.out.println((String[]) person.get("�����ϴ� ��"))[0]);

		// �ݺ������� Map�� Ȱ���ϱ�

		// KeySet() : Ű��θ� �̷���� Set�� ��ȯ�Ѵ� 
		// values() : value��θ� �̷���� set�� ��ȯ�Ѵ� 
		// enterySet() : Entry<key, value>�� �̷���� set�� ��ȯ�Ѵ�

		for (String key : person.keySet()){



			//A instanceof B: A�� B�� �ν��Ͻ������� �Ǻ��Ѵ�. ��ĳ���� ���¿����� �Ǻ��ȴ�  
			if(value instanceof String[]) {
				System.out.print("[");

				String [] arr (String[]) value;

				for(int i = 0; i < arr.length; ++i) {
					System.out.println(Arr[i] + ", ");
				}

				System.out.println("]");
			}else {
				System.out.println(key + ": " + value);
			}
		}
		System.out.println(key + ": " + person.get(key));

		for ( Entry<String, Object> entery : person.entrySet()) {
			String key = entry.getKey();
			Object value = entery.getValue();

			System.out.println(key + "=" + value);

		}
	}
}


















