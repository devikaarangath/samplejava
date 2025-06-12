package interfaceexample;

public class Multiplechildclass implements Multiple1, Multiple2 {
	public static void main(String args[]) {
		Multiplechildclass obj = new Multiplechildclass();
		obj.print();
		obj.display();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("child print");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("child display");
	}
	

}
