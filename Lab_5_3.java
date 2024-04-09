import java.util.*;

class sentences {
    String s;
    int count_a ;
    int count_e ;
    int count_i ;
    int count_u ;
    int count_o ;

    public sentences(){
		this.count_a = 0;
		this.count_e = 0;
		this.count_i = 0;
		this.count_o = 0;
		this.count_u = 0;
    }

    
	public void processSentence(String s){
    for(int i=0;i<s.length();i++){

			if(s.charAt(i)=='a'||s.charAt(i)=='A'){
				count_a++;
			}
			if(s.charAt(i)=='e'||s.charAt(i)=='E'){
				count_e++;
			}
			if(s.charAt(i)=='i'||s.charAt(i)=='I'){
				count_i++;
			}
			if(s.charAt(i)=='o'||s.charAt(i)=='O'){
				count_o++;
			}
			if(s.charAt(i)=='u'||s.charAt(i)=='U'){
				count_u++;
			}
		}
    }
}

public class Lab_5_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sentences sentence = new sentences();
        while(true){
            System.out.println("Please Enter String an ( Enter the quit for stop ) = ");
            String s = sc.nextLine();
            if(s.equalsIgnoreCase("quit")){
                break;
            }
            else{
                sentence.processSentence(s);
            }
        }
        System.out.println("a = "+sentence.count_a);
        System.out.println("e = "+sentence.count_e);
        System.out.println("i = "+sentence.count_i);
        System.out.println("o = "+sentence.count_o);
        System.out.println("u = "+sentence.count_u);
    }
}
