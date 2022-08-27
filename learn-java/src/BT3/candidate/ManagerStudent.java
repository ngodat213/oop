package BT3.candidate;

import java.util.ArrayList;

public class ManagerStudent {
	ArrayList<Student> students;
	
	// CONSTRUCTOR
	public ManagerStudent() {
		this.students = new ArrayList<>();
	}
	// FUNCITON
	public void addStudent(Student st) {
		students.add(st);
	}
	
	public void showInfoStudent() {
		this.students.forEach(st -> System.out.println(st.toString()));
	}
	
	public Student searchStudentByID(String id) {
		return this.students.stream()
				.filter(st -> st.getId().equals(id))
				.findFirst().orElse(null);
	}
}
