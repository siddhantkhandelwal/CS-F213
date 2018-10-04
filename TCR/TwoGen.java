class TwoGen<T, V> {
	T obT;
	V obV;

	TwoGen(T obT, V obV){
		this.obT = obT;
		this.obV = obV;
	}

	void showTypes(){
		System.out.println("Type of T is: " + obT.getClass().getName());
		System.out.println("Type of V is: " + obV.getClass().getName());
	}

	T getObT() {
		return this.obT;
	}

	V getObV() {
		return this.obV;
	}
}