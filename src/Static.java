
public class Static {

	public static void main(String[] args) {
		// staatic
		Lamp[] lamps = new Lamp[12];
		
		System.out.println(Lamp.width);
		System.out.println(Lamp.height);
		
		Lamp lamp01 = new Lamp()
		Lamp lamp02 = new Lamp()
		Lamp lamp03 = new Lamp()
		Lamp lamp04 = new Lamp()
	}
	

}


class Lamp {
	static int width = 50;
	static int height = 200;
	
	int[] position;
	double brightness;
	boolean powerOn;
	
	public static void changeWith(int width) {
		Lamp.width = width;
	}
//	static void tornOn(){
//		this.powerOn = true;
//	}
}

//myobj ��Ű���� static ������ ������ Ŭ������ �ϳ� ���� �غ����� 
//


class Soccer 
 static int goal =1;
 