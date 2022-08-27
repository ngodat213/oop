package BT4.town;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static Scanner scanner;
	
    public static void main(String[] args) {
    	scanner = new Scanner(System.in);
    	
        Town town = new Town();
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
        	System.out.print("Enter address: ");
        	scanner.nextLine();
        	String address = scanner.nextLine();
        	List<Person> persons = new ArrayList<>();
        	System.out.print("Enter number persons: ");
        	int numberPerson = scanner.nextInt();
        	for(int j = 0; j < numberPerson; j++) {
        		scanner.nextLine();
        		System.out.print("Name: ");
        		String name = scanner.nextLine();
        		System.out.print("Age: ");
        		int age = scanner.nextInt();
        		scanner.nextLine();
        		System.out.print("Job: ");
        		String job = scanner.nextLine();
        		System.out.print("Passport: ");
        		String passport = scanner.nextLine();
        		Person person = new Person(name, age, job, passport);
        		System.out.println(person.toString());
        		persons.add(person);
        	}
        	town.addFamily(new Family(persons, address));
        }
        town.showInfo();
    }
}