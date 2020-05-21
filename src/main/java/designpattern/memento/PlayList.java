package designpattern.memento;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

	ArrayList<Song> songs = new ArrayList<Song>();

	public void addsong(Song song) {
		songs.add(song);

	}

	public ArrayList<Song> getSong() {
		return (ArrayList<Song>) songs.clone();
	}

	@Override
	public String toString() {
		return "PlayList [song=" + songs + "]";
	}

	public Playlistmemento save() {
		return new Playlistmemento(getSong());
	}

	public void revert(Playlistmemento playlistmemento) {
		songs = playlistmemento.song;
	}

	static class Playlistmemento {

		ArrayList<Song> song;

		public Playlistmemento(ArrayList<Song> song) {
			this.song = song;

		}
	}

}
