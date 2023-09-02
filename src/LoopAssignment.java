import java.util.Scanner;

public class LoopAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while (true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Number");
		
		int number = scan.nextInt();
		int sum = 0;
		
		while (number != 0) {
			sum = sum + number%10 ;
			number = number/10 ;
		}
		System.out.println("Sum of number:"+ sum);
		

	} }

}
