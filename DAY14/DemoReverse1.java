package DAY14;
import java.util.Scanner;
public class DemoReverse1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number:");
		int originalNumber=input.nextInt();
		
		int reverseNumber=0;
		System.out.println("Original number:"+originalNumber);
		while(originalNumber!=0) {
			int temp=originalNumber%10;
			reverseNumber= reverseNumber*10+temp;
			originalNumber=originalNumber/10;
		}
		
System.out.println("Reverse number is:"+reverseNumber);
	}

}
