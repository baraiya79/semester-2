//WAP that counts the number of objects created using static.
 class Cat{
    static int catCount=0;
    String name;
    int age;
    Cat(){
        catCount++;
    }
 }
public class Lab_5_6 {
    public static void main(String[] args){
        Cat cat1=new Cat();
        System.out.println(Cat.catCount);
        Cat cat2=new Cat();
        System.out.println(Cat.catCount);
    }
}
