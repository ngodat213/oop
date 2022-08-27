package entity;

import java.time.LocalDate;

public class Certificate {
	protected String id;
	protected String name;
	protected int rank;
	protected LocalDate date;
	// -- CONSTRUCTOR -- //
	public Certificate(String id, String name, int rank, LocalDate date) {
		super();
		this.id = id;
		this.name = name;
		this.rank = rank;
		this.date = date;
	}
	// SETTER & GETTER
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
}
