import java.util.Arrays;

public class Song {
	
	private String title;
	private String artist;
	private int[] time;
	private final String INFO_DELIMITER = "; ";
	private final String TIME_DELIMITER = ":";
	private int IDX_TITLE = 0;
	private int IDX_ARTIST = 1;
	private int IDX_TIME = 2;
	
	public Song(String title, String artist, int[] time) {
		this.title = title;
		this.artist = artist;
		this.time = Arrays.copyOf(time, time.length);
	}
	
	public Song(String info) {
		String[] storage = info.split(INFO_DELIMITER);
		this.title = storage[IDX_TITLE].trim();
		this.artist = storage[IDX_ARTIST].trim();
		
		String[] times = storage[IDX_TIME].split(TIME_DELIMITER);
		int[] timesStorage = new int[times.length];
		for (int i = 0; i < times.length; i++) {
			timesStorage[i] = Integer.parseInt(times[times.length - i - 1].trim());
		}
			this.time = timesStorage;
		}
	
	
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public int[] getTime() {
		return Arrays.copyOf(time, time.length);
	}

	public String toString() {
		String timeStr = "";
		if(time.length == 1) {
			timeStr = "" + time[0];
		}
		if(time.length == 2) {
			timeStr = time[1] + TIME_DELIMITER + String.format("%02d", time[0]);
		}
		if(time.length == 3) {
			timeStr = time[2] + TIME_DELIMITER + String.format("%02d", time[1]) + TIME_DELIMITER + String.format("%02d", time[0]);
		}
		return title + INFO_DELIMITER + artist + INFO_DELIMITER + timeStr;
		}

}

