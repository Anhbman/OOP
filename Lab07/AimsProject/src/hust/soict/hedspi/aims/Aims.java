package hust.soict.hedspi.aims;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import hust.soict.hedspi.aims.media.AbstractItemFactory;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.BookFactory;
import hust.soict.hedspi.aims.media.CDFactory;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DVDFactory;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.order.Orders;
import hust.soict.hedspi.aims.utils.MyDate;

public class Aims {
	public static void main(String[] args) {
//		Orders anOrder = new Orders();
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
		//anOrder.setDateOrders(new MyDate("First","May",2000));
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
		
		
		//anOrder.addMedia(new Book("Aladin", "Anmation"));
//		Book book1;
//		
//		book1 = new Book("hahha", "hohoh", 18.9f);
//		book1.addAuthor("Phong ngu");
//		anOrder.addMedia(book1);
//		anOrder.viewOrder();
		//anOrder.viewOrder();
		//anOrder.viewOrder();
		showMenu();
		//showAdminMenu();
	}
	
	public static void showAdminMenu() {
		Orders order1 = new Orders();
		CompactDisc cd = new CompactDisc();
		List<Media> items = new ArrayList<>();
	
		
		int a;
		
		while(true) {
			System.out.println("Product Management Application: ");
			System.out.println("--------------------------------");
			System.out.println("1. Create new item");
			System.out.println("2. Delete item by id");
			System.out.println("3. Display the items list");
			System.out.println("0. Exit");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2-3");
			
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			
			
			switch (a) {
			case 1:{
				int n; 
				System.out.println("1. DVD \n2. CD \n3.Track \n4. Book");
				n = sc.nextInt();
				switch (n) {
					case 1:
						
						DigitalVideoDisc dic = new DigitalVideoDisc("Superman", "Animation", 20.8f);
						items.add(dic);
						//order1.addMedia(dic);
					
					break;
					case 2:{
						cd = new CompactDisc("Men of steal", "Zack", "Zack",3, 90f);
						items.add(cd);
//						order1.addMedia(cd);
					}break;
					
					case 3:{
						Track track = new Track("joker", 8);
						cd.addTrack(track);
						track.play();
						
					}break;
					case 4:{
						Book book1 = new Book("Batman", "Animation", 19.8f);
						book1.addAuthor("Zack");
						items.add(book1);
						order1.addMedia(book1);
					}break;
				default:
					System.out.println("Dau vao khong hop le.");
					break;
				}
			}break;

			case 2:{
				System.out.print(" Nhap vao ID: ");
				int check = 0;
				int n = sc.nextInt();
				for(Media item : items) {
					if(item.getId() == n) {
						items.remove(n);
						
					}
				}
			}break;
			
			case 3:{
				order1.setDateOrders(new MyDate("First","May",2000));
				for(Media item: items) {
					System.out.println(item.getId());
				}
				//order1.viewOrder();
			}break;
			
			case 0:
				return;
			default:
				System.out.println("Dau vao khong hop le.");
				break;
			}
		}
	
	}
	
	public static void showMenu() {
		Orders order1 = null;
		
		int a;
		while(true){

			System.out.println("Order Management Application: ");
			System.out.println("--------------------------------");
			System.out.println("1. Create new order");
			System.out.println("2. Add item to the order");
			System.out.println("3. Delete item by id");
			System.out.println("4. Display the items list of order");
			System.out.println("0. Exit");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2-3-4");
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			
			switch (a) {
			case 1: {
				order1 = createOrder();
				order1.setDateOrders(new MyDate("First","May",2000));
				if(order1 == null)
					System.out.println("Khong the tao them don hang");
			}
			break;
			case 2:{
				System.out.println("Chon loai don hang: ");
				System.out.println("Book : 1\nDisc : 2\nCompactDisc : 3\n");
				System.out.print("Lua chon cua ban: ");
                int c;
                c= new Scanner(System.in).nextInt();
                switch (c) {
				case 1: {
					Media tmp = createItem(new BookFactory());
					order1.addMedia(tmp);
				}break;
				case 2:{
					Media dic = createItem(new DVDFactory());
					order1.addMedia(dic);
				}break;
				case 3:{
					Media Com = createItem(new CDFactory());
					order1.addMedia(Com);
				}
				default:
					System.out.println("Try again");
				}
			}
			case 3:{
				DigitalVideoDisc dic = new DigitalVideoDisc("Superman");
				System.out.println(order1.RemoveMedia(dic) == true ? "Xoa thanh cong" : "Loi");
			}break;
			case 4:{
				order1.viewOrder();
			}
			case 0:{
				System.out.println("Bye");
				return;
			}
			default:
				System.out.println("Try again");
			}
		}
		
	}
	
	public static Orders createOrder() {
		if(Orders.nOrdered > Orders.MAX_NUMBERS_ORDERED) {
			return null;
		}
        return new Orders();
    }

	private static Media createItem(AbstractItemFactory abstractItemFactory) {
		return abstractItemFactory.createItemFromConsole();
	}

}
