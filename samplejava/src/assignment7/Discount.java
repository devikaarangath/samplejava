package assignment7;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = calculateTotal(1500, 2500, 2800);
		double finalamount = checkDiscount(total);
		System.out.println("The final bill is: "+finalamount);
	}
	
	public static int calculateTotal(int a, int b, int c) {
		return a+b+c;
	}
	
	public static double checkDiscount(int amount) {
		if(amount>5000) {
			return amount * 0.8;
		} else {
			return amount;
		}
	}
}
