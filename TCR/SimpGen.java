class SimpGen {
	public static void main(String[] args) {
		TwoGen<Integer, String> tgObj = new TwoGen<Integer, String> (88, "Generics");
		tgObj.showTypes();

		int v = tgObj.getObT();
		System.out.println("Value: " + v);

		String str = tgObj.getObV();
		System.out.println("Value: " + str);
	}
}