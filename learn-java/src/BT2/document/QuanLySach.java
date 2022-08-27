package BT2.document;

import java.util.*;

public class QuanLySach {
	ArrayList<TaiLieu> documents;
	// CONSTRUCTOR
	public QuanLySach() {
		this.documents = new ArrayList<>();
	}
	// FUNCTION
	public void addDocument(TaiLieu document) {
		this.documents.add(document);
	}
	
	public Boolean deleteDocument(String id) {
		TaiLieu tl = this.documents.stream()
				.filter(document -> document.getId().equals(id))
				.findFirst().orElse(null);
		if(tl == null) {
			return false;
		}
		this.documents.remove(tl);
		return true;
	}
	
	public void showInfor() {
		this.documents.forEach(documents -> System.out.println(documents.toString()));
	}
	
	public void searchByBook() {
		this.documents.stream()
			.filter(doc -> doc instanceof Sach)
			.forEach(doc -> System.out.println(doc.toString()));
	}
	
	public void searchByNewspaper() {
		this.documents.stream()
			.filter(doc -> doc instanceof Bao)
			.forEach(doc -> System.out.println(doc.toString()));
	}
	
	public void searchByJournal() {
		this.documents.stream()
			.filter(doc -> doc instanceof TapChi)
			.forEach(doc -> System.out.println(doc.toString()));
	}
}
