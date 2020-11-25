package DAY15;
import java.util.Scanner;

public class Question32 {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number array:");
		int n=input.nextInt();
		
		
		int sum=0;
		int []arr=new int[5];
		for (int i=0; i<5; i++) {
			System.out.println("enter a number");
			arr[i]=input.nextInt();
			sum=sum+arr[i];
			
			System.out.println("sum of arr:"+sum);
		}
		
	}

} 
