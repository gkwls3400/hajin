
public class D03_WrapperClass {

	/*
	 * 
	 * 
	 * Wrapper Class
	 * 
	 * 기본형 타입을 참조형 타입으로 사용하기 위한 클래스 각 타입들에 대한 유용한 기능들이 모여있다
	 * 
	 * 
	 * 기본형 이름
	 * 
	 * byte, short, char, int , long, float, double booean
	 * 
	 * 참조형 이름
	 * 
	 * Byte, Short, Character, Integer< Long, Float< Double Boolean
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {

		Integer i = Integer.valueOf(10);
		int a = 10;

		// parse 시리즈
		// 문자열을 원하는 타입으로 변환시키는 기능
		// 각 타입에 스태틱 메서드로 존재한다
		// 데이터를 주고 받을때는 잠시 문자열로 변환하여 전송되는 경우가 많다
		// 다시 사용하기 위해서는 받는 데이터를 원래의 타입으로 되돌려야 한다
		// radix가 적혀있는 오버로딩은 진법을 의미한다

		try {
			int a1 = Integer.parseInt("01234ABC", 16);
			System.out.println(a1);
		} catch (NumberFormatException e) {
			System.out.println("int로 변환 불가");
		}
		
		System.out.printf("%.9f",Double.parseDouble("123.123456789"));
		System.out.println(Boolean.parseBoolean("tRuE"));
		System.out.println(Boolean.parseBoolean("yes"));
		
		
		/*
		   toString()
		   
		   해당 타입의 값을 손쉽게 문자열로 변환할 수 있다
		   toString()은 Object의 메서드이기 때문에 모든 클래스에 존재한다
		   인스턴스 메서드 toString()은 해당 인스턴스를 문자열로 변환한다
		   스태틱 메서드 toString()은 전달한 값을 문자열로 변환한다
		   
		 
		 */
		
		System.out.println(Integer.toString(12345, 2));
		System.out.println(Integer.toString(12345, 8));
		System.out.println(Integer.toString(123456));
		System.out.println(Integer.toString(123456, 16));
		
		/*
		 	typeValue() 시리즈 
		 	
		 	해당 인스턴스 값을 원하는 타입의 값으로 손쉽게 변경하는 메서드 
		 */
		Integer num = 1000003;
		
		System.out.println(num.byteValue());
		System.out.println(num.shortValue());
		System.out.println(num.longValue());
		System.out.println(num.floatValue());
		System.out.println(num.doubleValue());
		
		Boolean.
		
	}

}
