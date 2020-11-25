package day10;
import java.util.Scanner;

public class weeks {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a day in week:");
        char week=input.next().charAt(0);
        
        switch(week) {
        case 'a':
        	System.out.println("sunday");
        	break;
        case'b':
        	System.out.println("monday");
        	break;
        case'c':
        	System.out.println("tuesday");
        	default:
        		System.out.println("wrong entry:");
        
        		System.out.println("code exit:");
        		
        	
        }
        
   
	} 

}
