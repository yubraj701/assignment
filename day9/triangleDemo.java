package day9;
import java.util.Scanner;

public class triangleDemo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a side A:");
		int sideA= input.nextInt();
		System.out.println("enter side B:");
		int sideB= input.nextInt();
        System.out.println("enter side C:");
        int sideC= input.nextInt();
        
		if((sideA==sideB) && (sideA==sideC)) {
			System.out.println("given triangle is equilatera");
		}else if((sideA==sideB)||(sideA==sideC)||(sideB==sideC)) {
			System.out.println("given triangle is issoseles");
		}else {
			System.out.println("given triangle is scale:");
			
			if((sideA+sideB<sideC)||(sideA+sideC<sideB)||(sideB+sideC<sideA)){
				System.out.println("given triangle is invilad:");
			}else if((sideA<0)||(sideB<0)||(sideC<0)){
				System.out.println("given is triangle is not valid");
				
				
			}
		}
		
		

	} 

}
