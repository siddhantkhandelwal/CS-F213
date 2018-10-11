import java.util.Scanner;

class Account {
	int acc;
	String name;
	float amount;

	void insert(int acc, String name, float amount) {
		this.acc = acc;
		this.name = name;
		this.amount = amount;
	}

	void display() {
		System.out.println(acc + " " + name + " " + amount);
	}
}

class ScannerClassDemo {
	public static void main(String[] args) {
		Account a = new Account();
		Scanner scr = new Scanner(System.in);

		System.out.println("Enter the account no.: ");
		int acc;
		acc = scr.nextInt();

		scr.nextLine();
		System.out.println("Enter the name");
		String name;
		name = scr.nextLine();
		
		System.out.println("Enter the amount");
		float amount;
		amount = scr.nextFloat();

		a.insert(acc, name, amount);
		a.display();
		scr.close();
	}
}