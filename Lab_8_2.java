/* Write a complete program to accept N integer numbers from the 
command line. Raise and handle exceptions for following cases : 
a. - when a number is –ve 
b. - when a number is evenly divisible by 10 
c. - when a number is greater than 1000 and less than 2000 
d. - when a number is greater than 7000 
Skip the number if an exception is raised for it, otherwise add it 
to find total sum. */

class MyException extends Exception{
    public MyException(){
        super();
    }
}

public class Lab_8_2 {
    public static void main(String[] args){
       
        int sum = 0;
        for(int  i =0 ; i < args.length ; i++){
            try{
                int nums = Integer.parseInt(args[i]);
                if(nums<0 || nums %  20 == 0 || (nums > 1000 && nums < 2000 ) || nums > 7000){
                    throw new MyException();
                }  
                else{
                    sum = sum + nums;
                }
            }
            catch(MyException me){
                me.printStackTrace();
            }
        }
        System.out.println("Total  Sum " + sum);
    }
}