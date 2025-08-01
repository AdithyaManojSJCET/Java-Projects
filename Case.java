import java.util.Scanner;
public class Case {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your grade: ");
		String grade=sc.nextLine();
		
		String result= switch (grade) {
		case "O" -> "Outstanding";
		case "A+" -> "Excellent performance";
		case "A" -> "Very Good";
		case "B+" -> "Good";
		case "B" -> "Above Average";
		case "C" -> "Average";
		case "P" -> "Pass!";
		case "F" -> "Fail..";
		default -> "Invalid Input.";
		};
		System.out.println("Grade= "+grade);
		System.out.println("Result= "+result);
		
	}
	

}
