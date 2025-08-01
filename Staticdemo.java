class Studentt{
	String name;
	static int studentcount=0;
	Studentt(String name){
		this.name=name;
		studentcount++;
	
	}
	public void printDetails() {
		System.out.println(name);
		System.out.println(studentcount);
	}
}

public class Staticdemo {
	public static void main(String[]args) {
		Studentt s1=new Studentt("Adithya Manoj");
		s1.printDetails();
	}
}