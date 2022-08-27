package BT6.school;

import java.util.Scanner;

public class Main {
	private static Scanner scanner;
	public static void main(String[] args) {
			scanner = new Scanner(System.in);
			School school = new School();
	}

	public static void menu() {
		System.out.println("Application Manager School");
		System.out.println("Enter 1. To insert student");
		System.out.println("Enter 2. To show student by age");
		System.out.println("Enter 3. To show sutdent by age and hometown");
		System.out.println("Enter 4. To exit");
	}
}
