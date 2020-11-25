package day23;

public class Student1 {
	private String username;
	private String password;

	public Student1( String u, String p) {
		username=u;
		password=p;
	}
		public void display() {
			System.out.println("username is"+username);
			System.out.println("password is"+password);
		}
			public static void main(String[]args) {
		 Student1 obj= new Student1("yubraj","bhandari");
			obj.display();
		}
		
	}


