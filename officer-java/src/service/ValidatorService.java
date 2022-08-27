package service;
import exception.*;
import ui.*;
import java.time.LocalDate;
import java.util.*;

public class ValidatorService {
	public static void birthdayCheck(LocalDate birthday) throws BirthdayException {
        try {
        	
		} catch (Exception e) {
			throw new BirthdayException(birthday);
		}
    }

    public static void phoneCheck(String phone) throws PhoneException {
    	try {
        	
		} catch (Exception e) {
			throw new PhoneException(phone);
		}
    }

    public static void emailCheck(String email) throws EmailException {
    	try {
        	
		} catch (Exception e) {
			throw new EmailException(email);
		}
    }

    public static void nameCheck(String name) throws FullnameException {
    	try {
        	
		} catch (Exception e) {
			throw new FullnameException(name);
		}
    }
}
