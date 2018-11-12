package test_bank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BankFileTester {
	public static void main(String[] args) {

		// TODO Auto-generated constructor stub
		Scanner in;
		int count = 0;
		try {
			in = new Scanner(new File("accounts.txt"));
			while(in.hasNext()) {
				count++;
			}
			Bank bank = new Bank(count);
			BankIO.readFile("accounts.txt", bank);
			
		}catch (FileNotFoundException e) {
			System.out.println("\n*****ERROR*****: " + e.getMessage()  + "\n");
		}
	}
}
