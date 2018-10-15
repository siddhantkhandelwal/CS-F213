
public class Account {
	private long accNumber;
	private double balance;
	private String name;
	
	Account(long accNumber, double balance, String name) {
		this.accNumber = accNumber;
		this.balance = balance;
		this.name = name;
	}
	
	public long getaccNumber() {
		return this.accNumber;
	}
	
	public void setaccNumber(long accNumber) {
		this.accNumber = accNumber;
	}
	
	public double getbalance() {
		return this.balance;
	}
	
	public void setbalance(double balance) {
		this.balance = balance;
	}
	
	public String getname () {
		return this.name;
	}
	
	public void setname (String name) {
		this.name = name;
	}
}
