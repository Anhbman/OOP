package hust.soict.hedspi.aims.media;

import java.util.Scanner;

public class CDFactory implements AbstractItemFactory{

	@Override
	public Media createItemFromConsole() {
		String title;
		String category;
		float cost;
		int length;
		String artist;
		String director;
		System.out.print("Title : ");
	    title = new Scanner(System.in).nextLine();
	    System.out.print("Category : ");
	    category =  new Scanner(System.in).nextLine();
	    System.out.print("Cost : ");
	    cost = new Scanner(System.in).nextFloat();
	    System.out.print("Length : ");
	    length = new Scanner(System.in).nextInt();
	    System.out.print("Director : ");
	    director = new Scanner(System.in).nextLine();
	    System.out.print("Artist : ");
	    artist = new Scanner(System.in).nextLine();
	    return new CompactDisc(title, director, artist, length, cost);
	}
	
}
