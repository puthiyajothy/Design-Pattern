package designpattern.chainofresponsibility;

public class FCFDA extends Handler {

	@Override
	public double applyinterest(Account account) {
		account.setInterest(account.getInterest() + account.getAmount() * 0.5);
		System.out.println("FCFDA Calculated");
		return account.getInterest();

	}

}
