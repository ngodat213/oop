package BT1.officer;
import java.util.*;
import java.util.stream.Collectors;

public class ManagerOfficer {
	private List<CanBo> officers;
	
	public ManagerOfficer() {
		this.officers = new ArrayList<>();
	}
	
	public void addOfficer(CanBo officer) {
		this.officers.add(officer);
	}
	
	public List<CanBo> searchCanBoByName(String name){
		return this.officers.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
	}
	
	public void showListInforOfficer() {
		this.officers.forEach(o -> System.out.println(o.toString()));
	}
}
