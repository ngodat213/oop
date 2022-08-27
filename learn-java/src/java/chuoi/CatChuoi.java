package java.chuoi;

public class CatChuoi {

	public static void main(String[] args) {
		String s = "I'm Hydra Coder, and learn java now!";
		String[] words = s.split("\\s");
		for(String tmp : words) {
			System.out.println(tmp);
		}
	}
}
