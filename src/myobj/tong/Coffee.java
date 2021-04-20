package myobj.tong;

public class Coffee {
	
	String[] origin_names = {"1","2"};
	String name;
	int price;
	int coffeine;
	int origin;
	
	public Coffee(String name, int price, int coffeein, int origin) {
		this.name = name;
		this.price = price;
		this.coffeine = coffeine;
		this.origin = origin;
	}
	
	public static void main(String[] args) {
		Coffee coffee = new Coffee("아메리카노" ,1500, 10, 0);
		
		coffee.origin_names = new String [] { "1","2"};
	}
}
