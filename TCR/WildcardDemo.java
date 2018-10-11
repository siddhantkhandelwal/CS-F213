class WildcardDemo {
	public static void main(String[] args) {
		Integer inums[] = {1, 2, 3, 4, 5};
		Stats<Integer> iob = new Stats<Integer>(inums);
		double v = iob.average();
		System.out.println("iob average is " + v);

		Float fnums[] = {1.0F, 2.5F, 3.6F, 4.8F, 5.9F};
		Stats<Float> fob = new Stats<Float>(fnums);
		v = fob.average();
		System.out.println("fob average is " + v);

		Double dnums[] = {1.2, 2.5, 3.7, 4.6, 5.1};
		Stats<Double> dob = new Stats<Double>(dnums);
		v = dob.average();
		System.out.println("dob average is " + v);

		if(iob.sameAvg(dob)) {
			System.out.println("Averages of iob and dob are same.");
		}
		else {
			System.out.println("Averages of iob and dob are not same.")	;
		}

		if(dob.sameAvg(fob)) {
			System.out.println("Averages of fob and dob are same.");
		}
		else {
			System.out.println("Averages of fob and dob are not same.")	;
		}
	}
}