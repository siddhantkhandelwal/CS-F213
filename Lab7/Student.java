
public class Student {
	private String name;
	private String gender;
	private int age;
	
	public Student(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name + " " + this.gender + " " + this.age;
	}
}
