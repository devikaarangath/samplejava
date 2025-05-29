package assignment8;

public class Factorial {

    public static void factorial(int number) {
    	int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial*i;
        }
        displayresult(number, factorial);
    }
    
    public static void displayresult(int number, int factorial) {
    	System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static void main(String[] args) {
        int number = 5;
        factorial(number);
    }
}