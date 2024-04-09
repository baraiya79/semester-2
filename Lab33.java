import java.util.*;
public class Lab33 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int rem = 0;
        for(int i=1 ; i<=n ; i++){
            if(n % i == 0){
                rem +=1;
            }
        }
        if(rem==2){
            System.out.println("The given number is Prime.");
        }
        else{
            System.out.println("The given number is not a prime.");
        }
        int flag =0 ;
        for(int i=2 ; i<n/2; i++){
            if(n % i == 0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("The given number is Prime.");
        }
        else{
            System.out.println("The given number is not a prime.");
        }
    }
}
