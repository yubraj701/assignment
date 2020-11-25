package day24;

public class ThisDemo {
	private String name;
	private int age;
	
	public void assignValue(String name, int age) {
		this.name=name;
		this.age=age;
	
	 
		
	}
		public void display() {
			System.out.println("name is"+ name);
			System.out.println("age is"+ age);
		}
			public static void main(String[]args) {
				ThisDemo obj=new ThisDemo();
				obj.assignValue("ram", 2);
				obj.display();

				
			
		}
			 
				
			}
		
	


