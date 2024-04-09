import java.util.Scanner;
public class Palindrome {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String = ");
        String name = sc.nextLine();
        boolean flag = true;
        for( int i=0 ; i < name.length()/2;i++){
            if(name.charAt(i) != name.charAt(name.length()-i-1) ){  
                flag = false;
            }
        }
        if(flag == true){
            System.out.println(name+" is palindrome.");
        }
        else{
            System.out.println(name+" is not palindrome.");
        }
    }
}
