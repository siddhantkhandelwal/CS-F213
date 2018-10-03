package oop.eclipse.ide.first;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int terma = 1;
		int termb = 1;
		double outerSum = 0;
		System.out.println(terma);
		System.out.println(termb);
		for(int i=0;i<Integer.parseInt(args[0])-2; i++){
			int sum = terma + termb;
			terma = termb;
			termb = sum;
			System.out.println(sum);
			outerSum += sum;
		}
		System.out.println(outerSum/Integer.parseInt(args[0]));
	}

}
