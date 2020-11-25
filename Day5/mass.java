package Day5;
import java.util.Scanner;
public class mass {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("mass of object kg");
		double Kg=input.nextDouble();
				/* Convert Kg into pound*/
				
		double P=2.2*Kg;
	     System.out.println("enter mass in kg"+Kg+"is pound");
	     
	     System.out.println("mass in pound");
	     double P1 = input.nextDouble();
	     /* convert pound into mass*/
	     
	     
	     Double Kg1=(0.454/P1);
	     System.out.println("enter mass in kg"+Kg1);
	     

	}

}
 