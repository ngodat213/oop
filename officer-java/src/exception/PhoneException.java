package exception;

public class PhoneException extends Exception {
	public PhoneException() {
		super("Phone error");
	}
	
	public PhoneException(String phone) {
		super("Phone error: " + phone);
		
	}
}
