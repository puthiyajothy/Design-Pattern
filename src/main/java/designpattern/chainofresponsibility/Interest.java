package designpattern.chainofresponsibility;

public class Interest extends Handler {

	@Override
	public double applyinterest(Account account) {
		return successor.applyinterest(account);
	}

}
