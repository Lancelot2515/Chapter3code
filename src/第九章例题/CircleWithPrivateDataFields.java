package 第九章例题;

public class CircleWithPrivateDataFields {
	private double radius=1;
	private static int numberOfObjects=0;
	public  CircleWithPrivateDataFields() {
		numberOfObjects++;
	}
	public CircleWithPrivateDataFields(double newradius) {
		radius=newradius;
		
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double newradius) {
		radius=(newradius>=0)?newradius:0;
	}
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
}

