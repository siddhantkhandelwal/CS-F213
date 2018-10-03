class StudentList {
	public static Student[] list = new Student[10]; // list of students
	public static int count = 0; // count of students added in the list
	public static void addStudent(Student std) {
		if(count>= 20) 
			return; // if count is already 20 or more then return
		list[count] = std;
		count++;
	}

	public static Student[] getStudentsWithAge(int age) {
	/* This method returns all the students whose age is equal to age
	parameter of this method. If no such student is found then it
	returns null. */
	// Write Your Code From Here
		Student[] studentsWithGivenAge = new Student[count]; 
		int counter = 0;
		for(int i=0;i<list.length;i++){
			if(list[i].getAge() == age){
				studentsWithGivenAge[counter] = list[i];
				counter++;
			}	
		}
		if(counter==0){
			return null;
		}
		return studentsWithGivenAge;
	}

	public static Student[] getStudentsWithLastName(String lastName) {
	/* This method returns all the students whose last name attribute
	value matches with lastName parameter of this method. If no such
	students is found then it returns null. */
	// Write Your Code From Here
		Student[] studentsWithGivenLastName = new Student[count]; 
		int counter = 0;
		for(int i=0;i<list.length;i++){
			if(list[i].getLName().equals(lastName)){
				studentsWithGivenLastName[counter] = list[i];
				counter++;
			}	
		}
		if(counter==0){
			return null;
		}
		return studentsWithGivenLastName;
	}		

	public static Student[] getStudentsInRange(int minAge, int maxAge) {
	/* This method returns all the students whose age falls between minAge
	and maxAge (both parameters inclusive) */
	// Write Your Code From Here
		Student[] studentsBetweenGivenAges = new Student[count]; 
		int counter = 0;
		for(int i=0;i<list.length;i++){
			if(list[i].getAge()<=maxAge && list[i].getAge()>=minAge){
				studentsBetweenGivenAges[counter] = list[i];
				counter++;
			}	
		}
		if(counter==0){
			return null;
		}
		return studentsBetweenGivenAges;
	}
}

// End of class StudentList