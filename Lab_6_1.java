// Declare a class called student having following data members:id_no, no_of_subjects_registered, subject_code, 
//subject_credits, grade_obtained and spi. De ne constructor and calculate_spi methods.De ne main to instantiate an array 
//for objects of class student to process data of n students to be given as command line arguments.
import java.util.*;
class Student{
    double id_no;
    int no_of_subjects_registered;
    static String subject_code[];
    static int subject_credits[];
    String grade_obtained[];
    double spi;

    Student(double id_no, int no_of_subjects_registered) {
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = new String [this.no_of_subjects_registered];
        this.subject_credits = new int [this.no_of_subjects_registered];
        this.grade_obtained = new String[this.no_of_subjects_registered];
    }
    public void getStudentDetails(){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<this.no_of_subjects_registered;i++){
            System.out.println("Enter Subject Code "+(i+1)+" : ");
            this.subject_code[i] = sc.next();
            System.out.println("Enter Subject Credit "+(i+1)+" : ");
            this.subject_credits[i] = sc.nextInt();
            System.out.println("Enter grade obtained of subject "+(i+1)+" : ");
            this.grade_obtained[i] = sc.next();
        }
    }
    public void calculate_spi(){
        double sum=0,totalCredits=0;
        for(int i=0 ; i<no_of_subjects_registered;i++){
            totalCredits += this.subject_credits[i]; 
            switch(this.grade_obtained[i]){
                case "A+":
                    sum += 10*this.subject_credits[i];
                    break;
                case "A":
                    sum += 9*this.subject_credits[i];
                    break;
                case "B+":
                    sum += 8*this.subject_credits[i];
                    break;
                case "B":
                    sum += 7*this.subject_credits[i];
                    break;
                case "C+":
                    sum += 6*this.subject_credits[i];
                    break;
                case "C":
                    sum += 5*this.subject_credits[i];
                    break;
                case "D+":
                    sum += 4*this.subject_credits[i];
                    break;
                case "D":
                    sum += 3*this.subject_credits[i];
                    break;
                case "E+":
                    sum += 2*this.subject_credits[i];
                    break;
                case "E":
			        sum += 1*this.subject_credits[i];	
                    break;
                default:
                    System.out.println("Wrong input");
            }
        }
		for(int i=0;i<no_of_subjects_registered;i++){
			this.spi = (double)(sum)/(double)(totalCredits);
		}
		System.out.println("spi of student = "+this.spi);
	}
}
public class Lab_6_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int student_no = Integer. parseInt(args[0]);
        Student [] stu = new Student[student_no];

        for(int i=0; i<student_no; i++) {
            System.out.println("Enter the id number of the student " + (i+1) +" :");
            double id_no = sc.nextDouble();
            System.out.println("Enter the total subject registered of student " + (i+1) +" :");
            int no_of_subjects_registered = sc.nextInt();
            stu [i] = new Student(id_no, no_of_subjects_registered);
            stu [i].getStudentDetails();
        }
        for(int i=0; i<student_no; i++) {
            stu [i].calculate_spi();
        }
    }
}