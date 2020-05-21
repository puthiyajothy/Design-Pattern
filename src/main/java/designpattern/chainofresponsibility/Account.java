package designpattern.chainofresponsibility;

public class Account {

	private Integer AccountNumber;
	private double Amount;
	private double Interest;

	protected void setInterest(double interest) {
		this.Interest = interest;

	}

	public Account(Integer accountNumber, double amount) {
		super();
		AccountNumber = accountNumber;
		Amount = amount;

	}

	public Integer getAccountNumber() {
		return AccountNumber;
	}

	public double getAmount() {
		return Amount;
	}

	public double getInterest() {
		return Interest;
	}

}
