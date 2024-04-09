import java.util.*;
public class Lab32 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number = ");
    int a=sc.nextInt();
    System.out.println("Enter the sacond number = ");
    int b=sc.nextInt();
    System.out.println("Enter the third number = ");
    int c=sc.nextInt();

    if(a>b){
        if(a>c){
            System.out.println(a +" is largest");
        }
        else{
            System.out.println(c+" is largest");
        }
    }
    else{
        if(b>c){
            System.out.println(b + " is Largest");
        }
        else{
            System.out.println(c + " is Largest");
        }
    }
    }
}
