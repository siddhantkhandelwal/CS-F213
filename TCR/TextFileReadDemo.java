import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class TextFileReadDemo {
	public static void main(String[] args) {
		System.out.println("I will read three numbers and a line");
		System.out.println("of text from the file morestuff.txt");

		Scanner inputStream = null;

		try {
			inputStream = new Scanner(new FileInputStream("morestuff.txt"));
			int n1 = inputStream.nextInt();
			int n2 = inputStream.nextInt();
			int n3 = inputStream.nextInt();

			inputStream.nextLine();

			String line = inputStream.nextLine();

			System.out.println("The three numbers found are: ");
			System.out.println("n1: " + n1 + " n2: " + n2 + " n3: " + n3);
			System.out.println("The line read is: ");
			System.out.println(line);
		}

		catch(IOException e) {
			System.err.println(e.getMessage());
		}

		finally {
			inputStream.close();
		}
	}
}