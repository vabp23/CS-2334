import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Playlist {
	
	private ArrayList<Song> songs;
	
	public Playlist() {
		songs = new ArrayList<>();
	}
	public Playlist(String filename) {
		this();
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String line;
			while((line = br.readLine()) != null) {
				Song song = new Song(line);
				songs.add(song);
			}
			br.close();
		}
		catch(Exception e) {
		}
	}
	
	public int getNumSongs() {
		return songs.size();
	}
	
	
	public Song getSong(int index) {
		if (index < 0 || index >= getNumSongs()) {
			return null;
		}
		return songs.get(index);
	}
	
	public Song[] getSongs() {
		return songs.toArray(new Song[0]);
	}
	
	public boolean addSong(Song song) {
		return addSong(getNumSongs(), song);
	}
	
	public boolean addSong(int index, Song song) {
		if (song == null || index < 0 || index > songs.size()) {
			return false;
		}
		songs.add(index, song);
		return true;
	}
	
	public int addSongs(Playlist playlist) {
		if(playlist == null) {
			return 0;
		}
		Song[] allSongs = playlist.getSongs();
		int count = 0;
		for(int i = 0; i < allSongs.length; i++) {
			Song song = allSongs[i];
			if(addSong(song)) {
			count++;
		}
		}
		return count;
	}
	
	public int addSongs(String filename) {
		int count = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String line;
			
			while((line = br.readLine()) != null) {
				Song song = new Song(line);
				songs.add(song);
				count++;
			}
		br.close();
		}
		catch (Exception e) {
		}
		return count;
		}
		
	
	
	
	public Song removeSong() {
		return removeSong(getNumSongs() - 1);
	}
	
	public Song removeSong(int index) {
		if( index < 0 || index >= getNumSongs()) {
			return null;
		}
		return songs.remove(index);
	}
	public String toString() {
		Song[] allSongs = getSongs();
		String str = "";
		for(int j = 0; j < songs.size(); ++j) {
			if(j == songs.size() - 1) {
				str += allSongs[j].toString();
			}
			else {
				str += allSongs[j].toString() + System.lineSeparator();
			}
				
		}
		return str;
	}

public void saveSongs(String filename) {
	try {
		BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
		bw.write(this.toString());
		bw.close();
	}
	catch(IOException e) {
}


}
}











