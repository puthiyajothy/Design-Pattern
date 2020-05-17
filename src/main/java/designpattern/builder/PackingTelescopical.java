package designpattern.builder;

public class PackingTelescopical {

	private String Name;
	private String Breakfast;
	private String Lunch;
	private String Dinner;

	public PackingTelescopical(String name) {
		this.Name = name;
	}

	public PackingTelescopical(String name, String breakfast) {
		this(name);
		this.Breakfast = breakfast;
	}

	public PackingTelescopical(String name, String breakfast, String lunch) {
		this(name, breakfast);
		this.Lunch = lunch;

	}

	@Override
	public String toString() {
		return "PackingTelescopical [Name=" + Name + ", Breakfast=" + Breakfast + ", Lunch=" + Lunch + ", Dinner="
				+ Dinner + "]";
	}

}
