package day10;
import java.util.Scanner;
public class PrintingReverseValue {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=input.nextInt();
		
		
		int arr[]=new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=input.nextInt();
			System.out.println("enter the array element");
			
			System.out.println("print the reverse element in array:");
			
			
			for(int i1= arr.length-1; i1>=0; i1--) 
				{
				System.out.println(arr[i1]+"");
				
				
			}
		}
		
		
		
		
	}

	}


