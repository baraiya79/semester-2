/*Write a program that counts number of characters, words, and lines
in a file. Use exceptions to check whether the file that is read
exists or not. */
import java.io.*;
import java.util.*;

public class Lab_10_1 {

    public static void main(String[] args) {
        File f1 = new File("abc.txt");
        int line = 0 , words = 0 ;
        try {
            String str = "" , str2 = "" ;
            Scanner sc = new Scanner(f1);
            
            while (sc.hasNextLine()) {
                str = sc.nextLine();
                line++;
            }
            sc = new Scanner(f1);
            while (sc.hasNext()) {
                str2 = sc.next();
                words++;
            }
            sc.close();
            System.out.println("Line =" + line);
            System.out.println("Characters =" + str.length());
            System.out.println("Words =" + words);

        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}