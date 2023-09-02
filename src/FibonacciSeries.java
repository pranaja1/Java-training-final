import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.println("Write your count");
		int count = scan.nextInt();
		int a = 0;
		int b = 1;
		int c ;
		
		for(int i=1;i<=count;i++) {
			
			System.out.println(a+"");
			
			c= a+b;
			a=b;
			b=c;
		
		}
		
		
			
		}
		
	

	
}
