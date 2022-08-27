package exception;

import java.time.LocalDate;

public class BirthdayException extends Exception{
	public BirthdayException() {
		super("Date error");
	}
	
	public BirthdayException(LocalDate date) {
		super("Date error: " + date.toString());
		
	}
}
