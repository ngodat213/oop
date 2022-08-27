package ui;

import java.time.LocalDate;
import java.util.Scanner;

import entity.Employee;
import entity.Experience;
import service.EmployeeManager;

public class UIManager {
	private EmployeeManager employeeManager = new EmployeeManager();
	
	/*
	 * type = 1 -> Experience
	 * type = 2 -> Fresher
	 * type = 3 -> Intern
	 */
	public void insert(int type) {
		Employee employee = null;
		if(type == 1) {
			
		}
	}
	
	private Experience insertExperience() {
		Scanner scanner = ScannerFactory.getScanner();
		
		System.out.println("Input ID: ");
		String id = scanner.nextLine();
		System.out.println("Input Fullname: ");
		String name = scanner.nextLine();
		System.out.println("Input Birthday: ");
		LocalDate birthDay = insertDate();
		System.out.println("Input Phone: ");
		String phone = scanner.nextLine();
		System.out.println("Input Email: ");
		String email = scanner.nextLine();
		
		return new Experience();
	}
	
	private LocalDate insertDate() {
		Scanner scanner = ScannerFactory.getScanner();
		System.out.println("day: ");
		int day = scanner.nextInt();
		System.out.println("month: ");
		int month = scanner.nextInt();
		System.out.println("year: ");
		int year = scanner.nextInt();
		LocalDate localDate = LocalDate.of(year, month, day);
		return localDate;
	}
}