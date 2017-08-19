
public abstract class Item {

	private int itemQuantity;
	private double itemPrice;
	private int itemWeight;

	public Item(int itemQuantity, double itemPrice, int itemWeight) {
		
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
		this.itemWeight = itemWeight;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemWeight() {
		return itemWeight;
	}

	public void setItemWeight(int itemWeight) {
		this.itemWeight = itemWeight;
	}

	public void useItem(){
		
		System.out.println("Silah kullanılmıştır.");
	}
}
