package BT4.town;

public class Person {
	protected String name;
	protected int age;
	protected String job;
	protected String passport;
	// CONSTRUCTOR
	public Person(String name, int age, String job, String passport) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.passport = passport;
	}
	//SETTER & GETTER
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	
	@Override
	public String toString() {
		return "Person{" +
				"name= " + name + '\'' +
				"age= " + age + '\'' + 
				"job= " + job + '\'' +
				"passport= " + passport + '\'' +
				'}';
				
	}
}
