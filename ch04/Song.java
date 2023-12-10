package classes;

public class Song {
	String Song;
	String artist;
	int year;
	String country;
	
	public Song() {
		super();
	}
	
	public Song(String song, String artist, int year, String country) {
		super();
		Song = song;
		this.artist = artist;
		this.year = year;
		this.country = country;
}	
	void show() {
	System.out.println(year+"년 " + country +"국적의 " + artist +"가 부른 "+ Song); 
	
	}
	public static void main(String[] args) {
		Song song = new Song("Danceing Queen", "ABBA", 1978, "스웨덴");
		song.show();

	}	
		
		
	}
	


