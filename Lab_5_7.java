// Write a program in Java to demonstrate use of this keyword. Check whether this can access the Static variables of the class or not.

import java.util.Scanner;

class Box{
	static int length;
	static int breadth;
	static int height;
	Box(int length,int breadth,int height){
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	public void displayValue(){
		System.out.println("Length = "+length+"\nBreadth = "+breadth+"\nHeight = "+height);
	}
}


public class Lab_5_7{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of length : ");
	int l = sc.nextInt();
	System.out.println("Enter value of breadth : ");
	int b = sc.nextInt();
	System.out.println("Enter value of height : ");
	int h = sc.nextInt();
	Box b1 = new Box(l,b,h);
	b1.displayValue(); 
	sc.close();
	}
}
