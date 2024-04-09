import java.util.*;
public class LAB44 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr= new int[4];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter the number in the array ["+i+"] = ");
            arr[i]=sc.nextInt();
        }
        System.out.println("================================================");
        for(int i=arr.length-1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}
