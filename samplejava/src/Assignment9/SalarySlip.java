package Assignment9;

import java.util.Scanner;

public class SalarySlip extends Calculation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SalarySlip obj = new SalarySlip();
        obj.generateSalarySlip();
	}

	private void generateSalarySlip() {
		// TODO Auto-generated method stub
		int result[] = this.getSalarydetails();
		int basicPay = result[0];
		int deductions = result[1];
		int bonus = result[2];
		double hra = this.calculateHra(basicPay);
		double pf = this.calculatePf(basicPay);
		double salary = basicPay + hra - pf - deductions + bonus;
		System.out.println("Salary Slip");
		System.out.println("Basic Pay: "+ basicPay);
		System.out.println("Bonus: "+ bonus);
		System.out.println("HRA: "+ hra);
		System.out.println("PF: "+ pf);
		System.out.println("In hand salary: "+ salary);
	}

}
