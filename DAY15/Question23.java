package DAY15;
import java.util.Scanner;

public class Question23 {



    public static void main(String[] args) {
    	Scanner input=new Scanner(System.in);
       System.out.println("find the sum to nth number:");
       int n=input.nextInt();
       int sum=0;
      for(int i=1; i<=n; i++) { 
    	 
    	  System.out.println("sum of n numb:"+sum);
    	  sum=sum+i;
      }
    	  
    	 
      }
       
       
}