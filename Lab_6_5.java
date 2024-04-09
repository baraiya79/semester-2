/*Create a class named ThreeDPoint to model a point in a threedimensional space. Let ThreeDPoint be derived from MyPoint with 
following additional features:
a. A data fields named z that represents the z-coordinate.
b. A no-arg constructor that creates a point (0, 0, 0).
c. A constructor that constructs a point with three specified 
coordinates.
d. A get method that returns the z value.
e. Override the distance method to return the distance between 
two points in the three-dimensional space.
f. Write a program that creates two points (0, 0, 0) and (10, 
30, 25.5) and display the distance between the two points. */
class ThreeDPoint extends MyPoint{
	double z;
	ThreeDPoint(){
		this.z = 0;
		this.x = 0;
		this.y = 0;
	}
	ThreeDPoint(double x,double y,double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public double getz(){
		return z;
	}
	public double distance(double x,double y,double z){
        x = this.x - x;
        y = this.y - y;
        z = this.z - z;
		double ans =  Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
		return ans;
	}
	public double distance(ThreeDPoint p){
		double x = this.x-p.getx();
		double y = this.y - p.gety();
		double z = this.z-p.getz();
		double ans = Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
		return ans;
	}
}

public class Lab_6_5{
	public static void main(String[] args){
	ThreeDPoint point1 = new ThreeDPoint();
	ThreeDPoint point2 = new ThreeDPoint(10,30,25.5);
	System.out.println("Distance between (0,0,0) and (10,30,25.5) = "+point1.distance(point2));
	}
}