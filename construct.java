class Student{
	 int rollno;
	 String name;
	 String dept;
	 Student(){
		 System.out.println("First constructor initiated");
		 rollno=1;
		 name="test1";
		 dept="cse1";		 
	 }
	 Student(int rollno){
		 System.out.println("Second constructor initiated");
		 this.rollno=rollno;
}
	 Student(int rollno,String name){
		 System.out.println("Third constructor initiated");
		 this.rollno=rollno;
		 this.name=name;
	 }
public class construct {
	public static void main(String[]args) {
		
	}
}

}
