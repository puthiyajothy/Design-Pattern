package designpattern.factorymethodpattern;

public class SpcialPackage extends Package {

	@Override
	protected void createPackage() {
		laptop.add(new Apple());
		laptop.add(new Ram());
		laptop.add(new Printer());

	}

}
