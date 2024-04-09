/*WAP to create Account class, which is representing a bank account 
where we can deposit and withdraw money. if we want to withdraw 
money which exceed our bank balance? We will not be allowed, create 
InSufficientFundException to handle above situation and display 
proper error message.
 */

import java.util.Scanner;

class Account{
	int bank_balance;
	public int deposit(int d){
		bank_balance = bank_balance + d;
		return bank_balance;
	}
	public int withdraw(int w){
		bank_balance = bank_balance - w;
		return bank_balance;
	}
}
class InsufficientFundException extends Exception{
	public InsufficientFundException(){
		super();
	}
}

public class Lab_8_3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a = new Account();
		System.out.println("Enter Your Bank Balance : ");
		a.bank_balance = sc.nextInt();
		System.out.println("Do you want to Deposit or Withdraw your money : ");
		String s = sc.next();
		switch(s){
		case "Deposit":
			System.out.println("Enter The deposit Amount : ");
			int d = sc.nextInt();
			System.out.println("Current Bank balance = "+ a.deposit(d));
			break;
		case "Withdraw":
			try{
                System.out.println("Enter The withdraw Amount : ");
                int w = sc.nextInt();
                if(w > a.bank_balance){
                    throw new InsufficientFundException();
                }
                else{
                    System.out.println(" Current Bank balance = "+ a.withdraw(w));
                }
			}
			catch(InsufficientFundException e){
				System.out.println("Error! : Insufficient Balance");
				System.out.println("Your Bank balance = "+a.bank_balance);
			}
			break;
		}
	}
}