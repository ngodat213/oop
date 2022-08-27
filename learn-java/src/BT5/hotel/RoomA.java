package BT5.hotel;

public class RoomA extends Room{
	public RoomA() {
		super("A", 500);
	}
	
	@Override
	public String toString() {
		return "A{" +
				"type= " + type + '\'' +
				"price= " + price + '\'' +
				'}';
	}
}
