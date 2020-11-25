 package Day4;
import java.util.Scanner;
public class RectangleArea {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("enter length:");
		double l= input.nextDouble();
		System.out.println("enter breadth:");
		double b= input.nextDouble();
		double area=l*b;
		
		System.out.println("area of rectangle:"+area);

	}

}
