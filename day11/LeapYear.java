package day11;
import java.util.Scanner;
public class LeapYear{
	public static void LeaapYear() {
		Scanner input =new Scanner(System.in);
		System.out.println("enter year:");
		double a=input.nextDouble();
		if (a%4==0) {
			System.out.println(a+"is a leap year");
			
		}else {
			System.out.println(a+"is not a leap year");
			
			LeaapYear();
			input.close();
			
		}
	} 
	
}