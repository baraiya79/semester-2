/*Design a class named MyPoint to represent a point with x and y coordinates. The class contains:
a. The data fields x and y that represent the coordinates with 
getter methods.
b. A no-arg constructor that creates a point (0, 0).
c. A constructor that constructs a point with specified 
coordinates.
d. A method named distance that returns the distance from this 
point to a specified point of the MyPoint type.
e. A method named distance that returns the distance from this 
point to another point with specified x- and y-coordinates. */
import java.util.Scanner;
class MyPoint{
	double x,y;
	public MyPoint(){
		this.x = 0;
		this.y = 0;
	}
	public MyPoint(double x,double y){
		this.x = x;
		this.y = y;
	}
	public double getx(){
		return x;
	}
	public double gety(){
		return y;
	}
	public double distance(double x,double y){
        x = this.x - x;
        y = this.y - y;
		double ans = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		return ans;
	}
	public double distance(MyPoint p){
		double x = this.getx() - p.getx();
		double y = this.gety() - p.gety();
		double ans =  Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		return ans;
	}
}
public class Lab_6_4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter coordinates of point : ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.print("\nEnter coordinates of another point : ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
        MyPoint point1 = new MyPoint(x1,y1);
        MyPoint point2 = new MyPoint(x2, y2);
        System.out.println("Distance between point1 and point2: " + point1.distance(point2));
        System.out.println("Distance between point1 and (0, 0): " + point1.distance(0, 0));

        sc.close();
	}
}