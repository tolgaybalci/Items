
public abstract class Weapon extends Item{
	
	private int damageAmount;
	
	public Weapon(int itemQuantity, double itemPrice, int itemWeight, int damageAmount) {
		super(itemQuantity, itemPrice, itemWeight);
		this.damageAmount = damageAmount;
	}

	public int getDamageAmount() {
		return damageAmount;
	}

	public void setDamageAmount(int damageAmount) {
		this.damageAmount = damageAmount;
	}
	
	

}
