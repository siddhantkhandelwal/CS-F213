import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int sum = 0, num;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 10 integers: ");
		for(int i=0;i<10;++i){
			num = in.nextInt();
			sum += num;
		}
		System.out.println("Sum is: " + sum);
	}
}
