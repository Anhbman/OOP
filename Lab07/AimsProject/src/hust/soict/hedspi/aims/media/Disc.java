package hust.soict.hedspi.aims.media;

public class Disc extends Media{

	private int length;
	private String director;
	
	
	public void setLength(int length) {
		this.length = length;
	}


	public int getLength() {
		return length;
	}


	public String getDirector() {
		return director;
	}

	public Disc() {
		// TODO Auto-generated constructor stub
	}
	
	public Disc(String title) {
		super(title);
	}
	
	public Disc(String title, String category, float cost) {
		super(title, category, cost);
	}
	
	public Disc(String title, String category, String director, int length,float cost) {
		super(title, category, cost);
		this.setDirector(director);
		this.length = length;
	}
	
	public Disc(String title, String category, String director2, float cost) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String printInfor() {
		// TODO Auto-generated method stub
		return null;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	
}
