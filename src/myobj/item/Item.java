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
			System.out.printf("�̸�: ", name);
			System.out.printf("����: " + price + "��");
			
			public void use() {
				System.out.printf("���δ� �ڽ�Ŭ�������� �������̵�� ����");

		}
	}


