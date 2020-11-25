package DAY15;
import java.util.Scanner;

public class QuestionSol40 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a name:");
		String name=input.next();
		
	StringBuilder sb=new StringBuilder(name);
	sb.reverse();
	System.out.println(sb);
	

	}

}
