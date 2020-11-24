package git_demo.第十一章课后题;

import java.util.Scanner;

public class code11_15 {
	public static void main(String[] args) {

		polygon polygon = new polygon();
		int pointNum = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of the points：");
		pointNum = in.nextInt();
		System.out.println("Enter the coordinates of the points:");
		for (int i = 0; i < pointNum; i++) {
			//System.out.println("第" + i + "个顶点的横坐标:");
			double x = in.nextDouble();
			//System.out.println("第" + i + "个顶点的纵坐标:");
			double y = in.nextDouble();
			MyPoint p1 = new MyPoint(x, y);
			polygon.setPoint(p1);
		}
		//System.out.println("输出polygon中存储的所有点的坐标:");
		//polygon.shuchu();
		System.out.println("The total area is " + polygon.Area(pointNum));
	}

}
