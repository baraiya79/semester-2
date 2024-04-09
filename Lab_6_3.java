/*Create a class named 'Member' having the following members:
1. Name
2. Age
3. Phone number
4. Address
5. Salary
It also has a method named 'printSalary' which prints the salary 
of the members.
Two classes 'Employee' and Manager' inherits the 'Member' class. 
The 'Employee' and 'Manager' classes have data members 
'specialization' and 'department' respectively. Now assign name, 
age, phone number address and salary to an employee and a manager 
by making an object of both of these classes and print the same 
along with specialization and department respectively. */

import java.util.*;
class Member {
    String name;
    int age;
    double phone_Number;
    String address;
    int salary;

    Member(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :");
        name = sc.nextLine();
        System.out.println("Enter the Age :");
        age = sc.nextInt();
        System.out.println("Enter the Phone Number :");
        phone_Number = sc.nextDouble();
        System.out.println("Enter the Adress :");
        sc.next();
        address = sc.nextLine();
        System.out.println("Enter the Salary :");
        salary = sc.nextInt();
        sc.close();
    }
    public void printSalary(){
        System.out.println("Your Salary ="+salary);
    }
}
class Employee extends Member{
    String specialization;
    public Employee(){
        super(); 
        this.specialization = "";
    }
}
class Manager extends Member {
    String department;
    public Manager (){
        super();
        this.department = "";
    }
}

public class Lab_6_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();
        System.out.println("Enter the specialization of employee : ");
        sc.next();
        emp.specialization = sc.nextLine();

        Manager man = new Manager();
        System.out.println("Enter the Department of Manager : ");
        man.department = sc.nextLine();

        System.out.println(emp.name);
        System.out.println(emp.age);
        System.out.println(emp.phone_Number);
        System.out.println(emp.address);
        emp.printSalary();
        System.out.println(emp.specialization);

        System.out.println(man.name);
        System.out.println(man.age);
        System.out.println(man.phone_Number);
        System.out.println(man.address);
        man.printSalary();
        System.out.println(man.department);
    }
}