import C06_Polymorphism.PorkCutlet.MainMaterial;

public class C06_Polymorphism {

	public static void main(String[] args) {
		// 객체의 다형성
		//객체는 다향한 형태를 지닐 수 있다
		//사과는 사과이기도 하고 과일이기도 하다
		//과일은 과일이지만 사과는 아니다
	new Food(new PigMeat(), new vege(), new Balsamic());
	
	MainMaterial main_mat2 = new Meat();
	
	public static void doSomethisgWithMainMaterial(MainMaterial mat) {
		
	}
	
	}

	class Food{
		MainMaterial mainMat;
		SubMaterial subMat;
		Sauce sauce;
		
		
		public Food(MainMaterial mainMat, SubMaterial subMat, Sauce sauce) {
			this.mainMat = mainMat;
			this.subMat = subMat;
			this.sauce = sauce;
			
		}
	}
	class PorkCutlet {
		public PorkCutlet(PigMeat pig, SubMaterial subMat, Sauce sauce) {
			
		}
	}

class MainMaterial {}
class SubMaterial {}
class Sauce {}

class Fish extends MainMaterial {}
class Meat extends MainMaterial {}
class PigMeat extends Meat {}

class vege extends SubMaterial {}
class Fruit extends SubMaterial {}

class Salsa extends Sauce {}
class Balsamic extends Sauce{}
