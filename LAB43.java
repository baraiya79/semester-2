import java.util.*;
public class LAB43 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr= new int[4];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter the number in the array ["+i+"] = ");
            arr[i]=sc.nextInt();
        }
        double avg = 0.0;
        for(int i=0; i<arr.length; i++){
            avg = avg + arr[i];
        }
        avg = avg/arr.length;
        System.out.println("Average is = " + avg);
    }
}
