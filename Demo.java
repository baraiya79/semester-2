import java.util.Scanner;
public class Demo {

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter the First Number =");
      int a=sc.nextInt();  
      System.out.print("Enter the sacond Number =");
      int b=sc.nextInt();
      System.out.println(a+"+"+b+"="+(a+b));
    }
}