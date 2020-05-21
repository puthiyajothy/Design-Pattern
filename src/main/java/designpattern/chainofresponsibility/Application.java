package designpattern.chainofresponsibility;

public class Application {

	public static void main(String[] args) {

		SDA sda = new SDA();
		FDA fda = new FDA();
		FCFDA fcfda = new FCFDA();
		Interest interest = new Interest();

		interest.setSuccessor(sda);
		sda.setSuccessor(fda);
		fda.setSuccessor(fcfda);

		Account account = new Account(0001, 100.00);
		System.out.println(interest.applyinterest(account));

		Account account1 = new Account(0002, 5500.00);
		System.out.println(interest.applyinterest(account1));

		Account account3 = new Account(0003, 10000.00);
		System.out.println(interest.applyinterest(account3));
	}

}
