package myobj.item;

public class Item {

	
		String name;
		int price;
		int qty;
		
		public Item(String name, int price) {
			this.name = name;
			this.price = price;
			
			
		}

		public void info() {
			System.out.printf("이름: ", name);
			System.out.printf("가격: " + price + "원");
			
			public void use() {
				System.out.printf("세부는 자식클래스에서 오버라이드로 구현");

		}
	}


