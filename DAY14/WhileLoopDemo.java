package DAY14;
import java.util.Scanner;

public class WhileLoopDemo {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		System.out.println("enter a number:");
		int a=input.nextInt();
		
		int i= 1;
		while(i<=a) {
			System.out.println("i is :"+i);
			i++;
		}
	}

}
