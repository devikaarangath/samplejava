package accessmodifiers;

public class classa {
	public void display() {
		System.out.println("public");
	}
	
	private void display1() {
		System.out.println("private");
	}
	
	protected void display2() {
		System.out.println("protected");
	}
	
	 void display3() {
		System.out.println("default");
	}
	 public static void main(String args[]) {
		 classa obj = new classa();
		 obj.display();
		 obj.display1();
		 obj.display2();
		 obj.display3();
	 }
	 
}


