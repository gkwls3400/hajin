import C06_Polymorphism.PorkCutlet.MainMaterial;

public class C06_Polymorphism {

	public static void main(String[] args) {
		// ��ü�� ������
		//��ü�� ������ ���¸� ���� �� �ִ�
		//����� ����̱⵵ �ϰ� �����̱⵵ �ϴ�
		//������ ���������� ����� �ƴϴ�
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
