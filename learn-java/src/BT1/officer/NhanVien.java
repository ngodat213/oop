package BT1.officer;

public class NhanVien extends CanBo{
	private String task;
	// CONSTRUCTOR
	public NhanVien(String name, int age, String gender, String address, String task) {
		super(name, age, gender, address);
		this.task = task;
	}
	// SETTER & GETTER
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	
	@Override
	public String toString() {
		return "Worker{" +
				"task= '" + task + '\'' +
				", name= '" + name + '\''+
				", age= '" + age + '\'' +
				", gender= '" + gender + '\'' +
				", address= '" + address + '\'' +
				"}";
	}
}
