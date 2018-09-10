class Address {
 private String line1; // First Name
 private String line2; // Middle Name
 private String line3;// Last Name
 private char[] city;
 private char[] state;
 private String pin;

 public String getline1(){
	 return line1;
 }
 public String getline2(){
	 return line2;
 }
 public String getline3(){
	 return line3;
 }
 public String getcity(){
	 return city.toString();
 }
 public String getstate(){
	 return state.toString();
 }
 public String getpin(){
	 return pin;
 }
 Address(String address) {
 	 	 String addressArray[] = address.split("$", 6);
		 line1 = addressArray[0];
		 line2 = addressArray[1];
		 line3 = addressArray[2];
		 city = addressArray[3].toCharArray();
		 state = addressArray[4].toCharArray();
		 pin = addressArray[5];
 }
}