
public class Bow extends Weapon implements Upgradable{

	private int numArrows;
	
	public Bow(int itemQuantity, double itemPrice, int itemWeight, int damageAmount, int numArrows) {
		super(itemQuantity, itemPrice, itemWeight, damageAmount);
		this.numArrows = numArrows;
	}	

	public int getNumArrows() {
		return numArrows;
	}

	public void setNumArrows(int numArrows) {
		this.numArrows = numArrows;
	}

	public void upgrade() {
		
		numArrows += 10;
	}
	
	public void useItem() {
		
		numArrows -=1;
	}
}
