//Demonstrate the use of Final Keyword.
import java.util.Scanner;
class Parent{
	final int n = 120;
	Parent(){
		//this.n = ; we canit asin forther value of n
	}
}
class Child extends Parent{
	Child(){
		super();
		System.out.println("Final value = "+n);
	}
}
public class Lab_6_7{
	public static void main(String[] args) {
		Child c = new Child();
	}
}