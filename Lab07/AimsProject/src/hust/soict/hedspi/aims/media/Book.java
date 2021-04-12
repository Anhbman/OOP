package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	
	private List<String> authors = new ArrayList<String>();

	public Book (String title){
		super(title);
	}
	
	public Book (String title, String category, float cost){
		super(title, category, cost);
	}
	
	public Book (String title, String category, Float cost, List<String> authors){
		super(title, category, cost);
		this.authors = authors;
	}
	
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		if(!authors.contains(authorName)) {
			authors.add(authorName);
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
	
	@Override
    public String printInfor() {
        return ( ".Book-"+ super.getTitle() +"-" + super.getCategory() + "-" + getAuthors() + ":" + super.getCost() + "$");
    }
	
	
}
