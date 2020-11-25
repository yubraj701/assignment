package day29;
import java.util.Scanner;

public class AccountTest {
	
	public static void open(Account account) {
		account.openAccount();
	}
	
	public static void main(String[]args) {
		Account account =null;
	Scanner input=new Scanner(System.in);
	System.out.println("Which account do you want to open?");
	String choice=input.next();
	switch (choice) {
case "Saving": 
	account= new SavingAccount();
	break;

	
case "Current":
	account= new CurrentAccount(); 
	break;

     default:
	System.out.println("wrong choice!!!!!");
	break;

}
	if(account!=null) {
		AccountTest.open(account);
	}
	}
}

