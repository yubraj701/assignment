package Day6;
import java.util.Scanner;

public class QuadricEquation {
public static void main(String[]main) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter numb a:");
	int a=input.nextInt();
	System.out.println("enter numb b");
	int b=input.nextInt();
	System.out.println("enter numb c:");
	int c=input.nextInt();
      
	double x=((-b+Math.sqrt(b*b-4*a*c)/2*a));
	
	System.out.println("quadric value is:"+x);
	
	
	
	
}
	
	
	
}

 
