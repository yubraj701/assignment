package day10;
import java.util.Scanner;

public class PrintFactorial {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=input.nextInt();
		int fact=1;
		for(int i=1; i<=n;i++) {
			fact=fact*i;
			System.out.println("factorial of given number:"+fact);
	}
		
		

	}

}
