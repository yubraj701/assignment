package day32;

public class Demo2 {
public static void main(String[]args) {
	String s1="hello ";
	
	System.out.println(s1.concat("morning"));
	System.out.println(s1);// the string is immutable
	s1=s1.concat("morning");
	System.out.println(s1);

}
} 