package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
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
		super(title,category, cost);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, cost);
		this.director = director;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		// TODO Auto-generated constructor stub
		super(title, category, cost);
		this.director = director;
		this.length = length;
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
	@Override
    public String printInfor() {
        return (".DVD-" + super.getTitle() + "-" + super.getCategory() + "-" + director + "-" + ":" + super.getCost() + "$");
    }
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		}

	
}
