package BT4.town;

import java.util.List;

public class Family{
	private List<Person> presons;
	private String address;
	// CONSTRUCTOR
	public Family(List<Person> presons, String address) {
		super();
		this.presons = presons;
		this.address = address;
	}
	// SETTER & GETTER
	public List<Person> getPresons() {
		return presons;
	}
	public void setPresons(List<Person> presons) {
		this.presons = presons;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Family{" +
				"persons= " + presons + '\'' + 
				"address= " + address +
				'}';
	}
}
