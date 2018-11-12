package test_bank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BankIO {
	public static void readFile(String filename, Bank bank) {
		Scanner in;
		try {
			in = new Scanner(new File(filename));
			while(in.hasNext()) {
				bank.add(readAccount(in));
			}
		} catch	(FileNotFoundException exception) {
			System.out.println("\n*****ERROR*****: " + exception.getMessage()  + "\n");
		}
	}
	
	public static BankAccount readAccount(Scanner in) {
		int acc_no = in.nextInt();
		double balance = in.nextDouble();
		
		BankAccount newObject = new BankAccount(balance, acc_no);
		
		return newObject;
	}
}
