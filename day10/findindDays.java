package day10;
import java.util.Scanner;

public class findindDays {
public static void main(String[]main) {
	Scanner input= new Scanner(System.in);
	
	System.out.println("enter a week:");
	
	int week =input.nextInt();
	
	switch(week) {
	case 1:
		System.out.println("sunday");
		break;
	case 2:
		System.out.println("monday");
		break;
	case 3:
		System.out.println("tuesday");
	break;
	case 4:
		System.out.println("wednesday:");
		break;
	case 5:
		System.out.println("thursday:");
		break;
	case 6:
		System.out.println("friday:");
		break;
	case 7:
		System.out.println("saturday:");
		default:
			System.out.println("wrong choice:");
			break;
		
			
			
			
		
		
	
}
}
} 