package git_demo.第三章;

import java.util.Scanner;

public class code3_29 {
	public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();
        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();
        if(Math.pow((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2),0.5)<=Math.abs(r1-r2))
            System.out.println("circle2 is inside circle1");
        else if(Math.pow((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2),0.5)<=r1+r2)
            System.out.println("circle2 overlaps circle1");
        else
            System.out.println("circle2 does not overlap circle1");
    }
}
