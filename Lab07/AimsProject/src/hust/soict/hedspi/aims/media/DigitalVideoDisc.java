package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	

	
	public DigitalVideoDisc() {
		super();
	}
	
	public DigitalVideoDisc(String title) {
		super(title);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title,category, cost);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, cost);
		this.setDirector(director);
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length,cost);
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
        return (".DVD-" + super.getTitle() + " - " + super.getId() +"-" + super.getCategory() + "-" + getDirector() + "-" + ":" + super.getCost() + "$");
    }
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		}

	
}
