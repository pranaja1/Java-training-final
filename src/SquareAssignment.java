import java.util.Scanner;

public class SquareAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Write your number:");
		 
		int i = scan.nextInt();
		int j = i*i;
		int k = i*i*i;
		int l = i*i*i*i;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
	}

}
