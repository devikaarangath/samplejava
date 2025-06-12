package exceptionhandling;

public class exceptionhandling {
	public static void main(String[]args) {
		int s = 10;
		int b = 0;
		try {
			int c = s/b; //arithmetic exception
		} catch(ArithmeticException e) {
			b = 2;
			int d = s/b;
			System.out.println(d);
			System.out.println(e);
		} finally {
			b = 3;
			int d = s/b;
			System.out.println(d);
		}
	}
}


