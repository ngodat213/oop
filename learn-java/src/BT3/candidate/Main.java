package BT3.candidate;

import java.util.Scanner;

public class Main {
	private static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		ManagerStudent managerStudent = new ManagerStudent();
		while(true) {
			mainMenu();
			String line = scanner.nextLine();
			switch (line) {
			case "1": {
				addMenu();
				String choise = scanner.nextLine();
				switch (choise) {
				case "a": {
					System.out.println("Enter id: ");
					String id = scanner.nextLine();
					System.out.println("Enter name: ");
					String name = scanner.nextLine();
					System.out.println("Enter address: ");
					String address = scanner.nextLine();
					System.out.println("Enter priority: ");
					int priority = scanner.nextInt();
					System.out.println("Enter math point: ");
					double math = scanner.nextInt();
					System.out.println("Enter physical point: ");
					double physical = scanner.nextInt();
					System.out.println("Enter chemical point: ");
					double chemical = scanner.nextInt();
					Student a = new A(id, name, address, priority, math, physical, chemical);
					managerStudent.addStudent(a);
					System.out.println(a.toString());
					scanner.nextLine();
					break;
				}
				case "b": {
					System.out.println("Enter id: ");
					String id = scanner.nextLine();
					System.out.println("Enter name: ");
					String name = scanner.nextLine();
					System.out.println("Enter address: ");
					String address = scanner.nextLine();
					System.out.println("Enter priority: ");
					int priority = scanner.nextInt();
					System.out.println("Enter math point: ");
					double math = scanner.nextInt();
					System.out.println("Enter chemical point: ");
					double chemical = scanner.nextInt();
					System.out.println("Enter biological point: ");
					double biological = scanner.nextInt();
					Student b = new A(id, name, address, priority, math, chemical, biological);
					managerStudent.addStudent(b);
					System.out.println(b.toString());
					scanner.nextLine();
					break;
				}
				case "c": {
					System.out.println("Enter id: ");
					String id = scanner.nextLine();
					System.out.println("Enter name: ");
					String name = scanner.nextLine();
					System.out.println("Enter address: ");
					String address = scanner.nextLine();
					System.out.println("Enter priority: ");
					int priority = scanner.nextInt();
					System.out.println("Enter literary point: ");
					double literary = scanner.nextInt();
					System.out.println("Enter history point: ");
					double history = scanner.nextInt();
					System.out.println("Enter agent point: ");
					double agent = scanner.nextInt();
					Student c = new A(id, name, address, priority, literary, history, agent);
					managerStudent.addStudent(c);
					System.out.println(c.toString());
					scanner.nextLine();
					break;
				}
				default:
					break;
				}
				scanner.nextLine();
				break;
			}
			case "2": {
				managerStudent.showInfoStudent();
				break;
			}
			case "3": {
				System.out.println("Enter id to find: ");
				String id = scanner.nextLine();
				Student index = managerStudent.searchStudentByID(id);
				System.out.println(index.toString());
				break;
			}
			case "4": {
				break;
			}
			default:
				System.out.println("Invatid!");
			}
		}
	}
	
	public static void mainMenu() {
		System.out.println("Thi sinh du thi dai hoc");
		System.out.println("1. Them thi sinh");
		System.out.println("2. Hien thi tong tin cua thi sinh va khoi thi cua thi sinh");
		System.out.println("3. Tim kiem theo so bao danh");
		System.out.println("4. Thoat");
	}
	
	public static void addMenu() {
		System.out.println("a. Khoi A");
		System.out.println("b. Khoi B");
		System.out.println("c. Khoi C");
	}
}
