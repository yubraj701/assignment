package day11;
import java.util.Scanner;

public class UserMethos {
	public static void EvenorOdd() {
   
		Scanner input =new Scanner(System.in);
    
		System.out.println("enter even number:");
		int a= input.nextInt();
	
		if(a%2==0) {
			System.out.println(a+"is a even number");
	 }else {
		
		System.out.println("is a odd number:"); }  
	}
		public static void main(String[]args) {
	EvenorOdd();
	}


} 
