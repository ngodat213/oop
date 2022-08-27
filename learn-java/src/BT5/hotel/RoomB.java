package BT5.hotel;

public class RoomB extends Room{
	public RoomB() {
		super("B", 300);
	}
	
	@Override
	public String toString() {
		return "B{" +
				"type= " + type + '\'' +
				"price= " + price + '\'' +
				'}';
	}
}
