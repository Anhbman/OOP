package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	
	private List<String> authors = new ArrayList<String>();

	Book (String title){
		super(title);
	}
	
	Book (String title, String category){
		super(title, category);
	}
	
	Book (String title, String category, List<String> authors){
		super(title, category);
		this.authors = authors;
	}
	
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		if(authors.contains(authorName)) {
			authors.add(authorName);
			System.out.println("them authors thanh cong");
		}else {
			System.out.println("author da ton tai");
		}
	}
	public void removeAuthors(String authorName) {
		if(authors.remove(authorName)) {
			System.out.println("Xoa author thanh cong.");
		}else {
			System.out.println("Xoa author that bai");
		}
	}
}
