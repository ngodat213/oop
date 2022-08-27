package BT6.school;

public class Score {
	protected float math;
	protected float physical;
	protected float chemical;
	protected float biological;
	protected float history;
	protected float literary;
	protected float agent;
	// -- CONSTRUCTOR -- //
	public Score(float math, float physical, float chemical,float biological,
				 float history, float literary, float agent) {
		this.math = math;
		this.physical = physical;
		this.chemical = chemical;
		this.biological = biological;
		this.history = history;
		this.literary = literary;
		this.agent = agent;
	}	
	
	// -- SETTER & GETTER -- //
	public float getMath() {
		return math;
	}
	public void setMath(float math) {
		this.math = math;
	}
	public float getPhysical() {
		return physical;
	}
	public void setPhysical(float physical) {
		this.physical = physical;
	}
	public float getChemical() {
		return chemical;
	}
	public void setChemical(float chemical) {
		this.chemical = chemical;
	}
	public float getBiological() {
		return biological;
	}
	public void setBiological(float biological) {
		this.biological = biological;
	}
	public float getHistory() {
		return history;
	}
	public void setHistory(float history) {
		this.history = history;
	}
	public float getLiterary() {
		return literary;
	}
	public void setLiterary(float literary) {
		this.literary = literary;
	}
	public float getAgent() {
		return agent;
	}
	public void setAgent(float agent) {
		this.agent = agent;
	}
	// -- FUNCTION -- //
	public boolean isScore(float score) {
		return (0 >= score && score <= 10);
	}
	
	public String typeA() {
		return "typeA{" + 
				"math= " + math + '\'' + 
				"physical= " + physical + '\'' + 
				"chemical= " + chemical + '\'' +
				"average= " + (math + physical + chemical) / 3 + '\'' +
				'}';
	}
	
	public String typeB() {
		return "typeB{" + 
				"math= " + math + '\'' + 
				"chemical= " + chemical + '\'' +
				"biological= " + biological + '\'' +
				"average= " + (math + physical + biological) / 3 + '\'' +
				'}';
	}
	
	public String typeC() {
		return "typeC{" + 
				"literary= " + literary + '\'' + 
				"history= " + history + '\'' +
				"agent= " + agent + '\'' +
				"average= " + (literary + history + agent) / 3 + '\'' +
				'}';
	}
	
	public float average() {
		return  (math + physical + chemical + biological + history + literary + agent)/7;
	}
	
	@Override
	public String toString() {
		return "Score{" + 
				"math= " + math + '\'' +
				"physical= " + physical + '\'' +
				"chemical= " + chemical + '\'' +
				"biological= " + biological + '\'' +
				"history= " + history + '\'' +
				"literary= " + literary + '\'' +
				"agent= " + agent + '\'' +
				'}';
		
	}
}
