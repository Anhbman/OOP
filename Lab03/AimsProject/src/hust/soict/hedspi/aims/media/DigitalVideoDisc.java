package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media {
	private String director;
	private int length;
	
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	
	
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}

	public DigitalVideoDisc(String title) {
		super(title);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title,category);
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category);
		this.director = director;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		// TODO Auto-generated constructor stub
		super(title, category);
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	public boolean search(String title) {
		String[] words = title.toLowerCase().split(" ");
		String temp = this.getTitle().toLowerCase();
			for(int i = 0; i < words.length; i++) {
				if(!temp.contains(words[i])) {
					return false;
				}
			}
			return true;
	}
	public void viewDVD(){
        System.out.println(".DVD-"+getTitle()+"-" + getCategory() + ":" + cost + "$");
    }
	
}
