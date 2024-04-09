/*Write a method for computing x^y doing repetitive multiplication. X 
and y are of type integer and are to be given as command line 
arguments. Raise and handle exception(s) for invalid values of x 
and y.  */

public class Lab_8_1 {
    public static void main(String[] args){
         try{
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int z = 1;
            for(int i = 0; i < y ; i++){
                z = z*x ;
            }
            System.out.println("X to Y : " + z);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
