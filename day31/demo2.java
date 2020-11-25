package day31;

public class demo2 {
	public static void main(String[]args) {
		String s1="nepal";   // this way we can call a repeated variable
		
		String s2="nepal";
		String s3=new String("nepal");
		String s4=new String("nepal");// we cannot call the repeated variable by thia method
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s3==s4);
	}

}
