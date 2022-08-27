package BT2.document;

public class Sach extends TaiLieu{
	protected String author;
	protected int numerPage;
	// CONSTRUCTOR
	public Sach(String id, String nxt, int number, String author, int numerPage) {
		super(id, nxt, number);
		this.author = author;
		this.numerPage = numerPage;
	}
	//SETTER & GETTER
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNumerPage() {
		return numerPage;
	}
	public void setNumerPage(int numerPage) {
		this.numerPage = numerPage;
	}
	
	@Override
	public String toString() {
		return "Sach{" + 
				"author= " + author + '\''  +
				", numerPage= " + numerPage + '\''  +
				", id= " + id + '\''  +
				", nxb= "+ nxb + '\''  +
				", number= "+ number + '\'' +
				'}';
	}
}
