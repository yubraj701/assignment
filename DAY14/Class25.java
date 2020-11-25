package DAY14;
import java.util.Scanner;

public class Class25 {
	public static void main(String[]args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter number of student:");
	int numStudent=input.nextInt();
	
	int maxScore=0;
	String studentName="";
	
	for(int i=1;i<=numStudent; i++) {
		System.out.println("enter a name of student:");
		String name=input.next();
		System.out.println("enter score of student:");
		int score=input.nextInt();
		if(score>maxScore) {
            maxScore=score;
            studentName=name;
		}
	
System.out.println("student name:"+studentName);
System.out.println("max score:"+maxScore);



}

	}
	
}