// The abstract vegetable class has three subclasses named Potato, 
//Brinjal and Tomato. Write a java program that demonstrates how to
//establish this class hierarchy. Declare one instance variable of 
//type String that indicates the color of a vegetable. Crete and 
//display instances of these objects. Override the toString() method 
//of object to return a string with the name of vegetable and its 
//color. 
/**
 * Lab_7_1
 */
abstract class Vegetable{
    String name;
    String color;
    abstract public String toString();
}
class Potato extends Vegetable{
    public Potato(String name,String colour){
        super.name= name;
        super.color= colour;
    }
   public String toString(){
    return "Name : "+super.name+"  || Color : "+super.color;
    }
}
class Brinjal extends Vegetable{
    public Brinjal(String name,String colour){
        super.name= name;
        super.color= colour;
    }
   public String toString(){
    return "Name : "+super.name+" || Color : "+super.color;
    }
}
class Tomato extends Vegetable{
    public Tomato(String name,String colour){
        super.name= name;
        super.color= colour;
    }
   public String toString(){
    return "Name : "+super.name+"  || Color : "+super.color;
    }
}
public class Lab_7_1{
    public static void main(String[] args){
        Vegetable p = new Potato("Potato","Brown");
        Vegetable b = new Brinjal("Brinjal","Purple");
        Vegetable t = new Tomato("Tomato","Red");
        System.out.println(p.toString());
        System.out.println(b.toString());
        System.out.println(t.toString());
    }
}