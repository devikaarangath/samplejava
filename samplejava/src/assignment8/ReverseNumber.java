package assignment8;

class ReverseNumber {
    private int number;

    public ReverseNumber() {
        System.out.println("Finding reverse");
    }

    public ReverseNumber(int a) {
        int reversed = 0;
        this.number = a;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        System.out.println( reversed);
    }

    public static void main(String[] args) {
    	ReverseNumber reverse = new ReverseNumber(12345);
    }
}

