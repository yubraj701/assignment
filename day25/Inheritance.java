package day25;

public class Inheritance {
	public static void main(String[]args) {
		Parent obj=new Parent();
		System.out.println(obj.name);
		obj.sayHello();
		
		
		
		System.out.println("=================");
		Child obj2=new Child();
		System.out.println(obj2.name);
		obj2.sayHello();
	}

}
 