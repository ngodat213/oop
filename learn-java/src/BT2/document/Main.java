package BT2.document;

import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		QuanLySach managerDocument = new QuanLySach();
		while(true) {
			mainMenu();
			String line = scanner.nextLine();
			switch (line) {
			case "1": {
				addMenu();
				String type = scanner.nextLine();
				switch (type) {
				case "a": {
					String id, nxb, author;
					int number, pageNumber;
					System.out.println("Enter id: ");
					id = scanner.nextLine();
					System.out.println("Enter nxb: ");
					nxb = scanner.nextLine();
					System.out.println("Enter number: ");
					number = scanner.nextInt();
					System.out.println("Enter author: ");
					scanner.nextLine();
					author = scanner.nextLine();
					System.out.println("Enter page number: ");
					pageNumber = scanner.nextInt();
					TaiLieu book = new Sach(id, nxb, number, author, pageNumber);
					managerDocument.addDocument(book);
					System.out.println(book.toString());
					scanner.nextLine();
					break;
				}
				case "b": {
					String id, nxb;
					int number, dayIssue;
					System.out.println("Enter id: ");
					id = scanner.nextLine();
					System.out.println("Enter nxb: ");
					nxb = scanner.nextLine();
					System.out.println("Enter number: ");
					number = scanner.nextInt();
					System.out.println("Enter day issue: ");
					dayIssue = scanner.nextInt();
					TaiLieu newSpaper = new Bao(id, nxb, number, dayIssue);
					managerDocument.addDocument(newSpaper);
					System.out.println(newSpaper.toString());
					scanner.nextLine();
					break;
				}
				case "c": {
					String id, nxb;
					int number, issueNumber, issueMonth;
					System.out.println("Enter id: ");
					id = scanner.nextLine();
					System.out.println("Enter nxb: ");
					nxb = scanner.nextLine();
					System.out.println("Enter number: ");
					number = scanner.nextInt();
					System.out.println("Enter issue number: ");
					issueNumber = scanner.nextInt();
					System.out.println("Enter issue month: ");
					issueMonth = scanner.nextInt();
					TaiLieu journal = new TapChi(id, nxb,  number, issueNumber, issueMonth);
					managerDocument.addDocument(journal);
					System.out.println(journal.toString());
					scanner.nextLine();
					break;
				}
				default:
					break;
				}
				break;
			}
			case "2": {
				searchMenu();
				String type = scanner.nextLine();
				switch (type) {
				case "a": {
					managerDocument.searchByBook();
					break;
				}
				case "b": {
					managerDocument.searchByNewspaper();
					break;
				}
				case "c": {
					managerDocument.searchByJournal();
					break;
				}
				default:
					break;
				}
				break;
			}
			case "3": {
				managerDocument.showInfor();
				break;
			}
			case "4": {
				System.out.println("Nhap id de xoa tai lieu: ");
				String id = scanner.nextLine();
				System.out.println(managerDocument.deleteDocument(id) ? "Success" : "Fail");
				scanner.nextLine();
				break;
			}
			case "5": {
				return;
			}
			default:
				System.out.println("Invatid");
			}
		}
	}
	
	public static void mainMenu() {
		System.out.println("Phan men quan ly sach");
		System.out.println("1. Them tai lieu");
		System.out.println("2. Tim tai lieu");
		System.out.println("3. Hien thi thong tin tai lieu");
		System.out.println("4. Xoa tai lieu");
		System.out.println("5. Thoat");
	}
	
	public static void addMenu() {
		System.out.println("a. Them sach");
		System.out.println("b. Them bao");
		System.out.println("c. Them tap chi");
	}
	
	public static void searchMenu() {
		System.out.println("a. Tim sach");
		System.out.println("b. Tim bao");
		System.out.println("c. Tim tap chi");
	}

}
