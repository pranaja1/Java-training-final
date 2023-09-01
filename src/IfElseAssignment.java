import java.util.Scanner;

public class IfElseAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Write the number");
		
		int i = scan.nextInt();
		
		if( i < 0) {
			System.out.println("Number is Nigative");
		}
		else{
			System.out.println("Number is Positive");
		}
		

	}

}
