package day10;
import java.util.Scanner;

public class days {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a days of week:");
		String week=input.next();
		
		switch(week) {
		case "+":
			System.out.println("sunday");
			break;
		case "-":
			System.out.println("monday");
			break; 
		case"/":
			System.out.println("tuesday");
			break;
		case"?":
			System.out.println("wednesday");
			break;
		case"=":
			System.out.println("thursday");
			break;
		case"%":
		System.out.println("friday");
		break;
		case"#":
			System.out.println("saturday");
			default:
			System.out.println("wrong entery");
			break;
			
			
			
				
			
		
		
		}
		
		

	}

}
