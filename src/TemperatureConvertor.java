import java.util.Scanner;

public class TemperatureConvertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Give your input in celcius");
		 double i = scan.nextDouble();
		 
		 double f = ((1.8*i)+ 32);
		 double k = (i + 273);
		 
		 System.out.println("Fahrenheit="+f);
		 System.out.println("Kelvin="+k);
		 

	}

}
