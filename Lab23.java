import java.util.*;
public class Lab23 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number =");
    double a=sc.nextDouble();
    System.out.print("Enter the second number =");
    double b=sc.nextDouble();
    System.out.print("Enter the operation =");
    //sc.next();for upto space string
    //sc.nextLine();for full string
    //char a = sc.next().charAt(0);
    char str = sc.next().charAt(0);
    switch (str) {
        case '+': System.out.println(a+b); break;
        case '-': System.out.println(a-b); break;
        case '*': System.out.println(a*b); break;
        case '/': 
        if(b != 0)
        System.out.println(a/b);
        else {
        System.out.println("Eror ! => Enter non zero number in denomenater."); 
        b=sc.nextDouble();
        System.out.println(a/b);
        }
        break;
        case '%': System.out.println(a%b); break;
        default : System.out.println("Wrong Input. \n Please Enter Right Input.");
    }
    }
}
