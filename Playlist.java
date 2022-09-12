
public class Playlist {
	
	private Song[] songsList;
	private int numSongs;
	private static final int MIN_CAPACITY = 3;
	
	public Playlist() {
		numSongs = 0;
		songsList = new Song[MIN_CAPACITY];
	}
	
	public Playlist(int capacity) {
		numSongs = 0;
		if(capacity < MIN_CAPACITY) {
			capacity = MIN_CAPACITY;
		}
		songsList = new Song[capacity];
	}
	public int getCapacity() {
		return songsList.length;
	}
	
	public int getNumSongs() {
		return this.numSongs;
	}
	
	public Song getSong(int index){
		if (index < 0 || index >= numSongs) {
			return null;
		}
		else {
			return songsList[index];
		}
	}
	
	public Song[] getSongs() {
		Song[] newSongsArray = new Song[numSongs];
		for (int j = 0; j < numSongs; ++j) {
			newSongsArray[j] = songsList[j];
		}
		return newSongsArray;
	}
	
	public boolean addSong(Song song) {
		return addSong(numSongs, song);
	}
	
	public boolean addSong(int index, Song song) {
		if (numSongs >= songsList.length || index < 0 || index > numSongs || song == null) {
			return false;
		}
		else {
			for (int i = numSongs - 1; i >= index; i--) {
				songsList[i + 1] = songsList[i];
 			}
			songsList[index] = song;
			numSongs++;
			return true;
		}
	}
	
	public int addSongs(Playlist playlist) {
		int i = 0;
		if(playlist == null) {
			return 0;
		}
		else {
			while (numSongs < songsList.length && i < playlist.numSongs) {
				songsList[numSongs++] = playlist.songsList[i++];
			}
		}
		return i;
	}
	
	public Song removeSong() {
		if (numSongs == 0) {
			return null;
		}
		else {
			numSongs--;
			return songsList[numSongs];
		}
	}
	
	public Song removeSong(int index) {
		if (numSongs == 0 || index >= numSongs) {
			return null;
		}
		else {
			Song removed = songsList[index];
			for (int i = index; i < numSongs-1; i++) {
				songsList[i] = songsList[i + 1];
			}
			numSongs--;
			return removed;
		}
	}
}



