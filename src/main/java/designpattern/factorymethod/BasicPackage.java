package designpattern.factorymethodpattern;

public class BasicPackage  extends Package{

	@Override
	protected void createPackage() {
		laptop.add(new Dell());
		laptop.add(new Ram());
		laptop.add(new Pendriver());
		
		
	}

}
