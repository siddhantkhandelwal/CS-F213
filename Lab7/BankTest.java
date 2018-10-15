public class BankTest {

	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.addAccount( new Account( 1000, 5000, "abc"));
		b1.addAccount( new Account( 1001, 72000, "def"));
		b1.addAccount( new Account( 1002, 42000, "fgh"));
		b1.addAccount( new Account( 1003, 1000, "hij"));
		
		System.out.println(b1);
		
		b1.deposit( 1002, 4600);
		b1.withdraw(1001, 2000);
		b1.removeAccount(1003);
		
		System.out.println(b1);
	}

}