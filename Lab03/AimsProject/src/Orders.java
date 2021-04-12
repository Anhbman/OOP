

public class Orders {
	public static final int MAX_NUMBERS_ORDERED = 10;
	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public int qtyOrdered() {
		int count = 0;
		
		for(int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
			if(itemsOrdered[i] != null)
				count++;
		}
		return count;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered()>=10) {
			System.out.println("Don hang da day.");
		}else {
			System.out.println("Don hang da duoc them.");
			itemsOrdered[qtyOrdered()] = disc;
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int c,i;
		int count = qtyOrdered();
		for(c = i = 0; i < qtyOrdered(); i++) {
			if(itemsOrdered[i].getTitle() != disc.getTitle()) {
				itemsOrdered[c] = itemsOrdered[i];
				c++;
			}else {
				System.out.println("Don hang da duoc xoa.");
			}
		}
		itemsOrdered[count-1] = null;
	}
	
	public float totalCost() {
		float sum = 0;
		for(int i = 0; i < qtyOrdered(); i++) {
			sum += itemsOrdered[i].getCost()*100;
		}
		return sum/100;
	}

}
