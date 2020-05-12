package designpattern.factorymethodpattern;

public class MiddlePackage extends Package {

	@Override
	protected void createPackage() {
		laptop.add(new HP());
		laptop.add(new Printer());
	}

}
