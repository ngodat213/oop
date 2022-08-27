package BT1.officer;

public class CongNhan extends CanBo{
	private int level;
	// CONSTRUCTOR
	public CongNhan(String name, int age, String gender, String address, int level) {
		super(name, age, gender, address);
		this.level = level;
	}
	// SETTER & GETTER
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Staff{" +
				"task= '" + level + '\'' +
				", name= '" + name + '\''+
				", age= '" + age + '\'' +
				", gender= '" + gender + '\'' +
				", address= '" + address + '\'' +
				"}";
	}
}	
