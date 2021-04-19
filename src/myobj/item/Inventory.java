package myobj.item;

public class Inventory {

	Item[] inventory;
	int size;
	
	public Inventory (int size) {
		inventory = new Item[size];
	}
	
	public boolean put(Item item) {
		for (int i = 0; i < inventory.length; ++i) {
			if (inventory[i] == null) {
				inventory[i] = item;
				return true;
			}
		}
		System.out.println("가방이 꽉 찼습니다.");
		return false;
	}
	
	public static void main(String[] args) {
		Inventory inven1 = new Inventory(3);
		
		inven1.put(new Candy("리콜라", 3000));
		
	}
}
