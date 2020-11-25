package DAY15;
import java.util.Scanner;
public class Question24 { 
	
       public static void main(String[]args) {
    	   Scanner input=new Scanner(System.in);
    	   System.out.println("enter a number:");
    	   int n=input.nextInt();
    	   
    	  int fact=1;
    	  
         for (int i=1; i<=n; i++) {
    		  
    		  fact=fact*i;
    		  System.out.println("factorial of numb"+fact);
    	  }
    	  
    	  
    	   
}
}