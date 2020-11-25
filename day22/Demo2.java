package day22;

public class Demo2 {
	String name;
	int age;
	
	public static void main(String[]args) {
		Demo2 obj=new Demo2();
		obj.name="ram";
		obj.age=22;
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		System.out.println("============================");
		
		Demo2 obj2=new Demo2();
		obj2.name="shyam";
		obj2.age=33;
		System.out.println(obj2.name);
		System.out.println(obj2.age);
	}

}
