package hust.soict.hedspi.aims.media;

public abstract  class Media {
	private String title;
	private String category;
	float cost;
	private int id;
	public static int count = 0;
	
	
	
	public void setTitle(String title) {
		this.title = title;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}


	public int getId() {
		return id;
	}
	
	
	public Media(){
		this.id = count++;
	}
	
	public Media(String title) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.id = count++;
	}
	
	public Media(String title, String category, float cost){
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = count++;
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
