/*Refine the student manager program to manipulate the student 
information from files by using the BufferedReader and 
BufferedWriter. */

import java.io.*;

public class Lab_11_1 {
    public static void main(String[] args) {
        String filename = "abc.txt";
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            bw.write("Vishal,18\n");
            bw.write("Aum,19\n");
            bw.write("Prince,20\n");
            bw.write("Aman,56");
            bw.close();
            System.out.println("Successed!");
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while((line =  br.readLine())!=null){
                String temp [] = line.split(",");
                String name = temp[0];
                int age = Integer.parseInt(temp[1]);
                Student st = new Student(name, age);
                System.out.println(st);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

class Student{
    String name;
    int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "Student Name = " + name + " , Age = "+ age;
    }
}