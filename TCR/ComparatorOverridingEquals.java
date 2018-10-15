class Account implements Comparator<Account> {
	int acc;
	String name;
	float amt;

	Account(int acc, String name, float amt) {
		this.acc = acc;
		this.name = name;
		this.amt = amt;
	}

	public String toString() {
		return "Acc. no. " + acc + " Name: " + name + " Amount: " + amt;
	}

	public boolean equals(Account a1) {
		if (a1 == null)
			return false;
		if(this.acc != a1.acc)
			return false;
		if(this.amt != a1.amt)
			return false;
		if(!(a1.name.equals(this.name)))
			return false;
		return true;
	}
}