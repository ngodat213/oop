package BT2.document;

public class TapChi extends TaiLieu{
	private int issueNumber;
    private int monthIssue;
    // CONSTRUCTOR
    public TapChi(String id, String nxt, int number, int issueNumber, int monthIssue) {
		super(id, nxt, number);
		this.issueNumber = issueNumber;
		this.monthIssue = monthIssue;
	}
    // SETTER & GETTER
	public int getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}

	public int getMonthIssue() {
		return monthIssue;
	}

	public void setMonthIssue(int monthIssue) {
		this.monthIssue = monthIssue;
	}
    
    @Override
    public String toString() {
    	return "TapChi{" + 
				"issueNumber= " + issueNumber + '\''  +
				", monthIssue= " + monthIssue + '\''  +
				", id= " + id + '\''  +
				", nxb= "+ nxb + '\''  +
				", number= "+ number + '\'' +
				'}';
    }
}
