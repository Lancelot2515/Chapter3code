package 第九章例题;

public class TestSimpleCircle {
	public static void main(String[] args) {
		Simplecircle circle1 = new Simplecircle();
		System.out.println("The area of the circle of radius"+circle1.radius+" is "+circle1.getArea());
		Simplecircle circle2 = new Simplecircle(25);
		System.out.println("The area of the circle of radius"+circle2.radius+" is "+circle2.getArea());
		Simplecircle circle3 = new Simplecircle(125);
		System.out.println("The area of the circle of radius"+circle3.radius+" is "+circle3.getArea());
		circle2.radius=100;
		System.out.println("The area of the circle of radius"+circle2.radius+" is "+circle2.getArea());
	}
}
class Simplecircle{
	double radius;
	public Simplecircle() {
		radius=1;
	}
	Simplecircle(double newRadius){
		radius=newRadius;
	}
	double getArea() {
		return radius*radius*Math.PI;
	}
	double getPerimeter() {
		return 2*radius*Math.PI;
	}
	void setRadius(double newRadius) {
		radius=newRadius;
	}
}
