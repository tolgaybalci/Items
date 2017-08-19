
public class Armor extends Item implements Upgradable{

	private int defensePoints;
	boolean isWorn = true;

	public Armor(int itemQuantity, double itemPrice, int itemWeight, int defensePoints, boolean isWorn) {
		super(itemQuantity, itemPrice, itemWeight);
		this.defensePoints = defensePoints;
		this.isWorn = isWorn;
	}
	
	public void getHit(int damagePoints) {
		
		if(isWorn) {
			if(damagePoints > defensePoints) {
				defensePoints = 0;
				isWorn = false;
			}
			else {
				defensePoints -= damagePoints;
			}
		}
		
	}
	
	public void upgrade(){
		
		defensePoints += 100;
	}
}
