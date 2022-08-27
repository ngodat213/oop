package BT3.candidate;

public class C extends Student {
	protected double literary;
	protected double history;
	protected double agent;
	
	// CONSTRUCTOR
	public C(String id, String name, String address, int priority, double literary, double history, double agent) {
		super(id, name, address, priority);
		this.literary = literary;
		this.history = history;
		this.agent = agent;
	}
	
	// SETTER & GETTER
	public double getLiterary() {
		return literary;
	}
	public void setLiterary(double literary) {
		this.literary = literary;
	}
	public double getHistory() {
		return history;
	}
	public void setHistory(double history) {
		this.history = history;
	}
	public double getAgent() {
		return agent;
	}
	public void setAgent(double agent) {
		this.agent = agent;
	}
	
	@Override
	 public String toString() {
		 return "Student{ " +
					"id= " + id + '\'' +
					"name= " + name + '\'' +
					"address= " + address + '\'' + 
					"literary= " + literary + '\'' + 
					"history= " + history + 
					"agent" + agent +
					'}';
	 }
}
