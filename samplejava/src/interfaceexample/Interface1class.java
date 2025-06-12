package interfaceexample;

public class Interface1class implements Interface1 {
	
	public static void main(String args[]) {
		Interface1class obj1 = new Interface1class();
		obj1.display();
		obj1.print();
	}
	
	public void display() {
		System.out.println("child display");
	}
	
	public void print() {
		System.out.println("print");
	}

}
