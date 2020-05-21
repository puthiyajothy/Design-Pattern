package designpattern.chainofresponsibility;

public class SDA extends Handler {

	@Override
	public double applyinterest(Account account) {

		account.setInterest(account.getInterest() + account.getAmount() * 0.03);
		System.out.println("SDA Calculated");

		if (account.getAmount() <= 100) {
			return account.getInterest();

		} else {
			return successor.applyinterest(account);
		}
	}

}
