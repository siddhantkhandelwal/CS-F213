package oop.eclipse.ide.first;

public class HarmonicSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxDenominator = 50000;
		double sumL2R = 0.0;
		double sumR2L = 0.0;
		
		for(int denominator = 1; denominator<=maxDenominator; denominator++){
			sumL2R += 1/(double)denominator;
		}
		for(int denominator = maxDenominator; denominator>=1; denominator--){
			sumR2L += 1/(double)denominator;
		}
		double difference = sumL2R - sumR2L;
		System.out.println("Difference is: " + difference);
	}
}
