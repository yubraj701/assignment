package DAY14;
import java.util.Scanner;

public class MathTable {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number to print table:");
		int n=input.nextInt();
		
		for(int i=1; i<=10; i++) {
		   int t=n * i;
		System.out.println(n+"*"+ i +"="+t);
		
		

	}


}
	
}