package DAY15;
import java.util.Scanner;

public class QuestionNumb29 {
	
	public static double Series(double val) {
		Scanner input=new Scanner(System.in);
		double r=0, f=1;        
	//r,f is variable, r=residual, f=factorial value
		for(int i=1; i<=val; i++) {
			f=f*i;
			double a = +(i/f);
			
		}
		return f;
		
 
	}
			public static void main(String[]args) {
				
						double val=8;
								
				
				System.out.println("the sum of the series is:"+val);
				
			}
		
		
	
	

}
