package day10;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a numb a:");
				
		int b=input.nextInt();
		
		if(b%2==0) {
			System.out.println(b+"is a even number:");
		}else {
			System.out.println(b+"is a odd number:");
				
		}
		

	}

}
 