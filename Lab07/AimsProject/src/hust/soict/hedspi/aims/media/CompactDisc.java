package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{

	private String artist;
	private ArrayList<Track> tracks;
	
	public String getArtist() {
		return artist;
	}
	
	public CompactDisc(String title) {
		super(title);
	}

	public CompactDisc(String title, String director ,String artist, int length,float cost) {
		super(title, artist, director, length,cost);
		this.artist = artist;
	}
	
	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}

	public void addTrack(Track track) {
		if(tracks.contains(track)) {
			System.out.println("Da ton tai track");
		}else {
			if(tracks.add(track))
				System.out.println("Them track thanh cong");
		}
	}
	
	public void removeTrack(Track track) {
		if(tracks.remove(track)) {
			System.out.println("Xoa track thanh cong");
		}else {
			System.out.println("Xoa track that bai");
		}
	}
	
	public int getLength() {
		return 0;
	}

	
	@Override
	public String printInfor() {
		// TODO Auto-generated method stub
		return (".CD: " + super.getTitle() + " - " + super.getDirector() + " - "+ getArtist() + " - " + super.getLength() + super.getCost());
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
}
