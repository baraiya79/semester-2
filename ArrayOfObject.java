import java.util.Scanner;
 /**
  * Student
  */    
/* Declare a class called student having following data 
members:id_no, no_of_subjects_registered, subject_code, 
subject_credits, grade_obtained and spi. Define constructor and 
calculate_spi methods.Define main to instantiate an array for 
objects of class student to process data of n students to be given 
as command line arguments.*/
class Student {
    int id_no;
    int no_of_subjects_registered;
    int [] subject_code;
    int [] subject_credits;
    String [] grade_obtained;
    double spi;

    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student id no :");
        id_no = sc.nextInt();
        System.out.println("Enter the no of subject registerd : ");
        no_of_subjects_registered = sc.nextInt();
        subject_code = new int[ no_of_subjects_registered ];
        subject_credits = new int[ no_of_subjects_registered ];
        grade_obtained = new String[ no_of_subjects_registered ];

        for(int i=0 ; i < no_of_subjects_registered ; i++){
            System.out.println("Enter the subject code of subject "+(i+1)+" :");
            subject_code [i] = sc.nextInt();
            System.out.println("Enter the subject credits of subject "+(i+1)+" :");
            subject_credits [i] = sc.nextInt();
            System.out.println("Enter the grade obtained in subject "+(i+1)+" :");
            sc.next();
            grade_obtained [i] = sc.nextLine();
        }
        sc.close();
    }
    public double count_spi(){
        //logic of count spi.
        return 0.0;
    }
}
public class ArrayOfObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of total students : ");
        int temp = sc.nextInt();
        Student [] stu = new Student[temp];
        for(int i = 0 ; i<temp ; i++){
            stu[i] = new Student();
        }
        for(int i = 0 ; i<temp ; i++){
            System.out.println("Spi of student "+(i+1)+"is = "+stu[i].count_spi());
        }
        sc.close();
    }
}
