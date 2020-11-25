 package Day5;
import java.util.Scanner;

public class tempConversion {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter temperature in celcius:");
		double C=input.nextDouble();
		
		/*convert Celsius tp Fahrenheit*/
		
		double F= C *(9f/5)+32;
		
		System.out.println(C+"degree celsius"+F+"degree fahrenheit");
		

		}

}
