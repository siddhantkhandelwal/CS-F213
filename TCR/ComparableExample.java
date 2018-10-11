import java.util.*;
class Account implements Comparable<Account> {
	int acc;
	String name;
	float amt;

	Account(int acc, String name, float amt) {
		this.acc = acc;
		this.name = name;
		this.amt = amt;
	}

	public int compareTo(Account ac) {
		if(amt == ac.amt) {
			return 0;
		}

		else if(amt>ac.amt) {
			return 1;
		}

		else {
			return -1;
		}
	}

	public String toString() {
		return "Acc. no. " + acc + " Name: " + name + " Amount: " + amt;
	}
}

class ComparableExample {
	public static void main(String[] args) {
		List<Account> al = new ArrayList<Account>();
		al.add(new Account(111, "Ankit", 5000));
		al.add(new Account(131, "YetAnotherAnkit", 500000));
		al.add(new Account(121, "AnotherAnkit", 50000));
		Collections.sort(al);

		for(Account a:al){
			System.out.println(a);
		}
	}
}