package 第九章例题;

public class CircleWithStaticMembers {
	double radius;
    static int numberOfObjects = 0;
    CircleWithStaticMembers(){
    	radius=1;
        numberOfObjects++;
    }
    CircleWithStaticMembers(double radius){
        this.radius=radius;
        numberOfObjects++;
    }

    static int getNumberOfObjects(){
        return numberOfObjects;
    }

    double getArea(){
        return radius*radius*Math.PI;
    }
}
