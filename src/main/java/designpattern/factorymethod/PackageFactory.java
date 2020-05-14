package designpattern.factorymethodpattern;

public class PackageFactory extends Laptop {

	public static Package createPackage(Packagecode packagecode) {

		switch (packagecode) {
		case BASIC:
			return new BasicPackage();
		case MIDDLE:
			return new MiddlePackage();
		case SPECIAL:
			return new SpcialPackage();
		default:
			return null;
		}
	}

}
