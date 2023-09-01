import java.util.Scanner;

public class IfElseAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner (System.in);
//		System.out.println("Write the number");
//		
//		int i = scan.nextInt();
//		
//		if( i < 0) {
//			System.out.println("Number is Nigative");
//		}
//		else{
//			System.out.println("Number is Positive");
//		}
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Write value for x");
		int x = scan.nextInt();
		
		System.out.println("Write value for y");
		int y = scan.nextInt();
		
		System.out.println("Write value for z");
		int z = scan.nextInt();
		
		if(x>y && x>z) {
			System.out.println("This is gretest numbure:"+x);
		} else if (y>z) {System.out.println("This is gretest numbure:"+y);
		} else {System.out.println("This is gretest numbure:"+z);
		
		}
		
		
		
		
		

	}

}
