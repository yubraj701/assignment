package DAY15;
import java.util.Scanner;
public class QuestionSol36 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size of arr:");
		int size=input.nextInt();
		
		int[]arr=new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter a element:");
			arr[i]=input.nextInt();
		}	 
		
			System.out.println("duplicate element:");
			int count=0;
			for(int i=0; i <arr.length; i++) {
			for(int j=i+1;j<arr.length; j++) {
				
				if (arr[i]==arr[j]) {
					System.out.println(arr[j]+" ");
					count++;
				}
			}
					
					if(count==0) {
					System.out.println("no duplicate is found:");
			}
					
					
			}
					
					
					
				}
				
		
		
		
		
		

	}

		
	
