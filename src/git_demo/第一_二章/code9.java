package git_demo.第一_二章;

import java.util.Scanner;

public class code9 {
public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		double celsius=(5.0/9)*(fahrenheit-32);
		System.out.println("Fahrenheit "+fahrenheit+" is "+celsius+" in Celsius");

	}
}
