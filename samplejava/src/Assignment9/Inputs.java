package Assignment9;

import java.util.Scanner;

public class Inputs {
	
	int basicPay,deduction,bonus;

	public int[] getSalarydetails() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter basic pay");
        this.basicPay = s.nextInt();
        System.out.println("Enter deduction");
        this.deduction = s.nextInt();
        System.out.println("Enter bonus");
        this.bonus = s.nextInt();
        int result[] = {this.basicPay,this.deduction,this.bonus};
        return result;
	}
}
