import java.util.Random;

public class Orders {
	public static final int MAX_NUMBERS_ORDERED = 10;
	
	private MyDate dateOrders;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public int qtyOrdered() {
		int count = 0;
		
		for(int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
			if(itemsOrdered[i] != null)
				count++;
		}
		return count;
	}
	
	
	
	public MyDate getDateOrders() {
		return dateOrders;
	}



	public void setDateOrders(MyDate dateOrders) {
		this.dateOrders = dateOrders;
	}



	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered()>=10) {
			System.out.println("Don hang da day.");
		}else {
			System.out.println("Don hang da duoc them.");
			itemsOrdered[qtyOrdered()] = disc;
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		int n = dvdList.length;
		for(int i = 0; i < n; i++)
		{
			if(qtyOrdered() >= 10) {
				System.out.println("Don hang" + dvdList[i].getTitle() + "Khong duoc them vao don hang");
			}else {
				System.out.println("Don hang da duoc them.");
				itemsOrdered[qtyOrdered()] = dvdList[i];
			}
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		int i = 0;
			if(qtyOrdered() < 10 && i == 0) {
				System.out.println("Don hang da duoc them");
				++i;
				itemsOrdered[qtyOrdered()] = dvd1;
			}
			if(qtyOrdered() < 10 && i == 1) {
				System.out.println("Don hang da duoc them");
				itemsOrdered[qtyOrdered()] = dvd2;
			}
			if(qtyOrdered() >= 10 && i == 0) {
				System.out.println("Don hang" + dvd1.getTitle() + " " + dvd2.getTitle() + " khong doc them vao don hang");
			}
			if(qtyOrdered() >= 10 && i == 1) {
				System.out.println("Don hang"+ dvd2.getTitle() + " khong doc them vao don hang");
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

	public void viewOrder(){
        if(qtyOrdered() == 0 ){
            System.out.println("Don hang rong");
        }else{
            System.out.println("****************** Dat hang ******************************");
            System.out.println("Ngay:" + dateOrders.viewDate("mm-dd-yyyy"));
            for (int i = 0; i < qtyOrdered(); i++)
                this.itemsOrdered[i].viewDVD(i);
            System.out.println("Tong chi phi : " + totalCost());
            System.out.println("************************************************************");

        }
    }
	public boolean find(String title) {
		 for (int i = 0; i < qtyOrdered(); i++) {
	        	if(itemsOrdered[i].search(title)) {
	        		return true;
	        	}else {
	        		return false;
	        	}	
	        }
		 return true;
	}
	public DigitalVideoDisc	getAluckyItem() {
		Random ran = new Random();
		int n = ran.nextInt(qtyOrdered()-1);
		itemsOrdered[n].setCost(0f);
		return itemsOrdered[n];
	}
}