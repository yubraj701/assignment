package Day8;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a year;");
		double year= input.nextDouble();
		
		if (year % 4 == 0) 
	         System.out.println("Specified year is a leap year");
	      else
	         System.out.println("Specified year is not a leap year");
		
				
		

	}

}   
