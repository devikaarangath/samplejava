package Abstraction;

public class abstractchildclass extends abstractionparent {
	public void show() {
		System.out.println("child class");
	}

	public static void main(String[] args) {
		//abstractchildclass obj = new abstractchildclass();
		//obj.display();
		//obj.print();
	  //	obj.show();
		//reference creration
		abstractchildclass obj = new abstractchildclass();//reference creation
		obj.display();
		obj.print();
	}
	
		public void display() {
			System.out.println("java");
		}
		public void print() {
			System.out.println("class");
		// TODO Auto-generated method stub
		}

}
