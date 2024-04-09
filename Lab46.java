/*Write an application that searches through its command-line argument. If an argument is found that does not begin with 
and upper case letter, display error message and terminate. */

public class Lab46 {
    public static void main(String[] args){
        for(int i=0;i<args.length;i++){
            if(args[i].charAt(0)>=65 &&  args[i].charAt(0)<=91)
            {
                continue;
            }
            else
            {
                System.out.println("Error occured");
                return ;
            }
        }
        System.out.println("All is well");
    }
}
