package BT5.hotel;

import java.util.Scanner;

public class Main {
	private static Scanner scanner;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		Hotel hotel = new Hotel();
		while(true) {
			showMenu();
			String line = scanner.nextLine();
			switch (line) {
			case "1": {
				System.out.println("Name: ");
				String name = scanner.nextLine();
				System.out.println("Age: ");
				int age = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Passport: ");
				String passport = scanner.nextLine();
				typeRoom();
				String choise = scanner.nextLine();
				Room room;
				if(choise.equals("a")) room = new RoomA(); 
				else if(choise.equals("b")) room = new RoomB();
				else if(choise.equals("c")) room = new RoomC();
				else continue;
				System.out.println("Enter number day for rent: ");
				int numberRent = scanner.nextInt();
				Person person = new Person(name, age, passport, room, numberRent);
				hotel.add(person);
				System.out.println(person.toString());
				scanner.nextLine();
				break;
			}
			case "2": {
				System.out.println("Enter passport: ");
				String passport = scanner.nextLine();
				hotel.delete(passport);
				break;
			}
			case "3": {
				System.out.println("Enter passport: ");
				String passport = scanner.nextLine();
				System.out.println("Price: " + hotel.calculator(passport));
				break;
			}
			case "4": {
				hotel.show();
				break;
			}
			case "5": {
				return;
			}
			default:
				System.out.println("Invatid!");;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("Application Manager Candidate");
        System.out.println("Enter 1: To insert person for rent");
        System.out.println("Enter 2: To remove person by passport");
        System.out.println("Enter 3: To calculator price by passport");
        System.out.println("Enter 4: To show infor");
        System.out.println("Enter 5: To exit:");
	}
	
	public static void typeRoom() {
		System.out.println("Choise a to rent room type A");
        System.out.println("Choise b to rent room type B");
        System.out.println("Choise c to rent room type C");
	}
}
