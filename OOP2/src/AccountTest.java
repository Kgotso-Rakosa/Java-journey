
import java.util.Scanner;


/**
 *This is to test the Account program
 * @author KGOTSO
 */
public class AccountTest {
    //main method
    public static void main(String[] args) {
        //declaration of variables
        String name;
        int accountNumber;
        double balance,depositAmount,withdrawalAmount;
        
        //scanner object
        Scanner input=new Scanner(System.in);
        
        //get user data
        System.out.println("What is your name: ");
        name=input.nextLine();
        
        System.out.println("Insert your account Number: ");
        accountNumber=input.nextInt();
        
        //constructor object
        Account objAccount=new Account();
        
        //pass object variables
        objAccount.setName(name);
        objAccount.setAccountNumber(accountNumber);
        
        //make a deposit
        System.out.print("Deposit; R ");
        depositAmount=input.nextDouble();
        objAccount.makeDeposit(depositAmount);
        
        //make withdrawal
        System.out.print("Withdraw: R");
        withdrawalAmount=input.nextDouble();
        objAccount.makeWithdrawal(withdrawalAmount);
        
        //dispaly 
        System.out.println(objAccount.toString());
    }
}
