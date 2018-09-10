class Name {
 private String fname; // First Name
 private String mname; // Middle Name
 private String lname; // Last Name
 // provide accessor methods as per the given specification
 	public String getfname(){
 		return fname;
 	}
 	public String getmname(){
 		return mname;
 	}
 	public String getlname(){
 		return lname;
 	}
 // provide implementation for getName() method as per the given
 // specification
 	public String getName(){
 		return fname + ' ' + mname + ' ' + lname;
 	}
 Name(String name) {
 /* Complete the constructor by extracting the values of three name
 fields. Note that name value may be either comma separated or
 semicolon separated */
 // Write Your Code Here
	 if(name.indexOf(';')==-1){
		 String nameArray[] = name.split(",", 3);
		 fname = nameArray[0];
		 mname = nameArray[1];
		 lname = nameArray[2];
	 }
	 else{
		 String nameArray[] = name.split(";", 3);
		 fname = nameArray[2];
		 mname = nameArray[1];
		 lname = nameArray[0];
	 }
	 
 }
} // End of class Name.