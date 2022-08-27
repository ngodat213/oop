package exception;

public class FullnameException extends Exception{
	public FullnameException() {
		super("FullName error");
	}
	
	public FullnameException(String fullName) {
		super("FullName error: " + fullName);
		
	}
}
