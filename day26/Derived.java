package day26;

public class Derived extends Base {
	
	public Derived() {
		super();
	System.out.println("child's default");
	}
	
	String name="Child's name"; 
	public void greet() {
        
        System.out.println(super.name);
		
		super.greet();
	}

}
// this is how the default is made by the compiler in this package
// we can overload the method