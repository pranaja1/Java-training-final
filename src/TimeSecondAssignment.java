 import java.util.Scanner;

public class TimeSecondAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Input Seconds");
		 
		 int Second = scan.nextInt();
		 
		 int S = Second % 60;
		 
		 System.out.println(S);
		 int H = Second / 60;
	        int M = H % 60;
	        H = H / 60;
	        System.out.print( H + ":" + M + ":" + S);
			
		 
		 
		 

	}

}
