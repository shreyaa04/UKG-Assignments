package prblm4;

public class Student {
	private String name;
	private String id;
	private double grade;

	public Student(String name) {
		this.name = name;
	}

	Student(String name, String id) {
		this(name);
		this.id = id;
	}

	public Student(String name, String id, double grade) {
		this(name, id);
		this.grade = grade;
	}

	public void display() {
		if (this.name != "") {
			System.out.println("Name : " + this.name);
		}
		if (this.id != "") {
			System.out.println("Id : " + this.id);
		}
		if (this.grade != 0.0) {
			System.out.println("Grade : " + this.grade);
		}

	}

	public void display(int year) {
		display();
		System.out.println("Year = " + year);
	}

}
