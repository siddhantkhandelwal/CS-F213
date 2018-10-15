class Student implements {
	String name;
	double cgpa;
}

class cmpCGPA implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		if(s1.cgpa == s2.cgpa) {
			if(s1.name.compareTo(s2.name)) {
				return 1;
			}

			else if(s1.name.equals(s2.name)) {
				return 0;
			}

			else {
				return -1;
			}
		}

		else if(s1.cgpa > s2.cgpa) {
			return 1;
		}

		else {
			return -1;
		}
	}
}