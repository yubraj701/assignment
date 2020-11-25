package day10;
import java.util.Scanner;

public class PrintingDuplicate {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=input.nextInt();
		
		int[]numb=new int[num];
		
	for(int i=0; i<numb.length; i++) {
		System.out.println("enter a value:");
		numb[i]=input.nextInt();
		
		{
			
		}
		System.out.println("print the duplicate value:");
		for(int i1 =0; i1<numb.length; i1++) {	
			for( int j=i1+1; j<numb.length; j++) {
				if(numb[i1]==numb[j]) {
				
					System.out.println("print num[j]"+"");
				}
				
			}
		}
		
	}
		
		

	}

}
