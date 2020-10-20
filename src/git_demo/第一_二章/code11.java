package git_demo.第一_二章;

import java.util.Scanner;

public class code11 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a purchase amount: ");
		double purchaseAmount = input.nextDouble();
		double tax = purchaseAmount * 0.06;
		
		System.out.println("Sales tax is $"+(int)(tax*100)/100.00);

	}
}
