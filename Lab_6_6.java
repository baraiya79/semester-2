//Demonstrate the use of Super Keyword.

import java.util.Scanner;
class ParentClass{
	public void display(){
		System.out.println("Parent Class");
	}
}
class ChildClass extends ParentClass{
	public void display(){
		super.display();
		System.out.println("Child Class");
	}
}
public class Lab_6_6{
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.display();
	}
}