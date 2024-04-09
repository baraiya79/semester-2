import java.util.Scanner;

class Triangle{
	int x1,y1,x2,y2,x3,y3;
    double a,b,c,s;
	double dist;
	public Triangle(int x1,int y1,int x2,int y2,int x3,int y3){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
        a = Math.sqrt(Math.pow((this.x1-this.x2), 2) + Math.pow((this.y1-this.y2), 2));
        b = Math.sqrt(Math.pow((this.x2-this.x3), 2) + Math.pow((this.y2-this.y3), 2));
        c = Math.sqrt(Math.pow((this.x3-this.x1), 2) + Math.pow((this.y3-this.y1), 2));
        s = (a+b+c)/2.0;
        // System.out.println(s);
	}
	public double Area(){
		double area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        // System.out.println(area);
		return area;
	}

}
public class HeronesFormula{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coordinates of point 1 : ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter coordinates of point 2 : ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		System.out.println("Enter coordinates of point 3 : ");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		System.out.println("Enter coordinates of point you want to find : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		Triangle a1 = new Triangle(x,y,x1,y1,x2,y2);
		Triangle a2 = new Triangle(x,y,x1,y1,x3,y3);
		Triangle a3 = new Triangle(x,y,x2,y2,x3,y3);
		Triangle a = new Triangle(x1,y1,x2,y2,x3,y3);
		if((Math.floor(a1.Area()) + Math.floor(a2.Area()) + Math.floor(a3.Area()) )==a.Area())
		{
			System.out.println("Point is inside the triangle.");
		}
		else{
			System.out.println("Point is outside the triangle.");
		}
	}
}
