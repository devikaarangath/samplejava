package assignment6;

public class MathodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate obj = new Calculate();
		int result = obj.average(100, 90, 80);
		System.out.println("Average of integer number is: "+ result);
		float result2 = obj.average(100f, 70f, 80f);
		System.out.println("Average of floating number is: "+ result2);
		int area1 = obj.area(10, 20);
		System.out.println("Area of rectangle is: "+ area1);
		int area2 = obj.area(10);
		System.out.println("Area of square is: "+ area2);
		double area3 = obj.area(10f);
		System.out.println("Area of square is: "+ area3);
	}
}
 class Calculate{
	 public int average(int a, int b, int c) {
			int result = (a+b+c)/3;
			return result;
		}
		
		public float average(float a, float b, float c) {
			float result = (a+b+c)/3;
			return result;
		}
		
		public int area(int length, int breadth) {
			int result = length*breadth;
			return result;
		}
		
		public int area(int side) {
			int result = side*side;
			return result;
		}
		
		public double area(float radius) {
			double result = 3.14*radius*radius;
			return result;
		}
 }
