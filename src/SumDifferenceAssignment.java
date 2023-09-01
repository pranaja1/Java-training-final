import java.util.Scanner;

public class SumDifferenceAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("write no for i");
		System.out.println("write no for j");
		int i = scan.nextInt();
		int j = scan.nextInt();
		
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println((i+j)/2);
		if(i >= j) {
			System.out.println("maximum");}
		else {System.out.println("minimum");}
		if(j >= i) {
			System.out.println("maximum");}
		else {System.out.println("minimum");}
		}
		
		
		
		

	}


