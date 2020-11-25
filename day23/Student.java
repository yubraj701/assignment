package day23;

public class Student {
	private String name;
	private int roll;
	
	public void assignValue(String n, int r) {
		name=n;
		roll=r;
	}
		public void displayInfo() {
			System.out.println("name is:"+name);
			System.out.println("roll is:"+roll);
		}	
			public static void main(String[]args) {
				Student user=new Student();
				user.assignValue("ram",23);
				user.displayInfo();
				
			
		}
	}
	
	


