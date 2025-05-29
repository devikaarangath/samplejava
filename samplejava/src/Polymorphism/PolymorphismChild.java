package Polymorphism;

public class PolymorphismChild extends PolymorphismParent{

	public void display()
	{
		super.display();  	//Method Overriding (super.parentClass Method is called here)
		System.out.println("Polymorphism");
	}

	public static void main(String[] args) {
		PolymorphismChild obj = new PolymorphismChild();
		obj.display();
	}

}
