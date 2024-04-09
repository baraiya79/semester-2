/*Create a class named Bank_Account with data memebers accountNo, userName, 
email, accountType and accountBalance, 
Also create methods getAccountDetails() and displayAccountDetails().
 */
import java.util.*;

class Bank_Account{
    double accountNo;
    String userName;
    String email;
    String accountType;
    double accountBalance;

    Bank_Account()
	{
		accountNo = 0.0;
		userName = null;
		email = null;
		accountType = null;
		accountBalance = 0;
	}

    public void getAccountDetails(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Account number : ");
        this.accountNo = sc.nextDouble();
        System.out.println("Enter the Account User Name  : ");
        sc.nextLine();
        this.userName = sc.nextLine();
        System.out.println("Enter the E-mail ID : ");
        this.email = sc.nextLine();
        System.out.println("Enter the Account Type : ");
        this.accountType = sc.nextLine();
        System.out.println("Enter the Account Balance : ");
        this.accountBalance = sc.nextDouble();
    }

    public void displayAccountDetails(){
        System.out.println("\n====================================================================================\n");
        System.out.println("Account Number = "+ accountNo);
        System.out.println("Account User Name = "+ userName);
        System.out.println("E-mail = "+ email);
        System.out.println("Account Type = "+ accountType);
        System.out.println("Account Balance = "+ accountBalance);
        System.out.println("\n====================================================================================\n");
    }
}

public class Lab_5_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bank_Account firstAccount = new Bank_Account();
        firstAccount.getAccountDetails();
        firstAccount.displayAccountDetails();
    }
}
