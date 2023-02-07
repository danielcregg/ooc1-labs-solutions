package ie.atu.labs.lab10abstraction;

public abstract class Account {

	private String accNo;
	private float balance;

	public Account(String accNo, float balance) {
		this.accNo = accNo;
		this.balance =balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
}
