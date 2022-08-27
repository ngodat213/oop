package BT1.officer;

public class KySu extends CanBo {
	private String branch;
	// CONSTRUCTOR
	public KySu(String name, int age, String gender, String address, String branch) {
		super(name, age, gender, address);
		this.branch = branch;
	}
	// SETTER & GETTER
	public String getTask() {
		return branch;
	}
	public void setTask(String task) {
		this.branch = task;
	}
	
	@Override
	public String toString() {
		return "Engineer{" +
				"task= '" + branch + '\'' +
				", name= '" + name + '\''+
				", age= '" + age + '\'' +
				", gender= '" + gender + '\'' +
				", address= '" + address + '\'' +
				"}";
	}
}
