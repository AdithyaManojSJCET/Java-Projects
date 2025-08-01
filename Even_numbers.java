import java.util.Scanner;
public class Even_numbers {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int n= sc.nextInt();
		
		System.out.println("Even Number till "+n);
		for(int i=2;i<n+1;i+=2) {
			System.out.print(i+"\t");
		}
		sc.close();
		
	}

}
