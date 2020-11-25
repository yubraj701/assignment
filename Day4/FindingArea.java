 package Day4;
import java.util.Scanner;

public class FindingArea {
	public static void main(String[]args) {
		final double PI=3.14;
		Scanner input=new Scanner(System.in);
		System.out.println("enter radius:");
		double r=input.nextDouble();
		 double circle=PI*Math.pow(r, 2);
		
		System.out.println("area of circle:"+ circle);
		
		
		
		
	}

}
