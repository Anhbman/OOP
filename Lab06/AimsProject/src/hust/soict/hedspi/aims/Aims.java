package hust.soict.hedspi.aims;
import java.util.Arrays;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.order.Orders;
import hust.soict.hedspi.aims.utils.MyDate;

public class Aims {
	public static void main(String[] args) {
		Orders anOrder = new Orders();
//				
//		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animaton", "Roger Allers", 87, 19.95f);
//		
//		anOrder.addMedia(dvd1);
//		
//		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star war", "Science", "George Lucas", 87, 24.95f);
//		
//		anOrder.addMedia(dvd2);
//		
//		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Anmation", 18.99f);
//		anOrder.addMedia(dvd3,dvd2);
		anOrder.setDateOrders(new MyDate("First","May",2000));
//		
//		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Star war");
//		//anOrder.removeDigitalVideoDisc(dvd4);
//		//System.out.println(anOrder.getAluckyItem());
//		
//		anOrder.viewOrder();
//		System.out.print("Total Cost is: ");
//		System.out.println(anOrder.totalCost());
//		System.out.println(anOrder.find("The Lion"));
//		System.out.println(dvd1.search("war"));
		
		
		anOrder.addMedia(new DigitalVideoDisc("Aladin", "Anmation", 18.99f));
		anOrder.viewOrder();
	}

}
