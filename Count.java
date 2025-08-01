package count;
class Student{
	String name;
	int rollNumber;
	static int studentCount=0;
	Student(String name, int rollNumber){
		this.name=name;
		this.rollNumber=rollNumber;
		studentCount++;
	}
	public static void displayStudentCount() {
		System.out.println(studentCount);
	}
	public void printDetails() {
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollNumber);
	}
}

public class Count {
	public static void main(String[] args){
		Student s1 = new Student("Adithya",06);
		s1.printDetails();
		
		Student s2 = new Student("Job",39);
		s2.printDetails();

		Student s3 = new Student("Joseph",42);
		s3.printDetails();
		Student.displayStudentCount();
	}
}
