package BT2.document;

public class Bao extends TaiLieu{
	protected int dayIssue;
	// CONSTRUCTOR
	public Bao(String id, String nxb, int number, int dayIssue) {
		super(id, nxb, number);
		this.dayIssue = dayIssue;
	}
	// SETTER & GETTER
	public int getDayIssue() {
		return dayIssue;
	}
	public void setDayIssue(int dayIssue) {
		this.dayIssue = dayIssue;
	}
	@Override
	public String toString() {
		return "Bao{" + 
				"dayIssue= " + dayIssue + '\''  +
				", id= " + id + '\''  +
				", nxb= "+ nxb + '\''  +
				", number= "+ number + '\'' +
				'}';
	}
}
