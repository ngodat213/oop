package BT5.hotel;

public class Room {
	protected String type;
	protected double price;
	// CONSTRUCTOR
	public Room(String type, double price) {
		this.type = type;
		this.price = price;
	}
	// SETTER & GETTER
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
