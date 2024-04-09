import java.util.Scanner;
public class LAB45 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = sc.nextLine();
		System.out.println("Length of string = "+s.length());
		int i;
		System.out.print("Second half of string = ");
		for(i=(s.length())/2;i<s.length();i++)
		{
			System.out.print(""+s.charAt(i));
		}
	}
}