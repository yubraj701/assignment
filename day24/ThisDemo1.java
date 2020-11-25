package day24;

public class ThisDemo1 {
	int a=6;
	public void show() {
		//instance variable
		
		
		System.out.println(a);
	// local variable
		int a=5;
		System.out.println(a);
		int sum=a+this.a;
		System.out.println("sum is"+sum);
		
	}
		public static void main(String[]args) {
			ThisDemo1 obj1=new ThisDemo1();
			obj1.show();
			
			
			
			
		}
	}


