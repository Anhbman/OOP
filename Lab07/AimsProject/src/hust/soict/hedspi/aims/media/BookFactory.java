package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookFactory implements AbstractItemFactory{

	@Override
	public Media createItemFromConsole() {
		int i = 1;
		String title;
		String category;
		float cost;
		List<String> authors = new ArrayList<>();
		System.out.print("Title : ");
        title = new Scanner(System.in).nextLine();
        System.out.print("Category : ");
        category =  new Scanner(System.in).nextLine();
        System.out.print("Price : ");
        cost = new Scanner(System.in).nextFloat();
        System.out.println("Authors : ");
        while (true){
            System.out.print("Author " + i + " : ");
            authors.add(new Scanner(System.in).nextLine());
            System.out.printf("Break(y/n) ? ");
            if((new Scanner(System.in).nextLine()).compareToIgnoreCase("y") == 0) break;
        }
        
        return new Book(title, category, cost, authors);
	}

}
