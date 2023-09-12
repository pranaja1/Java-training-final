import java.util.Scanner;

public class ReverseNumberAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.println("write number");
		 int i = scan.nextInt();
		 
		 
		 while (i != 0) {
			int x =  i % 10;
			x = 0*10+i;
			  i = i/10;
			  
			  System.out.println("reverse no:"+x);
		 }
		 
		 

	}

}
