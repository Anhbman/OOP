package hust.soict.hedspi.aims.media;

public class Media {
	private String title;
	private String category;
	float cost;
	
	
	Media(String title) {
		// TODO Auto-generated constructor stub
		this.title = title;
	}
	
	Media(String title, String category){
		this(title);
		this.category = category;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public void viewMedia(){
        System.out.println(".DVD-"+title+"-" + category + ":" + cost + "$");
    }
}
