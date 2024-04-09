import java.util.Scanner;
public class LAB47_1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i=1,j=1,k,l;
		System.out.print("Enter value of n : ");
		int n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		for(i=n+1;i<=(2*n-1);i++)
		{
			for(j=2*n;j>=i+1;j--)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}