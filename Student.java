class Student {
	String index;
	String firstName;
	String lastName;
	int grades[];

	//TODO constructor

	public Student(String index, String firstName, String lastName, int[] grades) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}

	public Student() {
	}

	//TODO seters & getters

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public double getAverage() {
		//TODO
		int suma = 0;
		for (int i = 0; i < this.grades.length; i++) {
			suma += this.grades[i];
		}
		return suma / grades.length;
	}

	public int ECTSCredits() {
		//TODO
		return 6 * this.grades.length;
	}
}