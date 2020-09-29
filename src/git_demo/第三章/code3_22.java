package git_demo.第三章;

import java.util.Scanner;

public class code3_22 {
	public static void main(String[] args)
    {
        System.out.print("Enter a point with two coordinates: ");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        if(x*x+y*y>100)
            System.out.println("Point ("+x+", "+y+") is not in the circle");
        else
            System.out.println("Point ("+x+", "+y+") is in the circle");
    }
}
