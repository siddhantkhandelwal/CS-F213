import java.io.*;
public class Exercise1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int sum = 0, num;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter 10 integers: ");
		for(int i=0;i<10;++i){
			num = Integer.parseInt(br.readLine());
			sum += num;
		}
		System.out.println("Sum is: " + sum);
	}
}
