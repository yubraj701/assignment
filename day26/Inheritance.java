package day26;

public class Inheritance {
	
	Sub obj=new Sub();
	public static void main(String[]args) {
		Sub obj=new Sub();
		System.out.println(obj.name);
		// this is hidden method
		obj.greet();
		// this is over ridden method
		
		
	} 
	

}
