package entity;

import java.time.LocalDate;
import java.util.List;

public class Fresher extends Employee{
	protected LocalDate dateGraduation;
	protected String rankGraduation;
	protected String universityName;
	
	public Fresher() {
	}

	public Fresher(LocalDate dateGraduation, String rankGraduation, String universityName) {
		this.dateGraduation = dateGraduation;
		this.rankGraduation = rankGraduation;
		this.universityName = universityName;
	}
	
	
	public Fresher(String id, String fullName, LocalDate birthday, String phone, String email
		 , List<Certificate> certificates, LocalDate dateGraduation, String rankGraduation
		 , String universityName) {
		super(id, fullName, birthday, phone, email, certificates);
		this.dateGraduation = dateGraduation;
		this.rankGraduation = rankGraduation;
		this.universityName = universityName;
	}

	// SETTER & GETTER

	public LocalDate getDateGraduation() {
		return dateGraduation;
	}

	public void setDateGraduation(LocalDate dateGraduation) {
		this.dateGraduation = dateGraduation;
	}

	public String getRankGraduation() {
		return rankGraduation;
	}

	public void setRankGraduation(String rankGraduation) {
		this.rankGraduation = rankGraduation;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	@Override
	public String toString() {
		return "Fresher [dateGraduation=" + dateGraduation + 
				", rankGraduation=" + rankGraduation + 
				", universityName=" + universityName + 
				", id=" + id + 
				", fullName=" + fullName + 
				", birthday=" + birthday + 
				", phone="+ phone + 
				", email=" + email + 
				", certificates=" + certificates + 
				"]";
	}
	
	
}
