package exception;

public class EmailException extends Exception{
	public EmailException() {
		super("Email error");
	}
	
	public EmailException(String mail) {
		super("Email error: " + mail);
		
	}
}
