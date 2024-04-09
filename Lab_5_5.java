/* De ne class for Complex number with real and imaginary as data members. Create its contructor, overload the constructors. 
Also de ne addition method to add two complex objects. */
import java.util.Scanner;
class Complex_numbers{
	int real;
	int imaginary;
	Complex_numbers(int real,int imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}
	public Complex_numbers add(Complex_numbers n2)
	{
		int r3 = this.real+n2.real;
		int c3 = this.imaginary+n2.imaginary;
		System.out.println("Addition = "+r3+" + "+c3+"i");
		Complex_numbers n3 = new Complex_numbers(r3,c3);
		return n3;
	}
}
public class Lab_5_5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter real number of n1 : ");
		int r1 = sc.nextInt();
		System.out.print("Enter imaginary number of n1 : ");
		int c1 = sc.nextInt();
		System.out.print("Enter real number of n2 : ");
		int r2 = sc.nextInt();
		System.out.print("Enter imaginary number of n2 : ");
		int c2 = sc.nextInt();
		Complex_numbers n1 = new Complex_numbers(r1,c1);
		Complex_numbers n2 = new Complex_numbers(r2,c2);
		n1.add(n2);
	}
}