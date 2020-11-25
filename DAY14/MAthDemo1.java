package DAY14;
import java.util.Scanner;

public class MAthDemo1 {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a n:");
		int n=input.nextInt();
		int sum=0;
		
		for(int i =1; i<=n; i++) {
			sum=sum+i;
			
			System.out.println("sum of the nth number:"+sum);
		}
			
	}
	


}