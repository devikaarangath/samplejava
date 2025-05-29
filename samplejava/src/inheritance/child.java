package inheritance;

public class child extends parent {

	public static void main(String[] args) {
		child obj = new child();
		obj.display();
		obj.print();
		// TODO Auto-generated method stub

	}
	
	public void print()
	{
		System.out.println("This is child");
	}
}
