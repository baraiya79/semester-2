import java.util.Scanner;
public class LAB47 {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i=1,j=1;
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		for(i=1;i<=s.length();i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(s.charAt(j-1));
			}
			System.out.print("\n");
		}
	}
}
