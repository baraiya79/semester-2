import java.util.*;

public class Lab45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :-");
        String str = sc.nextLine();
        int i = 0;
        for (char c : str.toCharArray()) {
            i++;
        }
        System.out.println("String Length =" + i);
        for (int j = i / 2; j < i; j++) {
            System.out.print(str.charAt(j));
        }
        System.out.println();
        System.out.println(str.substring(i / 2, i));
    }
}
