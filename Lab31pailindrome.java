import java.util.Scanner;
public class Lab31pailindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer or string");
		String s = sc.next();
		String rev = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("Is a Palindrome");
		}
		else
		{
			System.out.println("Is not a Palindrome");
		}
	}
}