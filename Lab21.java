import java.util.*;
public class Lab21 {

    public static void main(String[] args) {
        int n1=Integer.parseInt(args[0]);
        int n2=Integer.parseInt(args[1]);

        System.out.println(n1+"+"+n2+"="+(n1+n2));
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first Number =");
        int n3=sc.nextInt();
        System.out.print("Enter the second Number =");
        int n4=sc.nextInt();
        System.out.println(n3+"+"+n4+"="+(n3+n4));
    }
}