class BoundsDemo {
	public static void main(String[] args) {
		Integer inums[] = {1, 2, 3, 4, 5};
		Stats<Integer> iob = new Stats<Integer> (inums);
		double v = iob.average();
		System.out.println("iob average is: " + v);
	}
}