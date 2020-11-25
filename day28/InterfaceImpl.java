package day28;

public class InterfaceImpl extends Demo1 implements InterfaceDemo1, InterfaceDemo3{

	@Override
	public void m1() {
		System.out.println("hey my name is prakash");
		
	}

	@Override
	public void m2() {
		System.out.println("hey my name is yubraj");
		
	}

	@Override
	public void m3() {
		System.out.println("hey my name is ajay"); 
		
	}

	@Override
	public void m4() {
		System.out.println("hey my name is raju");
		
	}

}
/* interface can implements as many as interface but it can only extends one class*/