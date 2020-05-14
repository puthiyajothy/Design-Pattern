package designpattern.prototype;

public class User {

	public static void main(String[] args) {

		Registry registry = new Registry();

		Windows win = (Windows) registry.getoperatingSystem(OSType.WINDOWS);

		System.out.println(win);
		win.setType("MinComputer");
		System.out.println(win);

	}

}
