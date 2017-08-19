
public class ItemApplication {

	public static void main(String[] args) {
		
		Sword s = new Sword(100, 150, 25, 100);
		Bow b = new Bow(100, 175, 30, 60, 80);
		Armor a = new Armor(1000, 150, 25, 75, true);
				
		a.getHit(150);
		b.useItem();
		b.upgrade();
		
		a.upgrade();
		a.getHit(b.getDamageAmount());
	}
}
