 package Day6;
import java.util.Scanner;
public class FormulaDem {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("enter number u:");
		int u=input.nextInt();
		System.out.println("enter number t:");
		int t=input.nextInt();
		System.out.println("enter number a:");
		int a=input.nextInt();
		
		
		double area=u*t+0.5*a*Math.pow(t, 2);
		System.out.println("distance covered:"+area);
		

	}

}
