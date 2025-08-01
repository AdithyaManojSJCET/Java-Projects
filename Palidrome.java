import java.util.Scanner;
public class Palidrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int num= sc.nextInt();
		int temp=num;
		int rev=0,reminder;
		
		
		while(temp>0) {
			reminder=temp%10;
			rev=rev*10 + reminder;
			temp=temp/10;
		}
		if (rev==num) {
			System.out.println("It's a palindrome");
		}
		else {
			System.out.println("It's not a Palindrome");
		}
		sc.close();
	}
}
