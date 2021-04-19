import java.security.PublicKey;
import java.security.KeyStore.Entry;

public class HashMap {


	/*

	 keyd 와 value 가 한 쌍을 이루는 자료구조
	 key 값을 통해 value에 접근할 수 있다
	 key 는 중복을 허용하지 않는다
	 key 에 

	 */
	public static void main(String[] args) {
		HashMap<Striong, Integer> recode new HashMap<>();

		record.put("홍길동" , 50000);
		recode.put("고길동" , 35000);
		recode.put("박길동" , 90000);

		System.out.println(recode);


		//get(Key ) : key를 이용해 value를 너냄
		System.out.println(recode.get("박길동"));

		HashMap<String, Objext> person = new HashMap<>();

		person.put("이름","홍길동" );
		person.put("나이", 35);
		person.put("좋아하는 것" , new String[] {"놀기", "잠자기", "먹기"});

		System.out.println(person.get("나이"));
		System.out.println((String[]) person.get("좋아하는 것"))[0]);

		// 반복문으로 Map을 활용하기

		// KeySet() : 키들로만 이루어진 Set을 반환한다 
		// values() : value들로만 이루어진 set을 반환한다 
		// enterySet() : Entry<key, value>로 이루어진 set을 반환한다

		for (String key : person.keySet()){



			//A instanceof B: A가 B의 인스턴스인지를 판별한다. 업캐스팅 상태에서도 판별된다  
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


















