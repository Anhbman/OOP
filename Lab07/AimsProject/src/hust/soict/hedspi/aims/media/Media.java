package hust.soict.hedspi.aims.media;

public abstract  class Media {
	private String title;
	private String category;
	float cost;
	
	public Media(){
		
	}
	
	public Media(String title) {
		// TODO Auto-generated constructor stub
		this.title = title;
	}
	
	public Media(String title, String category, float cost){
		this(title);
		this.category = category;
		this.cost = cost;
	}
	
	
	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}

	 public abstract String printInfor();
}
