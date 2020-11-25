package day24;

public class Demo11 {
	private String username;
	private String password;

	public Demo11(String username, String password) {
		this.username=username;
		this.password=password;
	}
		public void display() {
			System.out.println("username is"+username);
			System.out.println("password is"+password);
		}	
			public static void main(String[]args) {
				Demo11 obj=new Demo11("yubraj","ajay");
				obj.display();
				
				
		
			}
}
