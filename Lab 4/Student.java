class Student {
 private Name name; // name of student
 private int age;// age of student

 /* Complete the Student class by adding proper constructor, accessor methods and
 by adding any other method which are required as per specification */
 // Write Your Code From Here

 Student(Name name, int age){
 	this.name = name;
 	this.age = age;
 }
 public String getName(){
 	return this.name.getName();
 }
 public String getFName(){
 	return this.name.getfname();
 }
 public String getMName(){
 	return this.name.getmname();
 }
 public String getLName(){
 	return this.name.getlname();
 }
 public int getAge(){
 	return this.age;
 }
 public void setName(Name name){
 	this.name = name;
 }
 public void setAge(int age){
 	this.age = age;
 }

 public String toString(){
 	return this.getName() + " - " + Integer.toString(this.getAge());
 }

}// End of Student class