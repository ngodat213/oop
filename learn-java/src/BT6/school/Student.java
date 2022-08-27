package BT6.school;

import java.util.Objects;

public class Student {
	protected String classStudent;
	protected String name;
	protected String id;
	protected int age;
	protected Score score;
	// CONSTRUCTOR
	public Student(String classStudent, String name, String id, int age, Score score) {
		this.classStudent = classStudent;
		this.name = name;
		this.id = id;
		this.age = age;
		this.score = score;
	}
	// GETTER & GETTER
	public String getClassStudent() {
		return classStudent;
	}
	public void setClassStudent(String classStudent) {
		this.classStudent = classStudent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student{" +
				"class= " + classStudent + '\'' +
				"name= " + name + '\'' +
				"id= " + id + '\'' +
				"age= " + age + '\'' +
				"score= " + score.toString() + '\'' +
				'}';
	}
}
