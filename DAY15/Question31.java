package DAY15;
import java.util.Scanner;
public class Question31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		  System.out.print("Enter the number of terms: ");
		  int n = input.nextInt();
		  int s = 0;                       
		  for (int i = 1; i <= n; i++) {
		   s = s * 10 + i;
		   System.out.print(s + " ");

	}

}
} 