import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class TextFileOutputDemo {
	public static void main(String[] args) {
		PrintWriter outStream = null;
		
		try{
			outStream = new PrintWriter(new FileOutputStream("demoTextFile.txt", true));
			outStream.println("Now, Appending the same content.");
			outStream.println("This is a dummy sentence.");
			outStream.println("This is a another dummy sentence.");
		}

		catch(IOException e){
			System.err.println(e.getMessage());
			System.exit(0);
		}

		finally{
			outStream.close();
		}
	}
}