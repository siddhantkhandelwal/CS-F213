class GenDemo {
	public static void main(String[] args){
		Gen<Integer> iOb;
		iOb = new Gen<Integer>(88);
		iOb.showType();
		int v = iOb.getOb();
		System.out.println("Value: " + v);
		System.out.println();

		Gen<String> strOb = new Gen<String> ("Generics Test");
		strOb.showType();
		String str = strOb.getOb();
		System.out.println("Value: " + str);
	}
}