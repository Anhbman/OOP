package hust.soict.hedspi.aims.order;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.utils.MyDate;

public class Orders {
	
	public static final int MAX_NUMBERS_ORDERED = 10;
	public static final int MAX_NUMBERS_ORDER = 5;
	public static int nOrdered = 0;
	
	private MyDate dateOrders;
	
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public int qtyOrdered() {
		return itemsOrdered.size();
	}
	
	public Orders() {
        this.nOrdered++;
    }

	public MyDate getDateOrders() {
		return dateOrders;
	}


	public void setDateOrders(MyDate dateOrders) {
		this.dateOrders = dateOrders;
	}

	public void addMedia(Media disc) {
		if(qtyOrdered()>=10) {
			System.out.println("Don hang da day.");
		}else {
			System.out.println("Don hang da duoc them.");
			itemsOrdered.add(disc);;
		}
	}

	
	public void addMedia(Media[] dvdList) {
		int n = dvdList.length;
		for(int i = 0; i < n; i++)
		{
			if(qtyOrdered() >= 10) {
				System.out.println("Don hang" + dvdList[i].getTitle() + "Khong duoc them vao don hang");
			}else {
				System.out.println("Don hang da duoc them.");
				itemsOrdered.add(qtyOrdered(), dvdList[i]);;
			}
		}
	}
	public void addMedia(Media dvd1, Media dvd2) {
		int i = 0;
			if(qtyOrdered() < 10 && i == 0) {
				System.out.println("Don hang da duoc them");
				++i;
				itemsOrdered.add(qtyOrdered(), dvd2);;
			}
			if(qtyOrdered() < 10 && i == 1) {
				System.out.println("Don hang da duoc them");
				itemsOrdered.add(qtyOrdered(), dvd2);
			}
			if(qtyOrdered() >= 10 && i == 0) {
				System.out.println("Don hang" + dvd1.getTitle() + " " + dvd2.getTitle() + " khong doc them vao don hang");
			}
			if(qtyOrdered() >= 10 && i == 1) {
				System.out.println("Don hang"+ dvd2.getTitle() + " khong doc them vao don hang");
			}
	}

	
	public boolean RemoveMedia(Media media) {
		for(int i = 0; i < itemsOrdered.size(); i++) {
			if(itemsOrdered.get(i).getTitle() == media.getTitle()) {
				itemsOrdered.remove(i);
				return true;
			}	
		}
		return false;
	}
	
	public float totalCost() {
		float sum = 0;
		for(int i = 0; i < qtyOrdered(); i++) {
			sum += itemsOrdered.get(i).getCost()*100;
		}
		return sum/100;
	}

	public void viewOrder(){
        if(qtyOrdered() == 0 ){
            System.out.println("Don hang rong");
        }else{
            System.out.println("****************** Dat hang ******************************");
           // System.out.println("Ngay:" + dateOrders.viewDate("mm-dd-yyyy"));
            for (int i = 0; i < qtyOrdered(); i++)
                System.out.println(this.itemsOrdered.get(i).printInfor());
            System.out.println("Tong chi phi : " + totalCost());
            System.out.println("************************************************************");

        }
    }
	
	public boolean removeMedia(Media disc) {
        return this.itemsOrdered.remove(disc);
    }
//	public boolean find(String title) {
//		 for (int i = 0; i < qtyOrdered(); i++) {
//	        	if(itemsOrdered[i].search(title)) {
//	        		return true;
//	        	}else {
//	        		return false;
//	        	}	
//	        }
//		 return true;
//	}
//	public Media getAluckyItem() {
//		Random ran = new Random();
//		int n = ran.nextInt(qtyOrdered()-1);
//		itemsOrdered[n].setCost(0f);
//		return itemsOrdered[n];
//	}

}