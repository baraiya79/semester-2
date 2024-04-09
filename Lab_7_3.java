//The Transport interface declares a deliver () method. The abstract 
//class Animal is the super class of the Tiger, Camel, Deer and 
//Donkey classes. The Transport interface is implemented by the 
//Camel and Donkey classes. Write a test program that initialize an 
//array of four Animal objects. If the object implements the 
//Transport interface, the deliver () method is invoked.
interface Transport{
	public void deliver();
}
abstract class Animal{
	String s;
	abstract public void animal();
}
class Tiger extends Animal{
	public void animal(){
		System.out.println("Tiger");
	}
}
class Camel extends Animal implements Transport{
	public void animal(){
		System.out.print("Camel --> ");
	}
	public void deliver(){
		System.out.println("Deliver Method Invoked ");
	}
}
class Deer extends Animal{
	public void animal(){
		System.out.println("Deer");
	}
}
class Donkey  extends Animal implements Transport{
	public void animal(){
		System.out.print("Donkey --> ");
	}
	public void deliver(){
		System.out.println("Deliver Method Invoked ");
	}
}
public class Lab_7_3{
	public static void main(String[] args) {
		Animal[] a = {new Tiger(),new Camel(),new Deer(),new Donkey()};
		for(int i=0;i<4;i++){
			if(a[i] instanceof Transport){
				((Animal)a[i]).animal();
				((Transport)a[i]).deliver();
			}else{
				((Animal)a[i]).animal();
			}
		}
	}
}