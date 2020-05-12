package designpattern.factorymethodpattern;

public class Customer {

	public static void main(String[] args) {

		Package pack = PackageFactory.createPackage(Packagecode.BASIC);
		System.out.println(pack);

		Package pack1 = PackageFactory.createPackage(Packagecode.MIDDLE);
		System.out.println(pack1);
		
		Package pack2 = PackageFactory.createPackage(Packagecode.SPECIAL);
		System.out.println(pack2);
	}

}
