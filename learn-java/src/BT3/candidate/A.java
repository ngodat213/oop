package BT3.candidate;

public class A extends Student{

	protected double math;
	protected double physical;
	protected double chemical;
	// CONSTRUCTOR
	public A(String id, String name, String address, int priority, double math, double physical, double chemical) {
		super(id, name, address, priority);
		this.math = math;
		this.physical = physical;
		this.chemical = chemical;
	}
	// SETTER & GETTER
	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getPhysical() {
		return physical;
	}

	public void setPhysical(double physical) {
		this.physical = physical;
	}

	public double getChemical() {
		return chemical;
	}

	public void setChemical(double chemical) {
		this.chemical = chemical;
	}
	
	@Override
	public String toString() {
		return "Student{ " +
				"id= " + id + '\'' +
				"name= " + name + '\'' +
				"address= " + address + '\'' + 
				"math= " + math + '\'' + 
				"physical= " + physical + '\'' + 
				"chemical= " + chemical + 
				'}';
	}
}
