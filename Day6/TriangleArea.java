 package Day6;
import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter side a:");
		double a=input.nextDouble();
		System.out.println("entr side b:");
		double b=input.nextDouble();
		System.out.println("entr side c:");
		double c=input.nextDouble();
		
		double s=(a+b+c)/2;
		
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("area of traingle:"+area);
		
		input.close();
		
		
		

	}

}
