import java.util.*;
public class Lab31 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks of five subjects = (out of hundred)");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        float pr = (n1+n2+n3+n4+n5)/5.0f;
        if(pr >= 60 ){
            System.out.println("First Division");
        }
        else if(pr >= 50){
            System.out.println("Sacond Division");
        }
        else if(pr >= 40){
            System.out.println("Third Division");
        }
        else{
            System.out.println("Sorry! You are fail");
        }
    }
}