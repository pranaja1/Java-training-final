import java.util.Scanner;

public class MonthAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Write your month no.");
		
		int monthnumber = scan.nextInt();
		int totaldays ;
		
		switch (monthnumber) {
		
		case 1:
			System.out.println("totaldays:" + 31);
			monthnumber = 1;
			break;
		case 2:
			System.out.println("totaldays:" + 29);
			monthnumber = 2;
			break;
		case 3:
			System.out.println("totaldays:" + 31);
			monthnumber = 3;
			break;
		case 4:
			System.out.println("totaldays:" + 30);
			monthnumber = 4;
			break;
		case 5:
			System.out.println("totaldays:" + 31);
			monthnumber = 5;
			break;
		case 6:
			System.out.println("totaldays:" + 30);
			monthnumber = 6;
			break;
		case 7:
			System.out.println("totaldays:" + 31);
			monthnumber = 7;
			break;
		case 8:
			System.out.println("totaldays:" + 31);
			monthnumber = 8;
			break;
		case 9:
			System.out.println("totaldays:" + 30);
			monthnumber = 9;
			break;
		case 10:
			System.out.println("totaldays:" + 31);
			monthnumber = 10;
			break;
		case 11:
			System.out.println("totaldays:" + 30);
			monthnumber = 11;
			break;
		case 12:
			System.out.println("totaldays:" + 31);
			monthnumber = 12;
			break;
		default:
			System.out.println("error");
			monthnumber = -1;
		
		}

	}

}
