package BT4.town;

import java.util.ArrayList;
import java.util.List;

public class Town {
	List<Family> families;
	// CONSTRUCTOR
	public Town() {
		this.families = new ArrayList<>();
	}
	// SETTER & GETTER
	public List<Family> getFamilies() {
		return families;
	}
	public void setFamilies(List<Family> families) {
		this.families = families;
	}
	
	public void addFamily(Family family) {
		this.families.add(family);
	}
	
	public void showInfo() {
		this.families.forEach(family -> System.err.println(family.toString()));
	}
}
