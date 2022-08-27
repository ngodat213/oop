package entity;

import java.time.LocalDate;
import java.util.List;

public class Experience extends Employee{
	protected int yearOfExperience;
	protected String proSkill;
	
	// SETTER & GETTER
	public Experience() {
	}

	public Experience(int expInYear, String proSkill) {
		this.yearOfExperience = expInYear;
		this.proSkill = proSkill;
	}	
	
	
	
	public Experience(String id, String fullName, LocalDate birthday, String phone, String email
		 , List<Certificate> certificates, int yearOfExperience, String proSkill) {
		super(id, fullName, birthday, phone, email, certificates);
		this.yearOfExperience = yearOfExperience;
		this.proSkill = proSkill;
	}

	// SETTER & GETTER
	public int getExpInYear() {
		return yearOfExperience;
	}
	public void setExpInYear(int expInYear) {
		this.yearOfExperience = expInYear;
	}
	public String getProSkill() {
		return proSkill;
	}
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}

	@Override
	public String toString() {
		return "Experience [yearOfExperience=" + yearOfExperience + 
				", proSkill=" + proSkill + 
				", id=" + id + 
				", fullName=" + fullName + 
				", birthday=" + birthday + 
				", phone=" + phone + 
				", email=" + email + 
				", certificates=" + certificates + 
				"]";
	}

	
}
