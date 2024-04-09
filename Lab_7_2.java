//Write a program that illustrates interface inheritance. Interface 
//A is extended by A1 and A2. Interface A12 inherits from both A1 
//and A2.Each interface declares one constant and one method. Class 
//B implements A12.Instantiate B and invoke each of its methods. 
//Each method displays one of the constants.

interface A {
    int CONSTANT_A = 10;
    public void methodA();
}
interface A1 extends A {
    int CONSTANT_A1 = 20;
    public void methodA1();
}
interface A2 extends A {
    int CONSTANT_A2 = 30;
    public void methodA2();
}
interface A12 extends A1, A2 {
    int CONSTANT_A12 = 40;
    public void methodA12();
}
class B implements A12 {
    public void methodA() {
        System.out.println("Constant A: " + CONSTANT_A);
    }

    public void methodA1() {
        System.out.println("Constant A1: " + CONSTANT_A1);
    }

    public void methodA2() {
        System.out.println("Constant A2: " + CONSTANT_A2);
    }

    public void methodA12() {
        System.out.println("Constant A12: " + CONSTANT_A12);
    }
}

public class Lab_7_2 {
    public static void main(String[] args) {
        B b = new B();
        b.methodA(); 
        b.methodA1();
        b.methodA2();
        b.methodA12();
    }
}