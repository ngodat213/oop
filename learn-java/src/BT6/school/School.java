package BT6.school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class School {
	private List<Student> students;

	public School() {
		this.students = new ArrayList<>();
	}
	public School(List<Student> students) {
		this.students = students;
	}
	
	public void add(Student student) {
		this.students.add(student);
	}

	public boolean checkEmpty() {
		return students.isEmpty();
	}
	
	public int listSize() {
		return students.size();
	}
	
	public void clearList() {
		this.students.removeAll(students);
	}
	
	public boolean checkStudentByID(String id) {
		for(Student s : students) {
			if(s.getId().equals(id))
				return true;
		}
		return false;
	}
	
	public boolean removeStudentByID(String id) {
		Student pos = this.students.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
		if(pos == null) {
			return false;
		}
		students.remove(pos);
		return true;
	}
	
	public void sortStudentByScore() {
		Collections.sort(this.students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getScore().average() < o2.getScore().average()) {
					return -1;
				}else if(o1.getScore().average() > o2.getScore().average()){
					return 1;
				}else {
					return 0;
				}
			}
		});
	}
	
}
