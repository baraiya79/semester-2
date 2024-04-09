 //Write a program to create circle class with area function to ƒnd area of circle.
 import java.util.Scanner;
 class Circle{
    double radius;
    double area;
    void areaCircle(double radius){
        this.radius = radius;
        area = Math.PI*radius * radius ;
    }
 }

public class Lab_5_1 {
    public static void main(String[] args0){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a radius of Circle = ");
        double r = sc.nextDouble();
        Circle c = new Circle();
        c.areaCircle(r);
        System.out.println(c.area);
    }
}
