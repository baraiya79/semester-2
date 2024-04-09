import java.util.*;
public class Lab42 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string = ");
    String s = sc.nextLine();
    int i,cons=0,vow=0;
    for(i=0;i<s.length();i++)
    {	
        if((s.charAt(i)<='z' && s.charAt(i)>='a') || (s.charAt(i)<='Z' && s.charAt(i)>='A'))
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
            {
                vow++;
            }
            else
            {
                cons++;
            }
        }
        else
        {

        }
    }
    System.out.println("Consonants = "+cons);
    System.out.println("Vowels = "+vow);
}
}


