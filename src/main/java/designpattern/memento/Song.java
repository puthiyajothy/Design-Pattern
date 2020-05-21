package designpattern.memento;

public class Song {

	String name;

	public Song(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Songs [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
