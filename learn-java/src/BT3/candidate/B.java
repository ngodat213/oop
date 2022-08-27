package BT3.candidate;

public class B extends Student{
	protected double math;
	protected double chemical;
	protected double biological;
	// CONSTRUCTOR
	public B(String id, String name, String address, int priority) {
		super(id, name, address, priority);
		// TODO Auto-generated constructor stub
	}
	// SETTER & GETTER
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getChemical() {
		return chemical;
	}
	public void setChemical(double chemical) {
		this.chemical = chemical;
	}
	public double getBiological() {
		return biological;
	}
	public void setBiological(double biological) {
		this.biological = biological;
	}
	 @Override
	 public String toString() {
		 return "Student{ " +
					"id= " + id + '\'' +
					"name= " + name + '\'' +
					"address= " + address + '\'' + 
					"math= " + math + '\'' + 
					"chemical= " + chemical + 
					"biological" + biological +
					'}';
	 }
}
