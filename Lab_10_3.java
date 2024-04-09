/*Write an application that reads a file and counts the number of 
occurrences of digit 5. Supply the file name as a command-line 
argument. */
import java.io.*;
public class Lab_10_3{
	public static void main(String[] args) {
		try{
		String filename = args[0];
		File f = new File(filename);
		FileReader reader = new FileReader(filename);
		int count=0;
		int temp = reader.read();
		while(temp!=-1){
			char c = (char)temp;
			temp = reader.read();
			if(c == '5'){
				count++;
			}
		}
		System.out.println("Digit 5 is repeated "+count+" times.");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}