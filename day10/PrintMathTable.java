package day10;
import java.util.Scanner;

public class PrintMathTable {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("print a math table:");
		int n=input.nextInt();
	
		for(int i=1; i<=20;i++) {
			int table=n*i;
			System.out.println(n+"*"+i+"="+table);
			
			
		}
		

	}

}
