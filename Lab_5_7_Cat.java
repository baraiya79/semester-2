//Write a program in Java to demonstrate use of this keyword. Check 
//whether this can access the Static variables of the class or not.

class Cat{
    static int catCount=0;
    static int age=0;
    Cat(int catCount , int age){
        this.age = age;
        this.catCount = catCount;
    }
 }
public class Lab_5_7 {
    public static void main(String[] args){
        Cat cat1=new Cat(1,5);
        System.out.println(Cat.catCount);
        System.out.println(Cat.age);
    }
}