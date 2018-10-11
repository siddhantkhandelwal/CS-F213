import java.io.*;

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

class BufferedReaderExample {
	public static void main(String[] args) throws IOException {
		Account a = new Account();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the account no.: ");
		int acc;
		acc = Integer.parseInt(br.readLine());

		System.out.println("Enter the name: ");
		String name="";
		name = br.readLine();

		System.out.println("Enter the amount");
		float amount;
		amount = Float.parseFloat(br.readLine());

		a.insert(acc, name, amount);
		a.display();
	}
}