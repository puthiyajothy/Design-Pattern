package designpattern.chainofresponsibility;

public class FDA extends Handler {

	@Override
	public double applyinterest(Account account) {

		account.setInterest(account.getInterest() + account.getAmount() * 0.04);
		System.out.println("FDA Calculated");

		if (account.getAmount() > 100 && account.getAmount() <= 5000) {
			return account.getInterest();

		} else {
			return successor.applyinterest(account);
		}
	}

}
