package hust.soict.hedspi.test.disc;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
	public static void main(String args[]) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		swap(jungleDVD, cinderellaDVD);

		
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	}
	
	public static void swap(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
        DigitalVideoDisc d = new DigitalVideoDisc();
        d.setTitle(dvd1.getTitle());
        d.setCategory(dvd1.getCategory());
        d.setCost(dvd1.getCost());
        d.setDirector(dvd1.getDirector());
        d.setLength(dvd1.getLength());

        dvd1.setTitle(dvd2.getTitle());
        dvd1.setCategory(dvd2.getCategory());
        dvd1.setCost(dvd2.getCost());
        dvd1.setDirector(dvd2.getDirector());
        dvd1.setLength(dvd2.getLength());

        dvd2.setTitle(d.getTitle());
        dvd2.setCategory(d.getCategory());
        dvd2.setCost(d.getCost());
        dvd2.setDirector(d.getDirector());
        dvd2.setLength(d.getLength());
    }
}
