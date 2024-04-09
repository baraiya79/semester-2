/*Write an application that executes two threads. One thread 
displays "Good Morning" every 1000 milliseconds & another thread 
displays "Good Afternoon" every 3000 milliseconds. Create the 
threads by implementing the Runnable interface. */

import java.io.*;
class Morning implements Runnable{
	@Override
	public void run(){
		while(true){
            try{
                System.out.println("Good Morning");
                Thread.sleep(1000);
            } catch(Exception e){
                e.printStackTrace();
            }
	    }
    }
}
class Afternoon implements Runnable{
    @Override
    public void run(){
        while(true){
            try{
                System.out.println("Good Afternoon");
                Thread.sleep(3000);
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class Lab_9_1{
	public static void main(String[] args) {
		Morning m = new Morning();
		Afternoon a = new Afternoon();
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(a);
		t1.start();
		t2.start();
	}
}