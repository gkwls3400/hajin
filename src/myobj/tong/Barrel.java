package myobj.tong;

public class Barrel {

	boolean[] forked;
	int size;
	int fireBtn;
	
	boolean fired;
	
	
	public Barrel(int size) {
		this.size = size;
		this.forked = new boolean[size];
		this.fireBtn = (int)(Math.random() * size);
		this.fired = false;
	}
	
	public boolean fork(int slot) {
		if (forked[slot]) {
			System.out.println("ÀÌ¹Ì Âî¸§");
			return false;
		}
		
		if (slot == fireBtn) {
			forked[slot] = true;
		}
			
			forked[slot] = true;
			return true;
			
		
	}
}
	

