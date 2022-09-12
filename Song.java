
public class Song {

	private String title;
	private String artist;
	private int[] time = new int[2];
	private int[] copy;
	
	
	public Song() {
		this.title = "noTitle";
		this.artist = "noArtist";
		this.time = time;
	}
	
	public Song(String title, String artist, int[] time) {
		this.title = title;
		this.artist = artist;
		this.time = time;
		copy = time.clone();
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public int[] getTime() {
		time = copy.clone();
		return time;
	}
}
