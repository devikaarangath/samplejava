package assignment7;

public class Palindrome {

    public int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public boolean isPalindrome(int number) {
        int reversed = reverseNumber(number);
        if(number == reversed) {
            return true;
        } else {
        	return false;
        }
    }

    public static void main(String[] args) {
        Palindrome checker = new Palindrome();
        int number = 14241;
        if (checker.isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}